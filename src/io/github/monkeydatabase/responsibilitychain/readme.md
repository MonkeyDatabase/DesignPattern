## 问题场景

1. 用程序实现一个OA系统的采购审批项目
2. 如果金额不超过1000，需要辅导员审批即可完成
3. 如果金额不超过3000，需要副院长审批即可完成
4. 如果金额不超过10000，需要院长审批即可完成
5. 如果金额超过10000，需要校长审批即可完成

## 问题场景的问题方案

1. 定义一个PurchaseHandler，其中的方法通过if-else if-else判断金额范围后转交给正确的角色来审批
2. 不同的Approver接受PurchaseHandler转发来的采购审批请求

## 问题场景的问题方案的问题

> 代码见/schoolpurchase/beforedesign

1. 接收到请求后，按照采购金额调用对应审批者的审批方法完成审批
2. 客户端会使用分支判断if-else if-else或者switch-case来对不同的采购请求处理
   * 如果各个级别的人员审批金额发生变化时，PurchaseHandler中的if-else if-else结构就需要修改
   * 如果增加一个级别用于人员审批，在新加一个级别类后，不仅PurchaseHandler中需要新聚合一个新类，Client类中Purchase还需要修改创建对象的函数，还需要new新级别类
3. 所以要使用责任链模式

## 责任链模式概念

1. 为请求创建一个接收者对象的链，这种模式对请求的发送者和接收者进行解耦
2. 责任链模式通常每个接收者都包含对另一个接收者的引用，如果一个对象不能处理该请求，那么它会把同样的请求传给下一个接收者，以此类推
3. 责任链模式属于行为型模式

## 责任链模式uml

* Handler请求的处理者者，定义了一个处理请求的接口有一个successor的Handler对象用于指向责任链中下一个Handler，还有一个*processRequest()* 方法用于处理请求
* ConcreteHandlerA、ConcreteHandlerB实现或继承了Hanler类，处理自己负责的请求，可以访问它的后继者(责任链中下一个Handler对象)，如果当前请求可以处理则自己处理，如果自己处理不了则交给后继者处理
* Request类是一个请求，Client首先创建一个Handler，传给一个Handler

## 责任链模式应用

> 代码见/schoolpurchase/improve

1. 声明一个Approver抽象类，有各个级别的角色继承该类，并持有指向后继者的引用
2. 声明一个PurchaseRequest作为请求的对象，在责任链中进行传递

## 责任链模式在SpringMVC中的应用

> 代码见/springmvcsample

1. SpringMVC处理流程
   * 当请求到达时，将请求交给DispatchServlet
   * 遍历HandlerMapping，找到对应的HandlerMapping，并得到HandlerExecutionChain(HandlerExecutionChain内部包含了拦截器)
   * 使用HandlerExecutionChain中的Handler遍历HandlerAdapter集合找到支持Handler的HandlerAdapter
   * 使用HandlerAdapter得到ModelAndView
   * 异常处理，前面四个步骤可以发生异常，HandlerExecutionResolver策略解决
   * 根据ModelAndView使用ViewResolver进行解析
   * ViewResolver解析得到View
2. HandlerExecutionChain类中有一个List<HandlerInterceptor>,HandlerExecutionChain将请求交给链上的拦截器进行处理
   * DispatchServlet有一个doDispatch方法
      ```java
      HttpServletRequest processedRequest = request;
      HandlerExecutionChain mappedHandler = null;
      boolean multipartRequestParsed = false;
     
     mappedHandler = getHandler(processedRequest);
     
     HandlerAdapter ha = getHandlerAdapter(mappedHandler.getHandler());
     
     if (!mappedHandler.applyPreHandle(processedRequest, response)) {
     					return;
     				}
     
     mv = ha.handle(processedRequest, response, mappedHandler.getHandler());
     
     mappedHandler.applyPostHandle(processedRequest, response, mv);
      ```
   * HandlerExecutionChain有一个applyPreHandler方法,这个方法里包含了HandlerInterceptor
      ```java
     boolean applyPreHandle(HttpServletRequest request, HttpServletResponse response) throws Exception {
     		HandlerInterceptor[] interceptors = getInterceptors();
     		if (!ObjectUtils.isEmpty(interceptors)) {
     			for (int i = 0; i < interceptors.length; i++) {
     				HandlerInterceptor interceptor = interceptors[i];
     				if (!interceptor.preHandle(request, response, this.handler)) {
     					triggerAfterCompletion(request, response, null);
     					return false;
     				}
     				this.interceptorIndex = i;
     			}
     		}
     		return true;
     	} 
     ```
   * HandlerInterceptor接口有三个方法，
      ```java
     //HandlerAdapter调用handler之前
      default boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)throws Exception {
      
      		return true;
     }
     
     //Handler Adapter调用handler之后，在DispatchServlet渲染view之前
     default void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
     }
     
     //在渲染完view之后，用于释放资源等操作
     default void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
     }
     ```