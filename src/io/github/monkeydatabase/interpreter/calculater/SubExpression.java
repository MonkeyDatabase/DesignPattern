package io.github.monkeydatabase.interpreter.calculater;

import java.util.HashMap;

public class SubExpression extends SymbolExpression{
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret(HashMap<Character, Integer> var) {
        return super.getLeft().interpret(var)-super.getRight().interpret(var);
    }
}
