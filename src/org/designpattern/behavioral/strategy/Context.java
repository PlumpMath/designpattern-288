package org.designpattern.behavioral.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/30/13
 * Time: 6:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doAction(){
        this.strategy.algrithmInterface(this);
    }
    public void changeStrategy(Strategy strategy){
        if(null != strategy){
            this.strategy = strategy;
        }
    }
}
