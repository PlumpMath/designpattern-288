package org.designpattern.behavioral.memento;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/29/13
 * Time: 9:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(this.state);
    }

    public void setStateFromMemento(Memento memento){
        this.state = memento.getState();
    }
}
