package org.designpattern.behavioral.mediator;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/29/13
 * Time: 9:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteMediator extends Mediator {
    private Colleage colleageA;
    private Colleage colleageB;
    public ConcreteMediator(Colleage A,Colleage B){
        this.colleageA = A;
        this.colleageB = B;
    }
    @Override
    public void doActionFromA2B() {
        //To change body of implemented methods use File | Settings | File Templates.
        this.colleageB.setMessage(this.colleageA.getMessage());
    }

    @Override
    public void doActionFromB2A() {
        //To change body of implemented methods use File | Settings | File Templates.
        this.colleageA.setMessage(this.colleageB.getMessage());
    }
}
