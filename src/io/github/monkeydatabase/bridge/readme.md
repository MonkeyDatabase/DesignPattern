## 问题场景

1. 手机要实现开机、关机、打电话等通用功能
2. 手机有滑盖的、翻盖的、滑盖的
3. 手机有不同的品牌，如AAA、BBB、CCC品牌

## 目前问题

1. 代码见/phone/beforedesign
2. 一个Phone类
3. 各种样式的手机去继承Phone
4. 各种品牌的各种样式的手机去继承各种样式的手机
5. 按照这种情况，需要写9(3*3)个最终实现类,文件夹下已经写了6个类，最终实现类只写了一个AAASlidePhone,还有八个类没有写，**苦力活**
6. 按照这种写法，如果再出一种外观，如果每个品牌都出该外观的手机，则需要新写4(1+3*1)个类
7. 同理，如果新出一种品牌，而且该品牌出了各种外观的手机，则需要新写4(1+3*1)个类
8. 可以看出这种写法扩展性极差，违反了单一职责原则，类爆炸
9. 所以需要使用桥接模式，将类的抽象部分和实现部分进行分离，使类的抽象部分和实现部分可以独自变化

## 桥接模式概念

1. 将实现与抽象放在两个不同的类层次中，使两个层次可以独立变化
2. 桥接模式是一种结构型设计模型
3. Bridge模式基于类的**最小设计原则**，通过使用封装、聚合、继承等行为让不同的类承担不同的职责。
4. 它的主要特点是把Abstraction和Implementation分离开，从而可以保证各部分的独立性以及他们的功能扩展。 

## 桥接模式uml

1. Client依赖Abstraction
2. Abstraction聚合了Implementer，也是调用者和被调用者的关系
3. RefinedAbstraction是Abstraction的子类
3. 具体的实现如ConcreteImplementerA、ConcreteImplementerB实现Implementer接口
4. Abstraction为桥接类，将Client与Implementer连接起来
5. 实现者所为接口，在本例中为品牌，具体实现为AAA、BBB、CCC

## 桥接模式效果

1. 新增一个样式只需新增一个类
2. 新增一个品牌只需新建一个类
3. 将复杂度降低一维
4. 新增一个类的时候，从原有同层次类变动较小，降低了出错概率

## 桥接模式在JDBC框架中的应用

> 代码见/jdbc
> 需要使用IDEA把该文件夹当作Maven项目打开

1. Client生成一个Driver，需要调用抽象层类DriverManager
2. DriverManager(Abstraction)有getConnection方法获取一个java.sql.Connection接口(Implementer)的子类对象
3. 而com.mysql.jdbc.Connection接口继承自java.sql.Connection接口
4. MySQLConnection接口继承了com.mysql.jdbc.Connection接口
5. com.mysql.jdbc.ConnectionImpl实现了MySQLConnection接口
6. 所以DriverManager有getConnection方法获取到的实际应用对象所属的类为com.mysql.jdbc.ConnectionImpl

## 桥接模式适用场景

1. 不希望使用继承的场景
2. 因为**多层继承**导致系统中类的个数**急剧增加**的情况
3. 可以分为**两个维度**的场景:抽象层面、实现层面
4. JDBC驱动程序:Driver、DriverManager、Connection 
5. 银行转账可以划分为两个维度:方式(网上转账、柜台转账、ATM转账)、用户(普通用户、银卡用户、金卡用户)
6. 消息管理可以划分为两个维度:类型(即时消息、延时消息)、分类(手机短信、邮件消息、QQ消息)

