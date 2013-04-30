package org.designpattern.behavioral.visitor;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/30/13
 * Time: 7:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteVisitorA extends Visitor {
    @Override
    public void visitConcreteElementA(Element element) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("i will visit element A!");
    }

    @Override
    public void visitConcreteElementB(Element element) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("i will visit element B!");
    }
}
