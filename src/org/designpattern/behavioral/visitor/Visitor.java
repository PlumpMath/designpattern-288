package org.designpattern.behavioral.visitor;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/30/13
 * Time: 7:10 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Visitor {
    public abstract void visitConcreteElementA(Element element);
    public abstract  void visitConcreteElementB(Element element);
}
