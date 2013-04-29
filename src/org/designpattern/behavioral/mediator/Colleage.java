package org.designpattern.behavioral.mediator;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/29/13
 * Time: 8:53 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Colleage {
    protected String message;
    protected Mediator mediator;
    public  abstract  void action();

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
