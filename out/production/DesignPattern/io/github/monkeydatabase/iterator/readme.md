## 问题场景

1. 同之前组合模式中的问题场景，不过组合模式中主要考虑各个层级的管理问题(从上到下)，而迭代器设计模式主要考虑统一遍历的问题(不一定是从上到下)
2. 编写一个程序展示学校院系结构
3. 一个学校有多个学院、一个学院有多个系

## 传统方法

1. 系继承学院，学院继承学校，从而统一遍历，但系、学院、学校之间差异过大，不适合使用继承
2. 而且需要遍历整个学校的体系结构，遍历的方式也有不同的选择。假如某个学院的系是以数组存储的，而另一个学院的系是以集合存储的
3. 所以需要使用迭代器模式

## Iterator模式概念

1. Iterator模式属于行为型模式
2. 如果集合元素用不同的方式实现的，如数组、java集合类等方式，当客户端要遍历这些集合元素的时候就需要使用多种遍历方式，而且会暴露元素的内部结构，可以考虑使用迭代器模式解决
3. Iterator模式提供一种遍历集合元素的统一接口，用一致的方法遍历集合元素，不需要直到集合对象的底层表示，即不暴露其内部的结构

## Iterator模式uml

1. Iterator接口，Java中提供了一个Iterator接口,该接口有hasNext、next、remove、forEachRemaining
   ```java
   boolean hasNext();
   
   E next();
   
   default void remove() {
       throw new UnsupportedOperationException("remove");
   }
   
   default void forEachRemaining(Consumer<? super E> action) {
       Objects.requireNonNull(action);
       while (hasNext())
           action.accept(next());
   }
   ```
2. ConcreteIterator实现Iterator接口
3. Aggregate接口用于聚合，声明了*createIterator()*返回一个迭代器
4. ConcreteAggregate实现Aggregate接口，它依赖ConreteIterator。同时，ConcreteAggregate内维护了一个容器，通过依赖的ConcreteIterator来遍历容器中的元素

## Iterator模式应用

1. Iterator接口，Java提供
2. DryadCollegeIterator、NecromancerCollegeIterator实现Iterator接口，它们知道自己的这些Department的存储细节
3. College接口，作为学院的抽象层
4. DryadCollege、NecromancerCollege实现College接口，它们聚合了自己下属所有Department，并各自聚合了一个Iterator用于遍历自己的下属部门
5. Department是最基本组成元素

## Iterator模式在jdk中的应用

1. List接口中声明了Iterator<E> iterator()方法用于返回一个迭代器
2. JDK中为每种List内使用内部类的方式写了各个集合的迭代器，可以通过iterator()返回一个可用于当前集合的迭代器
