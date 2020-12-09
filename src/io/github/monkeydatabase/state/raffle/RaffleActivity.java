package io.github.monkeydatabase.state.raffle;

public class RaffleActivity {
    State state;
    NotPaidState notPaidState=new NotPaidState(this);
    RaffleableState raffleableState=new RaffleableState(this);
    DispensePrizeState dispensePrizeState=new DispensePrizeState(this);
    OutOfPrizeState outOfPrizeState=new OutOfPrizeState();

    int count;

    public RaffleActivity(int count) {
        this.state = notPaidState;
        this.count = count;
    }

    public void pay(){
        state.reduceMoney();
    }

    public void raffle(){
        if(state.raffle()){
            count--;
            if (count==0){
                setState(outOfPrizeState);
            }
        }
    }

    public void dispensePrize(){
        state.dispensePrize();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public RaffleActivity(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public NotPaidState getNotPaidState() {
        return notPaidState;
    }

    public void setNotPaidState(NotPaidState notPaidState) {
        this.notPaidState = notPaidState;
    }

    public RaffleableState getRaffleableState() {
        return raffleableState;
    }

    public void setRaffleableState(RaffleableState raffleableState) {
        this.raffleableState = raffleableState;
    }

    public DispensePrizeState getDispensePrizeState() {
        return dispensePrizeState;
    }

    public void setDispensePrizeState(DispensePrizeState dispensePrizeState) {
        this.dispensePrizeState = dispensePrizeState;
    }
}
