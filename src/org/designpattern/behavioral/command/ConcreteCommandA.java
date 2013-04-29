package org.designpattern.behavioral.command;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/29/13
 * Time: 3:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteCommandA extends Command {

    public ConcreteCommandA(Receiver receiver){
        super(receiver);
    }
    @Override
    public void execute() {
        //To change body of implemented methods use File | Settings | File Templates.
        this.receiver.action();
        System.out.println("command executed!");
    }
}
