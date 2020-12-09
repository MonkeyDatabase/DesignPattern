package io.github.monkeydatabase.interpreter.calculater;

import java.util.HashMap;

public abstract class Expression {
    public abstract int interpret(HashMap<Character,Integer> var);
}
