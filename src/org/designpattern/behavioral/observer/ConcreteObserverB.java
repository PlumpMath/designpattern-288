package org.designpattern.behavioral.observer;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/29/13
 * Time: 10:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteObserverB extends Observer {
    public ConcreteObserverB(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update(Subject subject) {
        //To change body of implemented methods use File | Settings | File Templates.
        this.setState(subject.getState());
    }
}
