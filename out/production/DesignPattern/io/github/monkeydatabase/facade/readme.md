## 问题场景

1. 编写程序实现影院管理
2. 影院中有DVD、投影仪、自动屏幕、环绕立体声、爆米花机
3. 要求完成使用家庭影院的功能
   1. 直接使用遥控器，统筹各个设备的开关
   2. 开爆米花机
   3. 放下屏幕
   4. 开投影仪
   5. 开音响
   6. 开DVD
   7. 拿爆米花
   8. 调节灯光
   9. 播放影片
   10. 使用结束，关闭各种设备

 ## 问题的问题解法
 
 1. 对各个设备各自实现一个类，每个不同的设备都有自己的功能
 2. Client类直接聚合各个设备，对各个设备进行控制
 
 ## 问题的问题解法的问题
 
 1. Client直接依赖了各个设备类，一旦设备类方法需要改变，使用者Client需要随之改变
 2. 按照问题场景的描述，Client会使用相当多的代码去执行流程，容易混乱，扩展性差
 3. 所以需要使用外观模式
 
 ## 外观模式概念
 
 1. 通过定义一个一致的接口,用以屏蔽内部子系统的细节，使得调用只与该接口发生调用，而无需关心这个子系统的内部细节
 2. 外观模式，也叫过程模式，外观模式为子系统的一组接口提供一个一致的界面，此模式定义了一个高层接口，这个接口使得这一子系统更加容易使用，也增加了子系统维护的灵活性
 
 ## 外观模式uml
 
 1. Facade外观类，为调用端提供统一的调用接口，从而将调用端的请求转发给适当的子系统对象
 2. Client调用者，使用Facade类的调用者
 3. 子系统的集合，指模块或者子系统，处理Facade对象指派的任务，它是功能的提供者
 4. Facade聚合了各个子系统
 
 ## 外观模式在MyBatis框架中的应用
 
 > 代码见/sampleMybatis
 
 1. 通过Maven引入MyBatis依赖
 
    ```xml
    <!-- https://mvnrepository.com/artifact/org.mybatis/mybatis -->
    <dependency>
        <groupId>org.mybatis</groupId>
        <artifactId>mybatis</artifactId>
        <version>3.5.6</version>
    </dependency>
    ```
    
 2. org.apache.ibatis.session.Configuration类的构造方法中可以看到许多属性，而且有几个属性是从Factory中取得的
    
    ```java
        this.reflectorFactory = new DefaultReflectorFactory();
        this.objectFactory = new DefaultObjectFactory();
        this.objectWrapperFactory = new DefaultObjectWrapperFactory();
        this.lazyLoadingEnabled = false;
        this.proxyFactory = new JavassistProxyFactory();
    ```
    
3. Configuration类中有个newMetaObject方法,这个方法调用了MetaObject类的forObject静态方法
   
   ```java
    public MetaObject newMetaObject(Object object) {
        return MetaObject.forObject(object, this.objectFactory, this.objectWrapperFactory, this.reflectorFactory);
    }
   ```

4. MetaObject类的forObject静态方法中根据传入object的类型，使用另外三个工厂
5. 所以当Client调用Configuration的newMetaObject,最终调用了那三个工厂，但使用者并不知情
6. 所以在本例中，Configuration类相当于Facade类


 
 
 
  