## 代理模式概念

1. 为一个**对象**提供一个代理对象，以控制对这个对象的访问，即通过代理对象访问目标对象
2. 这样的好处是可以在目标对象实现的基础上，增强额外的功能操作，即扩展目标对象的功能
3. 被代理的对象可以是远程对象、创建开销大的对象、需要安全控制的对象
4. 代理模式有不同的形式，主要的为以下三种 静态代理、动态代理(JDK代理、接口代理)和Cglib代理(可以在内存中动态创建对象完成代理，而不需要实现接口，属于动态代理的一部分)

## 代理模式uml

1. TargetObject即目标对象
2. ProxyObject依赖TargetObject
3. Client依赖ProxyObject，通过ProxyObject访问TargetObject的内容

## 静态代理

静态代理在使用时，需要定义接口或父类，被代理对象(即目标对象)与代理对象一起实现相同的接口或是继承相同的父类

### 应用实例

1. 一个Teacher由于某种原因无法工作，定义一个Proxy去代替Teacher去工作
2. 定义一个接口ITeacherDAO
3. 目标对象TeacherDAO实现ITeacherDAO
4. 使用静态代理方式，需要TeacherDAOProxy也实现ITeacherDAO
5. 调用的时候，通过代理对象的方法来调用目标对象
6. 静态代理中，代理对象和目标对象要实现**相同的接口**，然后通过调用**相同的方法**来调用目标对象的方法

### 优缺点

1. 在不修改目标对象的功能前期下，能通过代理对象对目标功能扩展
2. 因为代理对象需要与目标对象实现一样的接口，所以不同的接口下会有不同的代理类，导致有很多代理类
3. 一旦接口方法增加，所有的代理对象和目标对象都需要维护
4. 个人认为静态代理是更为严格的装饰者模式

## 动态代理

1. 代理对象不需要实现接口，但是目标对象要实现接口，否则**不能**用动态代理
2. 代理对象的生成，利用了JDK的API，动态的在内存中构建代理对象
3. 动态代理也称为JDK代理、接口代理

### 动态代理所需

1. 代理类所在包java.lang.reflect.Proxy,Proxy本身不能被实例化,但它有一些静态方法
2. JDK实现代理只需要使用newProxyInstance方法，但是该方法需要接收三个参数，完整写法为
   ```java
   static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h);
   ```
3. Client在接收代理对象时需要进行一次强制转换成接口的实现类对象，否则无法调用接口的方法

### 动态代理uml

1. ITarget目标对象实现的接口类
2. ConcreteTarget实现了ITarget接口
3. ProxyFactory类内有getInstance方法，根据传入的对象ConcreteTarget，利用反射机制返回一个代理对象，然后通过代理对象调用目标方法
4. Client依赖Proxy Factory
5. 这样ProxyFactory就避免了与接口发生关系，而只与传入的对象发生关联

## Cglib代理

1. 静态代理和动态代理都要求目标对象实现一个接口，但有时候目标对象只是一个单独的类，它并没有实现任何接口，这个时候可使用目标对象子类来实现代理。
2. Cglib又称为子类代理，它是在内存中构建一个子类对象从而实现对目标对象功能扩展
3. Cglib是一个高性能的代码生成包，如果要使用需要引入四个jar包，它可以在运行期扩展java类与实现java接口，它广泛的被许多AOP的框架使用，如Spring AOP,用来实现方法拦截
4. 在AOP编程中如何选择代理模式
   * 目标对象需要实现接口，使用JDK代理
   * 目标对象不需要实现接口，使用Cglib代理
5. Cglib包的底层是通过使用字节码处理框架ASM来转换字节码并生成新的类

### 注意事项

1. 在内存中构建子类时，目标对象的类不能为final，因为final类不能被继承，否则会报java.lang.IllegalArgumentException
2. 目标对象中的final/static方法不会被拦截

### Cglib代理uml

1. Target类，即目标对象的类
2. MethodInterceptor接口
3. ProxyFactory实现MehthodInterceptor接口，实现其中的intercept方法
4. ProxyFactory的getProxyInstance方法给目标对象target通过创建Enhancer来创建一个代理对象，并将请求回调设置为ProxyFactory对象使得请求可以被intercept方法拦截
5. ProxyFactory的intercept方法实现对目标对象方法的调用，即拦截对代理对象的请求，并转发到目标对象target

## 变体

1. 内网通过代理穿透防火墙，实现对公网的访问
2. 缓存代理，当请求资源时，先到缓存代理去取，取不到再到公网去取，然后缓存到缓存代理中
3. 远程代理 远程对象的本地代表，通过它可以把远程的对象当作本地对象使用
4. 同步代理，在多线程模型中，类本身不负责处理同步问题，交给同步代理来完成