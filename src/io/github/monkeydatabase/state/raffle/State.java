package io.github.monkeydatabase.state.raffle;

public interface State {
    void reduceMoney();
    boolean raffle();
    void dispensePrize();
}
