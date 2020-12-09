## 问题场景

1. 编写程序实现鸭子这个形象
2. 有各种品种的鸭子，真鸭子如连城白鸭、金定鸭、三穗鸭、北京鸭等等，假鸭子如橡皮鸭、电子鸭等等
3. 鸭子有各种行为，如叫、跑、飞等
4. 实现显示鸭子详情的功能

## 传统方案

1. 声明一个Duck接口或抽象类，定义了quack、run、fly方法
2. LianchengDuck、JindingDuck、SansuiDuck、BeijingDuck实现或继承Duck类

## 传统方案的问题

> 代码见/duck/beforedesign

1. 所有的鸭子都继承了Duck类，quack让所有的鸭子都会飞，run让所有的鸭子都会跑、fly让所有的鸭子都会飞、swim让所有的鸭子都会游泳，然而橡皮鸭不会飞，电子鸭不会游泳，所以直接写是有问题的，这使得不会这些行为的鸭子需要重写父类的具体方法，违反了里氏替换原则
2. 比如玩具鸭子，需要重写Duck的全部方法，这是不合理的
3. 这就需要策略模式

## 策略模式概念

1. 策略模式中，定义算法族，分别封装起来，让它们之间可以互相可以替换，此模式让算法独立于使用算法的客户
2. 策略模式将变化的代码从不变的代码中分离出来
3. 策略模式针对接口编程，而不是具体类，它定义了策略接口
4. 策略模式中通过组合方式使用策略，避免了使用继承

## 策略模式uml

1. Strategy接口或抽象类，其中定义了很多方法。对于一个行为设定一个Strategy接口或抽象类，如果一个行为有很多差异，则这些差异实现或继承该Strategy类
2. ConcreteStrategyA、ConcreteStrategyB实现或继承了Strategy，是具体策略实现类
3. Context类中聚合了一系列Strategy，每一个Strategy聚合一个行为的一个具体行为
4. Context需要哪个策略可以通过构造器指定

## 策略模式应用

> 代码见/duck/improved

1. 定义FlyBehavior、SwimBehavior、QuackBehavior接口或抽象类
2. 以FlyBehavior为例，使用GoodFlyBehavior、NormalFlyBehavior、BadFlyBehavior实现或继承FlyBehavior
3. 定义Duck抽象类，定义一个属性用于聚合FlyBehavior、SwimBehavior、QuackBehavior
4. 在Duck类中定义各种行为的方法，在校验聚合的策略类不为空后，转发给策略类实现动作
5. 可以看出对于每个Duck类，还可以动态地切换策略


## 策略模式在JDK源码中的分析

> 代码见/jdksample

1. JDK中Arrays的Comparator使用了策略模式
2. java.util.Comparator是一个接口，其中有一个compare方法，接受两个数组元素，返回值为正数、0、负数
3. Arrays.sort()有一个重载方法接受数组和实现了Comparator接口对象
