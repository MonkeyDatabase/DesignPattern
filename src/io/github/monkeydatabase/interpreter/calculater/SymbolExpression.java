package io.github.monkeydatabase.interpreter.calculater;

import java.util.HashMap;

public class SymbolExpression extends Expression{
    private Expression left;
    private Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    //默认实现
    @Override
    public int interpret(HashMap<Character, Integer> var) {
        return 0;
    }
}
