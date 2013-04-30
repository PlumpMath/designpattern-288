package org.designpattern.behavioral.visitor;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/30/13
 * Time: 7:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteElementA extends Element {
    @Override
    public void accept(Visitor visitor) {
        //To change body of implemented methods use File | Settings | File Templates.
        visitor.visitConcreteElementA(this);
        System.out.println("visit concreteElementA!");
    }
}
