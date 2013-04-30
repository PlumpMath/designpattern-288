package org.designpattern.behavioral.visitor;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/30/13
 * Time: 7:11 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Element {
    public abstract void accept(Visitor visitor);

}
