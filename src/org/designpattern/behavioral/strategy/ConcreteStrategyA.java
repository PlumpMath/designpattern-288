package org.designpattern.behavioral.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/30/13
 * Time: 6:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteStrategyA extends Strategy {
    @Override
    public void algrithmInterface(Context context) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("doAction with strategyA!");
        context.changeStrategy(new ConcreteStrategyB());
    }
}
