package org.designpattern.behavioral.observer;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/29/13
 * Time: 10:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer obsvrA = new ConcreteObserverA(subject);
        Observer obsvrB = new ConcreteObserverB(subject);

        subject.setState("red");
        System.out.println(obsvrA.getState());
        System.out.println(obsvrB.getState());

        subject.notice();
        System.out.println(obsvrA.getState());
        System.out.println(obsvrB.getState());
    }
}
