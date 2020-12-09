package io.github.monkeydatabase.interpreter.calculater;

import java.util.HashMap;

public class ValExpression extends Expression{
    private Character key;

    public ValExpression(Character key) {
        this.key = key;
    }

    @Override
    public int interpret(HashMap<Character, Integer> var) {
        return var.get(this.key);
    }
}
