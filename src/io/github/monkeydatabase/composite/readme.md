## 问题场景

1. 在一个页面中展示学校的院系
2. 一个学校有多个学院
3. 一个学院有多个系

## 问题的问题解法

1. 写一个学校类
2. 学院继承自学校
3. 系继承自学院

## 问题的问题解法的问题所在

1. 问题解法是小结构继承大结构的思想，而实际需求是要展示学校的院系，当前功能是为了实现管理
2. 学校、学院、系之间实际上不是继承的关系，学校、学院、系共同的职能并不多
2. 实际上学校、学院、系之间是组合的关系，多个系组成一个学院，多个学院组成了一个学校
3. 应该把学校、院、系都看成组成结构，它们之间没有继承关系，而是一个树形结构，即组合模式

## 组合模式概念

1. 组合模式，又叫部分整体模式，它创建了对象组的树形结构，将对象组合成树形结构以表示"整体-部分"的层次关系
2. 组合模式属于结构性模式
3. 组合模式使得用户对单个对象和组合对象的操作具有一致性，即组合能让客户以一致的方式处理个别对象以及组合对象

## 组合模式uml

1. Component是组合中的一个对象声明接口，在适当的情况下实现所有类共有的接口默认行为，用于访问和管理Component子部件
2. Component可以是抽象类或者接口
3. Leaf实现或继承了Component，在组合中表示一个叶子节点，叶子节点不会有子节点，是被管理者
4. Composite实现或继承了Component，在组合中表示一个非叶子节点，用于存储子节点，在Component接口中实现子部件的相关操作

## 组合模式应用

1. OrganizationComponent是最高层抽象，可以是接口，可以是抽象类
2. Department、College、University实现或继承OrganizationComponent
3. OrganizationComponent中抽象了所有组成元素的公共方法，如add、remove、print
4. Department作为系，是最底层单位，属于被管理者，故是Leaf
5. College、University是非叶子节点，是Composite，它们内部会聚合OrganizationComponent，通过聚合OrganizationComponent，College聚合了Department，University聚合了College

## 组合模式小tip

1. 当OrganizationComponent是抽象类时，对于叶子节点不需要而非叶子节点需要的方法，可以进行默认实现，并在方法体中*throw new UnsupportedOperationException()*，这是因为非叶子节点一定会重写该方法，如果是抽象方法的话，那叶子节点不需要这些方法还重写这些方法，浪费时间。
2. 对于叶子节点和非叶子节点都需要的方法，如果它们使用时有差异，可以做成抽象方法，让他们去自行实现。

## 组合模式在JDK中的应用

1. Map是一个接口，是最高层抽象
2. AbstractMap实现了Map接口，但是是抽象类
3. HashMap继承了Abstract类，并实现了Map接口，相当于Composite
4. HashMap中有put和putAll方法，可以分为向Map中添加一个节点和添加一个Map中全部的节点
5. 而组合模式中的Leaf在HashMap中的对应是Node，而Node是HashMap类的一个静态内部类，而Node还实现了Map.Entry接口，Entry接口为Map接口的内部接口

   ```java
       static class Node<K,V> implements Map.Entry<K,V> {
           final int hash;
           final K key;
           V value;
           Node<K,V> next;
   
           Node(int hash, K key, V value, Node<K,V> next) {
               this.hash = hash;
               this.key = key;
               this.value = value;
               this.next = next;
           }
   
           public final K getKey()        { return key; }
           public final V getValue()      { return value; }
   
           public final String toString() { return key + "=" + value; }
   
           public final int hashCode() {
               return Objects.hashCode(key) ^ Objects.hashCode(value);
           }
   
           public final V setValue(V newValue) {
               V oldValue = value;
               value = newValue;
               return oldValue;
           }
   
           public final boolean equals(Object o) {
               if (o == this)
                   return true;
               if (o instanceof Map.Entry) {
                   Map.Entry<?,?> e = (Map.Entry<?,?>)o;
                   if (Objects.equals(key, e.getKey()) &&
                       Objects.equals(value, e.getValue()))
                       return true;
               }
               return false;
           }
       }
   ```
