## 问题场景

1. 咖啡店有一个订单项目
2. 咖啡种类:Espresso(意大利浓咖啡)、ShortBlack、LongBlack(美式咖啡)、Decaf(无因咖啡)
3. 调料有三种: Milk、Soy、Chocolate
4. 计费使用单品咖啡+调料的模式，也可以只点咖啡不点调料
5. 需要具有较好的扩展性、改动方便、维护方便，咖啡店未来可能扩展新的咖啡种类
6. 使用OO的方式来计算不同种类咖啡的费用

## 问题的问题解法1

1. 声明一个抽象类coffee
2. 每种具体的咖啡继承自coffee类，这些具体的coffee类不仅包括Espresso、ShortBlack、LongBlack、Decaf, Espresso&milk、Espresso&Soy、Espresso&Chocolate......
3. 代码见/coffeestore/beforedesign/plan1,里面实现了四个单品咖啡，只实现了添加了一份Milk的Espresso,其它加了多种多份调料的多种咖啡类太多了，**体力活**
4. 可以看出这种实现方式有严重的扩展性不足的问题

## 问题的问题解法2

1. 代码见/coffeestore/beforedesign/plan2
2. 声明一个抽象类coffee，coffee中私有Integer类型的milk、soy、chocolate属性，用于计量各种调料的个数
3. 具体的coffee类包括Espresso、ShortBlack、LongBlack、Decaf，继承自coffee类，通过继承coffee的构造方法，避免了类爆炸，每次新增一种coffee，只需新建一个coffee类
4. 但违反了开闭原则，当新增一种调料sugar时，就会影响到coffee抽象类和各个具体实现类的构造方法，进一步影响到所有new具体咖啡类的使用代码，对于调味料的扩展性严重不足
5. 所以需要使用装饰者模式

## 装饰者模式理念

1. 动态地将新功能附加到对象上，在对象功能扩展上比继承更具有弹性
2. 当只想对一个对象而不是一个类添加功能时，可以使用装饰者模式
3. 装饰者模式擅长于实现开闭原则和对一个对象动态的添加功能
4. 装饰者模式是对外壳的修改，在类的外部逐层包装，被装饰者无需了解自己被装饰
5. 与装饰者模式相比，策略模式是对内核的修改，在类的内部逐层深入，选用不同的策略

## 装饰者模式uml

1. 最高层抽象接口Component
2. ConcreteComponent实现Component接口，作为被装饰者
3. Decorator抽象类实现Component接口，作为装饰者
4. Decorator聚合了一个Component对象
5. 具体装饰者类ConcreteDecoratorA、ConcreteDecoratorB等继承Decorator类
6. 由于被装饰者和装饰者都实现了Component接口，所以可以由装饰者将处理请求转交给聚合的具体的被装饰者，并且在转发前后可以进行额外的操作(装饰)

## 装饰者模式应用

1. 对Coffee进行了多一层抽象，Drink抽象类，来预留给Coffee以外的饮品扩展，如果汁
2. Coffee类继承自Drink类
3. Espresso、ShortBlack、LongBlack、Decaf继承自Coffee
4. Decorator继承Drink类
5. Milk、Soy、Chocolate等调料继承Decorator，作为具体装饰者
6. 每次装饰在将请求转发给被装饰者前累加当前装饰者的价格再加上被装饰者的价格，而被装饰着的价格可以转发给被装饰者由被装饰者实现，所以整体的计价其实是一个递归的过程

## 装饰者模式效果

1. 新增一种Coffee只需新增一个类继承Coffee类
2. 新增一种饮料，只需新增一个类继承Drink类
3. 新增一种调料，只需新增一个类继承Decorator类

## 装饰者模式框架应用

> 代码见/sample

1. Component为InputStream
2. ConcreteComponent为FileInputStream、StringBufferInputStream、ByteArrayInputStream
3. Decorator为FilterInputStream
4. ConcreteDecorator为BufferInputStream、DataInputStream、LineNumberInputStream

