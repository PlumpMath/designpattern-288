package org.designpattern.behavioral.command;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/29/13
 * Time: 3:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommandA(receiver);
        Invoker invoker = new Invoker(command);
        invoker.invoke();
    }
}
