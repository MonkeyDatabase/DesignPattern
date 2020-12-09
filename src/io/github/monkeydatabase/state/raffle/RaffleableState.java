package io.github.monkeydatabase.state.raffle;

import java.util.Random;

public class RaffleableState implements State{
    RaffleActivity raffleActivity;

    public RaffleableState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void reduceMoney() {
        System.out.println("Don't need pay another 50, My dear");
    }

    @Override
    public boolean raffle() {
        System.out.println("Raffle game started");
        int i= new Random().nextInt(10);
        if (i<9){
            raffleActivity.setState(raffleActivity.getNotPaidState());
            System.out.println("You are almost won, another raffle?");
            return false;
        }
        else {
            raffleActivity.setState(raffleActivity.getDispensePrizeState());
            System.out.println("Congratulations!");
            return true;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("Raffle is the only possible for you to get prize");
    }
}
