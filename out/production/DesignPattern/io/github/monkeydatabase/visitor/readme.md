## 问题场景

1. 使用代码完成一个测评系统的开发
2. 将观众分为男性观众和女性观众，当某个歌手表演后对歌手演唱进行评价，比如Good Bad

## 传统方案

1. 设置一个Customer类，有Man和Woman继承Customer类
2. Man和Woman分别进行Good、Bad评价

## 传统方案的问题

1. 测评系统可能会增加越来越多的新功能，传统方案对代码的改动较大
2. 扩展性不好，如果将来评分不只靠Man和Woman两种分类，或者评价不只有Good、Bad，又或者评分计算机制发生改变，都需要大幅改动程序，违反了OCP原则
3. 所以需要使用访问者模式

## Visitor模式概念

1. 封装一些作用于某种数据结构的的元素的操作，它可以在不改变数据结构的前提下定义作用于这些元素的新操作
2. 主要将数据结构与数据操作分离，解决数据结构和操作耦合性问题
3. 在被访问的类里面加一个对外提供接待访问者的接口
4. 主要应用场景:需要对一个对象结构中的对象进行很多不同操作(这些操作彼此没有关联)，同时需要避免让这些操作“污染”这些对象的类，可以使用访问者模式解决。

## Visitor模式uml

1. Visitor接口或抽象类，其中声明了一些操作
2. ConcreteVisitor实现或继承Visitor接口
3. Element接口和抽象类中有一个*accept(Visitor visitor)* 方法依赖了Vistor
4. ConcreteElement实现或继承了Element
5. ObjectStructure类中聚合了大量的Element对象，可能是List、Map等等。它能枚举它的元素，可以提供一个高层接口供访问者访问它的元素ConcreteElement
6. Client依赖了Visitor和ObjectStructure

## Visitor模式应用

1. Action接口或抽象类
2. Good、Bad实现或继承Action
3. Customer接口或抽象类，定义了一个方法*accept(Action action)*
4. Man、Woman实现或继承Customer
5. Customers类中有一个List<Customer>，聚合了Customer
