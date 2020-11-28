## 抽象工厂模式

1. 抽象工厂模式是对简单工厂模式的进一步抽象，是对简单工厂和工厂方法模式的整合。
2. 抽象工厂模式提供了一个创建相关或相互依赖的对象的接口，而无需指定具体的类名。
3. 抽象工厂模式将工厂抽象为两层，AbsFatory和具体的工厂子类。根据需要可以把对应的工厂子类聚合到使用场景中，有利于代码的维护和扩展。

* AbsFactory
   * BJFactory
      * BJCheesePizza
      * BJPepperPizza
   * LDFactory
      * LDCheesePizza
      * LDPepperPizza

OrderPizza □—— xxxFactory

* Pizza
   * LDCheesePizza
   * LDPepperPizza
   * BJCheesePizza
   * BJPepperPizza

## 疑问

抽象工厂每个具体工厂类的create方法是继承自抽象工厂，这些方法无法作为静态方法，导致要执行这些方法，必须new一个具体工厂类对象，频繁的创造工厂对象