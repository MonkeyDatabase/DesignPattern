package io.github.monkeydatabase.interpreter.calculater;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {
    private Expression expression;

    public Calculator(String expStr) {
        //控制运算先后顺序
        Stack<Expression> stack=new Stack<>();
        char[] charArray=expStr.toCharArray();
        Expression left=null;
        Expression right=null;
        for (int i=0;i<charArray.length;i++){
            switch (charArray[i]){
                case '+':
                    left=stack.pop();
                    right=new ValExpression(charArray[++i]);
                    stack.push(new AddExpression(left,right));
                    break;
                case '-':
                    left=stack.pop();
                    right=new ValExpression(charArray[++i]);
                    stack.push(new SubExpression(left,right));
                default:
                    stack.push(new ValExpression((charArray[i])));
            }
        }
        this.expression=stack.pop();
    }

    public int run(HashMap<Character,Integer> var){
        return this.expression.interpret(var);
    }
}
