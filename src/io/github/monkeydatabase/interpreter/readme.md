## 问题场景

1. 编写程序实现加减法运算
2. 先输入表达式格式字符串，如a+b+c-d，且要求表达式的字母不重复
3. 分别输入a、b、c、d的值
4. 最后输出结果

## 传统方案

1. 编写一个方法，接收表达式格式字符串，然后根据用于的数值进行解析，得出结果并输出
2. 当加入新的运算符，如已有+-时，扩展*、/等符合，不利于扩展
3. 让一个方法解析表达式格式字符串条理不清晰
4. 此时可使用Interpreter模式

## Interpreter模式概念

1. 在编译原理中，一个算法表达式通过词法分析器形成词法单元，然后词法单元通过语法分析器构建语法分析树，最终形成一棵抽象语法树，这里面的词法分析器和语法分析器可以看作Interpreter
2. Interpreter模式是给定一个语言，定义它的文法的一种表示，并定义一个解释器，使用该解释器在解释语言中的句子
3. 应用场景
   * 将一个需要解释执行的语言中的句子表示为一个抽象语法树时
   * 当一些重复出现的问题可以用一种简单的语言来表达时
   * 解释简单语言时
4. 具体应用场景
   * 编译器
   * 运算表达式计算
   * 正则表达式

## Interpreter模式uml

1. AbstractExpression抽象类，是表达式抽象类，其中有一个interpret()方法
2. TerminalExpression继承AbstractExpression，是终结符表达式
3. NonTerminalExpression继承AbstractExpression，是非终结符表达式，为非终结符实现解释操作，它内部聚合AbstractExpression
4. Context类内部存放了一些全局信息
5. Client依赖Context和AbstractExpression

## Interpreter模式应用

1. Expression为表达式抽象类
2. VarExpression继承Expression，相当于TerminalExpression
3. SymbolExpression继承Expression，相当于NonTerminalExpression
4. SubExperssion、AddExpression等运算符类继承SymbolExpression
5. Calculator类聚合了Expression
6. 该场景需要用到栈数据结构

## Interpreter模式在Spring中的应用

1. Spring框架中的SpelExpressionParser中使用了Interpreter模式

   ```xml
   <dependency>
       <groupId>org.springframework</groupId>
       <artifactId>spring-expression</artifactId>
       <version>5.2.8.RELEASE</version>
   </dependency>
   ```
   
   
2. 与本例问题场景类似，代码如下
   ```java
   public static void main(String[] args) {
       SpelExpressionParser parse=new SpelExpressionParser();
       Expression expression=parse.parseExpression("10*(2-1)*2+233");
       System.out.println(expression.getValue());
   }
   ```
