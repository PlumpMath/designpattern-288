package org.designpattern.behavioral.memento;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/29/13
 * Time: 9:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();

        originator.setState("loving");
       Memento memento = originator.createMemento();
        System.out.println(originator.getState());

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(memento);

        originator.setState("divorce");
        System.out.println(originator.getState());

        originator.setStateFromMemento(caretaker.getMemento());
        System.out.println(originator.getState());
    }
}
