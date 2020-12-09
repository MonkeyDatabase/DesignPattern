package io.github.monkeydatabase.interpreter.calculater;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        try {
            String expStr=getExpressionString();
            HashMap<Character,Integer> var=getValue(expStr);
            Calculator calculator=new Calculator(expStr);
            System.out.println(calculator.run(var));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getExpressionString() throws IOException {
        System.out.println("Please input your expression : ");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    private static HashMap<Character,Integer> getValue(String expstr) throws IOException {
        HashMap<Character,Integer> var=new HashMap<>();
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        char[] charArray =expstr.toCharArray();
        for (char c:charArray){
            if (c=='+'||c=='-')
                continue;
            else{
                System.out.println("please input the value of "+c+" : ");
                Integer integer= Integer.valueOf(bufferedReader.readLine());
                var.put(c,integer);
            }
        }
        return var;
    }
}
