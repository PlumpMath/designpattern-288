package org.designpattern.behavioral.state;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/30/13
 * Time: 5:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        State state = new ConcreteStateA();
        Context context = new Context(state);
        context.request();
        context.request();
        context.request();
        context.request();

    }
}
