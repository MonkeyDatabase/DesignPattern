## 问题场景

1. 与Facade模式的问题场景类似
2. 智能家庭包括各种设备，闹钟、咖啡机、电视机、电动窗帘等
3. 当主人看到电视时，各个设备可以协同工作，自动完成准备工作
4. 

## 更合适的问题场景

1. 房屋中介
2. 当客户想要买一个房子
3. 房屋中介负责与房子男主人、房子女主人、房子主人的亲属等人进行协商，当所有的人都同意之后，中介再告诉买家交易准备就绪

## Mediator模式概念

1. 用一个Mediator对象封装一系列的对象交互
2. 中介者使各个对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变他们之间的交互
3. Mediator模式属于行为型模式
4. 比如MVC模式，Controller是Model和View的中介者，在前后端交互时起到了中间人的作用

## Mediator模式uml

1. Mediator接口或抽象类，即抽象中介者
2. ConcreteMediator实现或继承Mediator，维护了一个Colleague集合(HashMap)，即它聚合了Colleague。它需要知道所有具体同事类
3. Colleague接口或抽象类，即抽象同事类
4. ConcreteColleague实现或继承Colleague，管理所有的同事类，完成相应的操作和任务，每个ConcreteColleague类只知道自己的行为，而不论了解其它同事类的行为


## Mediator模式应用

1. Mediator接口
2. ConcreteMediator是具体中介者，包含一个colleagueMap，提供getMessage方法
3. Colleague接口，提供sendMessage()、getMediator()方法
4. Alarm、TV、CoffeeMachine实现了Colleague类