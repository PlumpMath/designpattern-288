package org.designpattern.behavioral.visitor;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/30/13
 * Time: 7:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        Visitor visitor = new ConcreteVisitorA();
        Element element = new ConcreteElementA();
        element.accept(visitor);
    }
}
