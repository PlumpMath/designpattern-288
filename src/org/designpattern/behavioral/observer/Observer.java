package org.designpattern.behavioral.observer;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/29/13
 * Time: 10:13 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Observer{
    protected Subject subject;
    protected String state;
    public abstract void update(Subject subject);

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
