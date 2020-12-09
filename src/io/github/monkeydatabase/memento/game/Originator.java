package io.github.monkeydatabase.memento.game;

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //保存状态到Memento
    public Memento save(){
        return new Memento(state);
    }

    //从Memento恢复状态
    public void getStateFromMemento(Memento memento){
        state=memento.getState();
    }
}
