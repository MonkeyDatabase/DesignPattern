package io.github.monkeydatabase.state.raffle;

public class NotPaidState implements State{
    RaffleActivity raffleActivity;

    public NotPaidState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void reduceMoney() {
        System.out.println("Money -50, enjoy yourself");
        raffleActivity.setState(raffleActivity.getRaffleableState());
    }

    @Override
    public boolean raffle() {
        System.out.println("You haven't paid for this game");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("You haven't paid for this game");
    }
}
