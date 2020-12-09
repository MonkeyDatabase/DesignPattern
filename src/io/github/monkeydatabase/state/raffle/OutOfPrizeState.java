package io.github.monkeydatabase.state.raffle;

public class OutOfPrizeState implements State{
    @Override
    public void reduceMoney() {
        System.out.println("Sorry, we have run out of prize");
    }

    @Override
    public boolean raffle() {
        System.out.println("Sorry, we have run out of prize");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("Sorry, we have run out of prize");
    }
}
