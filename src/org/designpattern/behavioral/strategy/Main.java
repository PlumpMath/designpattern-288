package org.designpattern.behavioral.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/30/13
 * Time: 6:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategyA();
        Context ctx = new Context(strategy);

        ctx.doAction();
        ctx.doAction();
        ctx.doAction();
        ctx.doAction();
    }
}
