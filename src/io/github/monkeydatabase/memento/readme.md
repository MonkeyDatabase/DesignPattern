## 问题场景

1. 编程实现一个游戏存档功能

## 传统方案

1. 为每个Player写一个对象保存Player之前的状态，包括攻击力和防御力。
2. 这导致每个Player要对应一个Status类

## 传统方案的问题

1. 一个对象对应一个保存对象状态的对象，当游戏对象很多时，不利于管理，开销也很大
2. 传统的方式是简单地备份，new另一个对象出来，需要把需要备份的数据放到这个新对象中，这暴露了Player对象的全部细节。
3. 所以需要使用Memento模式

## Memento模式概念

1. Memento模式在不破坏封装性的前提下，捕获一个对象的内部状态，并在这个对象之外保存这个对象状态，这样以后就可以将该对象恢复到原先保存的状态
2. 现实生活中备忘录是用来记录某些要去做的事情，或者记录已经达成的共同意见的事情，以防忘记。而在软件层面，备忘录有着类似的含义，Memento对象主要用来记录一个对象的某种状态，或者某些数据，当要回退时从备忘录对象获取原来的数据进行恢复操作
3. 备忘录模式属于行为型模式

## Memento模式uml

1. Originator对象，即数据源对象
2. Memento对象，用于保存Originator的对象
3. Originator依赖Memento
4. CareTaker聚合Memento，当有多个Originator和多个Memento时，可以靠CareTaker维护Memento对象，当只用存一个Player的状态时用List即可，当多个Player时可以用Map
5. Client依赖Originator

## Memento模式的特点

1. Memento不同于Command，Command模式记录了一系列操作且每次Undo或Redo一个命令，而Memento只记录一个状态，不论进行了多少操作，可以直接恢复状态
2. Memento模式不同于Decorator，本问题场景的buff、debuff我认为用装饰者模式更加好用，因为除了这两种buff还会有各种buff，不过装饰者模式不利于去掉某一层buff，即恢复到装饰之前可能出现问题

## Memento模式应用场景

1. 游戏的存档
2. 数据库的事务管理
3. 操作系统的快照