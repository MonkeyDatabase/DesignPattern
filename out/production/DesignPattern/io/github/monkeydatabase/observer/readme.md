## 问题场景

1. 气象站可以将每天测量的温度、湿度、气压等等以公告的形式发布到自己的网站
2. 第三方平台也可以通过接口获取气象站的数据
3. 需要设计开放型API，便于第三方获取数据
4. 提供温度、气压、湿度的接口
5. 当测量数据更新时，要能实时地通知第三方

## 问题场景的问题方案

> 代码见/weatherbroadcast

1. 设计一个WeatherData类，它可以提供温度、气压、湿度数据服务，提供get方法来允许第三方获取数据
2. 当数据更新时，气象站通过调用dataChange()更新数据，当第三方再次获取时就能获取最新数据，当然也可以推送
3. 第三方也可以定时去获取数据

## 问题场景的问题方案的问题

1. 第三方模块使用了一个类来实现，如果将来新出现一个第三方，不利于维护，违反了OCP原则
2. 使用一个引用来指向观察者，不利于动态加入新的观察者

## Observer模式原理

1. 被观测者为Subject，观察者为Observer
2. 例如奶站、报纸商人，相当于Subject，客户可以去订购，也可以取消订购，即注册观察者registerObserver、注销观察者removeObserver
3. 气象站、奶站、批发厂等根据业务需求还需要通知所有客户，可以是发布公告到公告板等待客人自己来读取，也可以实时群发消息主动通知客户最新状态
4. 观察者模式中对象之间是多对一的依赖关系。

## Observer模式uml

1. Subject接口提供registerObserver、removeObserver、notifyObservers方法
2. ConcreteSubject实现Subject接口，并且该类中有一个集合，用来存放聚合的所有Observer
   * 管理天气信息
   * 管理观察者
3. Observer接口有update方法，预留给Subject调用来进行主动推送
4. ConcreteObserver实现Observer接口，这样将来出现一个新的观察者，只需要新建一个ConcreteObserver类，而不需变动Subject相关的内容，因为它们是被当做Observer接口的子对象接受的，遵守了OCP原则

## Observer模式应用

1. 气象站WeatherStation相当于Subject
2. 各个报社AAA、BBB、CCC相当于Observer
