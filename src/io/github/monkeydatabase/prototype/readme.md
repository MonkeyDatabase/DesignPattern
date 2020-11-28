## 原型模式概念

1. 原型模式:用原型实例来指定创建对象的类型，并且通过拷贝这个原型来创建新的对象。
2. 原型模式是一种创建型模式，允许一个对象创建另一个可定制的对象，无需知道创建的细节。
3. 将一个原型实例传递给要发动创建的那个对象，该对象接收原型实例后通过请求**原型实例拷贝自己**来实施创建。

## 原型模式原理

1. Prototype:声明一个clone自己的接口
2. ConcretePrototype:具体的原型类，实现一个clone自己的操作
3. Client:让一个原型实例clone自己，从而创建一个新的属性和原型一样的对象

## 浅拷贝 vs 深拷贝

* 对于基本数据类型是同等对待的，都是进行值传递
* 对于引用数据类型
   * 浅拷贝仍然是**值传递**，即地址传递，新拷贝出来的对象的引用型成员变量仍指向原型实例的引用型成员变量所指向的对象，没有对引用型成员变量所指向的对象进行递归拷贝
      * Prototype->object1
      * ClonedObject->object1
   * 深拷贝是**递归拷贝**，原型实例中的引用型成员变量所指向的对象也被拷贝一份，新拷贝出的对象的引用型成员变量所指向的对象与原型实例的引用型成员变量所指向的对象的内容相同，但在堆中的地址不同。
      * Prototype->object1
      * ClonedObject->object2
      * object1与object2内容相同，在堆中的内存地址不同

### 浅拷贝

> 代码见/shallowcopy

1. 浅拷贝使用默认的Clone方法(实现Cloneable接口，简单修改java.lang.Object#clone()方法，Object的clone是native方法，如果不实现Cloneable接口，会被报java.lang.CloneNotSupportedException)
2. /shallowcopu代码执行结果如下

   ```java
   sheep.hashcode:21685669
   sheep1.hashcode:2133927002
   sheep2.hashcode:1836019240
   sheep3.hashcode:325040804
   sheep4.hashcode:1173230247
   -------------------------------------
   Sheep{name='tom', age=1, color='white', friend=Sheep{name='tom', age=1, color='white', friend=null}} name.hashcode:115026 friend.hashcode:856419764
   Sheep{name='tom', age=1, color='white', friend=Sheep{name='tom', age=1, color='white', friend=null}} name.hashcode:115026 friend.hashcode:856419764
   Sheep{name='tom', age=1, color='white', friend=Sheep{name='tom', age=1, color='white', friend=null}} name.hashcode:115026 friend.hashcode:856419764
   Sheep{name='tom', age=1, color='white', friend=Sheep{name='tom', age=1, color='white', friend=null}} name.hashcode:115026 friend.hashcode:856419764
   Sheep{name='tom', age=1, color='white', friend=Sheep{name='tom', age=1, color='white', friend=null}} name.hashcode:115026 friend.hashcode:856419764
   ```
 
   * 可以看出拷贝出的对象的hashcode不同，所以它们在堆中不是同一个对象
   * 这几个拷贝出的对象的friend成员变量的hashcode相同，说明它们在堆中指向了同一个对象
   * 这几个拷贝出的对象的name成员变量的hashcode也相同，说明String对象也是被指向了同一个

   
### 深拷贝

1. 深拷贝实现则复杂一些,有两种实现方法
   * 重写Clone方法，需要手动为每一个引用型成员变量单独调用clone方法，所有引用型成员变量所指向的类需要实现Cloneable接口
   * \[推荐\]使用序列化方式来实现深拷贝，不需要手动调用方法，扩展性好，所有引用型成员变量所指向的类需要实现Seializable接口，需要两个try-catch，且第一个为try-catch-finally，finally用于关闭四个流
      * ByteArrayOutputStream
      * ObjectOutputStream
      * ByteArrayInputStream
      * ObjectInputStream
2. 深拷贝执行效果如下(deepPrototype对象中聚合了deepCloneableTarget对象):
   ```java
    false
    deepPrototype name :宋江 deepCloneableTarget.hashcode:2125039532
    deepPrototype1 name :宋江 deepCloneableTarget.hashcode:1867083167
    deepPrototype2 name :宋江 deepCloneableTarget.hashcode:1915910607
    deepPrototype3 name :宋江 deepCloneableTarget.hashcode:284720968
    deepPrototype4 name :宋江 deepCloneableTarget.hashcode:189568618
    deepPrototype5 name :宋江 deepCloneableTarget.hashcode:793589513
   ```

## 注意事项

1. 原型模式的缺点:为每一个类配备一个克隆方法，这对全新的类来说不是很难，但对已有的类进行改造时，需要修改其代码，违背了OCP原则。
2. 原型模式可以动态的克隆，每次克隆都可以获取到原型对象的最新状态。
3. 原型模式将传统的new对象并一一赋源对象的值的方式改进为了直接通过复制原型实例来创建新对象的方式。