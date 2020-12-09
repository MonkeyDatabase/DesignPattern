package io.github.monkeydatabase.mediator.home.mediator;

import io.github.monkeydatabase.mediator.home.machine.*;

import java.util.HashMap;

public class ConcreteMediator extends Mediator{
    private HashMap<String, Colleague> colleagueHashMap;
    private HashMap<String,String> interMap;

    public ConcreteMediator(){
        colleagueHashMap=new HashMap<>();
        interMap=new HashMap<>();
    }

    @Override
    public void register(String name, Colleague colleague) {
        colleagueHashMap.put(name,colleague);
        if (colleague instanceof Alarm){
            interMap.put("Alarm",name);
        }else if (colleague instanceof CoffeeMachine){
            interMap.put("CoffeeMachine",name);
        }else if (colleague instanceof TV){
            interMap.put("TV",name);
        }else if (colleague instanceof Curtain){
            interMap.put("Curtain",name);
        }
    }

    @Override
    public void getMessage(int stateChange, String name) {
        if (colleagueHashMap.get(name) instanceof Alarm){
            if (stateChange==0){
                ((CoffeeMachine)(colleagueHashMap.get(interMap.get("CoffeeMachine")))).startCoffee();
                ((TV)(colleagueHashMap.get(interMap.get("TV")))).startTV();
            }else if (stateChange==1){
                ((TV)(colleagueHashMap.get(interMap.get("TV")))).shutdownTV();
            }
        }else if (colleagueHashMap.get(name) instanceof CoffeeMachine){
            ((Curtain)(colleagueHashMap.get(interMap.get("Curtain")))).upCurtain();
        }else if (colleagueHashMap.get(name) instanceof TV){
            ((Curtain)(colleagueHashMap.get(interMap.get("Curtain")))).downCurtain();
        }else  if (colleagueHashMap.get(name) instanceof Curtain){
            ((Alarm)(colleagueHashMap.get(interMap.get("Alarm")))).alarm();
        }
    }

    @Override
    public void sendMessage() {

    }
}
