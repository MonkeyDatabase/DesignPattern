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

## 双分派

1. 双分派意味着执行的操作取决于请求的种类和两个接收者类型
2. 上面的例子中，如果想增加一种评价方法的话，可以直接新建一个类实现或继承Action，而无需改动Customer相关的类

## Visitor模式注意事项

1. Visitor模式符合单一职责原则
2. 访问者模式可以对功能进行统一，适用于数据结构相对稳定的系统
3. 具体元素对访问者公布细节，违背了迪米特法则，如上例中，Action中有getManResult、getWomanResult，如果新增一个Element，那所有的Action方法都需要重写，违背了开闭原则
4. 违背了依赖倒转原则，Action中的getManResult、getWomanResult方法的参数是具体的Man、Woman类型，而不是抽象类型
5. 如果Element部分比较稳定，Action部分经常变化，则适合使用访问者模式