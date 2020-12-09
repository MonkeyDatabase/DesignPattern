package io.github.monkeydatabase.memento.game;

public class Client {
    public static void main(String[] args) {
        Originator originator=new Originator();
        CareTaker careTaker=new CareTaker();

        originator.setState("#1 homeland");
        careTaker.add(originator.save());
        System.out.println("The state is now : "+originator.getState());

        System.out.println("walk around...............");
        originator.setState("#2 palace");
        careTaker.add(originator.save());
        System.out.println("The state is now : "+originator.getState());

        System.out.println("walk around...............");
        originator.setState("#3 kill dragon buff added");
        careTaker.add(originator.save());
        System.out.println("The state is now : "+originator.getState());

        System.out.println("walk around...............");
        originator.setState("#3 be killed by a small Goblin");
        careTaker.add(originator.save());
        System.out.println("The state is now : "+originator.getState());

        System.out.println("Hope to go back to #2 palace and replay the game");
        System.out.println("The state is now : "+originator.getState());

        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Go backing");
        System.out.println("The state is now : "+originator.getState());
    }
}
