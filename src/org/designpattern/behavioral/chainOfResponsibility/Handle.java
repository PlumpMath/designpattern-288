package org.designpattern.behavioral.chainOfResponsibility;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/29/13
 * Time: 2:37 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Handle {
    private  Handle successor;

    protected Handle(){
    }

    public void setSuccessor(Handle successor) {
        this.successor = successor;
    }

    public Handle getSuccessor() {
        return successor;
    }

    public abstract void HandleRequest();
}
