package org.designpattern.behavioral.chainOfResponsibility;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/29/13
 * Time: 2:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        Handle h1 = new ConcreteHandleA();
        Handle h2 = new ConcreteHandleB();
        Handle h3 = new ConcreteHandleC();

        h1.setSuccessor(h2);
        h1.HandleRequest();
        h3.HandleRequest();
    }
}
