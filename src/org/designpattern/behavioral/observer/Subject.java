package org.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/29/13
 * Time: 10:13 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Subject {
    protected String state;
    protected List<Observer> observers;
    public abstract void attach(Observer observer);
    public abstract void detach(Observer observer);
    public abstract void notice();

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
