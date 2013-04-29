package org.designpattern.behavioral.memento;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/29/13
 * Time: 9:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
