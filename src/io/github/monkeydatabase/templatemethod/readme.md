## 问题场景

1. 制作豆浆的流程:选材-添加配料-浸泡-放到豆浆机中打碎
2. 通过添加不同的配料，可以制作成不同口味的豆浆
3. 选材、浸泡、放到豆浆机中打碎这三个步骤对于制作每个口味的豆浆都是一样的

## 模板方法概念

1. TemplateMethod模板方法模式，又叫模板模式，在一个抽象类公开定义了执行它的方法的模板。它的子类可以按照需要重写方法实现，但调用将以抽象类中定义的方法进行
2. 模板方法模式，定义一个操作中的算法的**骨架**，而将一些步骤延迟到子类中，是的子类可以不改变一个算法的结构，就可以重定义该算法的某些特定步骤
3. 模板方法模式属于行为型模式

## 模板方法uml

> 代码见soybeanmilkstore

1. AbstractClass是一个抽象类，内部定义了一些抽象方法和模板方法，这些抽象方法可以被模板方法按需调用
   * 规定了算法的大体结构**骨架**
   * AbstractClass中如果有必要，也可以定义一些具体方法，但是这些具体方法将影响它所有的子类
2. ConcreteClass继承AbstractClass,它按需要重写了抽象方法
3. Client依赖所需的ConcreteClass
4. 模板方法为了被子类篡改，可使用final关键字修饰

## 模板方法之钩子方法

> 代码见/hooksoybeanmilkstore

1. 在模板方法模式中的父抽象类中，可以定义一个方法，它默认不做任何事，子类可以视情况重写该方法，该方法被称为钩子方法
2. 假如在上面的场景中，多了一个不加配料的商品，此时如何对原工程进行维护
   1. 第一种方案:新建一个子类继承原来的抽象类，并且把添加配料的抽象方法进行空实现，就可以做到不添加配料，完成需求。
   2. 第二种方案:在抽象类中新建一个具体方法，不进行任何操作，只返回默认值，默认返回true，即添加配料，当不需要添加配料时，子类重写该方法。
   > 虽然这里这样描述，但是这并不是一个好的例子，因为它多了每次调用make都额外校验钩子方法的返回值,而且新的不添加配料的豆浆类也同样需要实现addIngredients方法，也是空实现。所以在之后需要找一个更好的钩子方法例子，替换掉这个例子

## 模板方法在Spring框架中的应用

> 代码见/springsample
> IDEA中查看当前类的子类并以层次结构显示的快捷键是Ctrl+H

1. 模板方法模式在Spring IOC中被使用
2. ConfigurableApplicationContext接口中定义了refresh方法用来加载或刷新配置
   ```java
   void refresh() throws BeansException, IllegalStateException;
   ```
3. AbstractApplicationContext抽象类实现了ConfigurableApplicationContext接口,并实现了refresh方法，该方法即模板方法
   * 其中有大量**具体方法**
   * *obtainFreshBeanFactory()* 方法虽然被实现，但其内部实际上是调用了一个*refreshBeanFactory()* **抽象方法** ，并把*getBeanFactory()* **抽象方法**的结果返回
   * *postProcessBeanFactory(beanFactory)* 和onRefresh()是空实现，即**钩子方法**
   ```java
   @Override
   	public void refresh() throws BeansException, IllegalStateException {
   		synchronized (this.startupShutdownMonitor) {
   			// Prepare this context for refreshing.
   			prepareRefresh();
   
   			// Tell the subclass to refresh the internal bean factory.
   			ConfigurableListableBeanFactory beanFactory = obtainFreshBeanFactory();
   
   			// Prepare the bean factory for use in this context.
   			prepareBeanFactory(beanFactory);
   
   			try {
   				// Allows post-processing of the bean factory in context subclasses.
   				postProcessBeanFactory(beanFactory);
   
   				// Invoke factory processors registered as beans in the context.
   				invokeBeanFactoryPostProcessors(beanFactory);
   
   				// Register bean processors that intercept bean creation.
   				registerBeanPostProcessors(beanFactory);
   
   				// Initialize message source for this context.
   				initMessageSource();
   
   				// Initialize event multicaster for this context.
   				initApplicationEventMulticaster();
   
   				// Initialize other special beans in specific context subclasses.
   				onRefresh();
   
   				// Check for listener beans and register them.
   				registerListeners();
   
   				// Instantiate all remaining (non-lazy-init) singletons.
   				finishBeanFactoryInitialization(beanFactory);
   
   				// Last step: publish corresponding event.
   				finishRefresh();
   			}
   
   			catch (BeansException ex) {
   				if (logger.isWarnEnabled()) {
   					logger.warn("Exception encountered during context initialization - " +
   							"cancelling refresh attempt: " + ex);
   				}
   
   				// Destroy already created singletons to avoid dangling resources.
   				destroyBeans();
   
   				// Reset 'active' flag.
   				cancelRefresh(ex);
   
   				// Propagate exception to caller.
   				throw ex;
   			}
   
   			finally {
   				// Reset common introspection caches in Spring's core, since we
   				// might not ever need metadata for singleton beans anymore...
   				resetCommonCaches();
   			}
   		}
   	}
   ```

4. GenericApplicationContext继承了AbstractApplicationContext抽象类，该类虽然还是抽象类，但是对抽象方法进行了实现
   ```java
   @Override
   	protected final void refreshBeanFactory() throws IllegalStateException {
   		if (!this.refreshed.compareAndSet(false, true)) {
   			throw new IllegalStateException(
   					"GenericApplicationContext does not support multiple refresh attempts: just call 'refresh' once");
   		}
   		this.beanFactory.setSerializationId(getId());
   	}
   
   @Override
   	public final ConfigurableListableBeanFactory getBeanFactory() {
   		return this.beanFactory;
   	}
   
   
   ```

5. ReactiveWebServerApplicationContext类继承了GenericReactiveWebApplicationContext，而GenericReactiveWebApplicationContext类继承了GenericApplicationContext抽象类，ReactiveWebServerApplicationContext中重写了钩子方法onRefresh
   ```java
   	@Override
   	protected void onRefresh() {
   		super.onRefresh();
   		try {
   			createWebServer();
   		}
   		catch (Throwable ex) {
   			throw new ApplicationContextException("Unable to start reactive web server", ex);
   		}
   	}
   ```