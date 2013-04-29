package org.designpattern.behavioral.mediator;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/29/13
 * Time: 8:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteColleageA extends Colleage {
    @Override
    public void action() {
        //To change body of implemented methods use File | Settings | File Templates.
        this.getMediator().doActionFromA2B();
    }
}
