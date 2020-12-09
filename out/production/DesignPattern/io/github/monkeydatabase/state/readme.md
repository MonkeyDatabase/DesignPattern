 ## 问题场景
 
 1. 编码实现一个抽奖小游戏
 2. 参加一次活动扣除50积分，中奖概率10%
 3. 奖品数量固定，抽完即止
 4. 本次活动中玩家一共有四种状态:
    * 付费前不能抽奖
    * 付费后可以抽奖
    * 中奖后发放奖品
    * 奖品数量归零禁止抽奖
 
 ## State模式概念
 
 1. State模式，主要用来解决对象在多种状态转换时需要对外输出不同的行为的问题，状态和行为是一一对应的，状态之间可以相互转化
 2. 当一个对象的内在状态改变时，允许改变其行为，使得看起来像是改变了它的类本身
 
 ## State模式uml
 
 1. State接口中定义了很多操作，是抽象状态角色，其中封装了与Context的一个特点接口相关的行为
 2. ConcreteStateA、ConcreteStateB实现了State接口
 3. Context类中为环境角色，用于维护ConcreteState实例。它其中聚合了State，并有相应的getState()、setState()方法
 
 ## State模式应用
 
 1. 定义一个State接口，其中有reduceMoney()、raffle()、dispensePrize()
 2. NotPaidState、RaffleableState、DispensePrizeState、OutOfPrizeState实现了State接口
 3. Activity是活动类，它含有所有的状态对象，各个状态对象也包含Activity的引用