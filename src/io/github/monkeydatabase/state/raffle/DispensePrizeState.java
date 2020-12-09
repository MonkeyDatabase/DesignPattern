package io.github.monkeydatabase.state.raffle;

public class DispensePrizeState implements State{
    RaffleActivity raffleActivity;

    public DispensePrizeState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void reduceMoney() {
        System.out.println("Don't need pay another 50, My dear, you have won the game");
    }

    @Override
    public boolean raffle() {
        System.out.println("You have won the game, if you want another chance ,please pick the prize first");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("Here you are, your prize");
        raffleActivity.setState(raffleActivity.getNotPaidState());
    }
}
