package org.designpattern.behavioral.command;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/29/13
 * Time: 3:33 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Command {
    protected Receiver receiver;

    protected Command(Receiver receiver){
        this.receiver = receiver;
    }
    public abstract void execute();
}
