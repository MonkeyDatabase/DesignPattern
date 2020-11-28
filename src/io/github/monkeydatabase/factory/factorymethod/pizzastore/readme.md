## 需求

客户在订购Pizza时，可以点不同地点不同做法的Pizza。

## 思考过程

1. SimpleFactory模式中只是提供了一个静态工厂提供芝士披萨、希腊披萨、胡椒披萨等不同口味的订购，即提供一类物品的订购。
2. 目前需要提供伦敦的各种品类的Pizza、北京的各种品类的Pizza。
3. 按照之前的做法，可以提供不同的工厂类来解决问题，如北京Pizza简单工厂、伦敦Pizza简单工厂。
4. 但是，如果这样设计，会导致工厂类在将来扩展时会变得比较多，而且每个工厂类都要实现大量重复的代码，对于软件的规模和扩展不友好。
5. 所以，有工厂方法模式来解决这个问题，在工厂类上层抽象一个总体类，将关键方法通过设置为抽象方法延迟到子类，将整体骨架搭建在总体类中，这样可以减少很多重复的编码。

## 工厂方法模式

1. 设计方案：将pizza项目的实例化功能抽象成方法，在不同的口味点餐子类中具体实现。
2. 工厂方法模式：定义了一个创建对象的抽象方法，由子类决定要实例化的类，工厂方法模式将对象的实例化延迟到子类中。

* PizzaFactory-OrderPizza
   * BJPizzaFactory-BJOrderPizza
      * BJCheesePizza
      * BJPepperPizza
   * LDPizzaFactory-LDOrderPizza
      * LDCheesePizza
      * LDPepperPizza
* Pizza
   * LDCheesePizza
   * LDPepperPizza
   * BJCheesePizza
   * BJPepperPizza

## 疑问

1. 工厂方法模式使用abstract抽象方法这种方式将关键步骤交给子类实现，但是子类在实现该方法时，无法用static修饰，也就是说想要使用该方法只能new一个工厂对象，而不能像静态工厂一般简单高效，有什么解决办法?