package org.designpattern.behavioral.command;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/29/13
 * Time: 3:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command){
        this.command = command;
    }
    public void invoke(){
        System.out.println("command invoked!");
        this.command.execute();
    }
}
