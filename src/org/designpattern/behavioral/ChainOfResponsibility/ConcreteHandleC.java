package org.designpattern.behavioral.ChainOfResponsibility;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/29/13
 * Time: 2:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteHandleC extends Handle {
    public ConcreteHandleC() {
        super();
    }

    @Override
    public void HandleRequest() {
        //To change body of implemented methods use File | Settings | File Templates.
        if(this.getSuccessor() != null){
            System.out.println("deliver the control to the next handler..");
        }else{
            System.out.println("must handle this problem!");
        }
        System.out.println("mission has been completed!");
    }
}
