package org.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/29/13
 * Time: 10:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteSubject extends Subject {
    public ConcreteSubject(){
        this.observers = new ArrayList<Observer>();
    }
    @Override
    public void attach(Observer observer) {
        //To change body of implemented methods use File | Settings | File Templates.
        this.observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        //To change body of implemented methods use File | Settings | File Templates.
        if(observer != null){
            this.observers.remove(observer);
        }
    }

    @Override
    public void notice() {
        //To change body of implemented methods use File | Settings | File Templates.
        Iterator<Observer> iterator = this.observers.iterator();
        while(iterator.hasNext()){
            Observer obsvr = iterator.next();
            obsvr.update(this);
        }
    }
}
