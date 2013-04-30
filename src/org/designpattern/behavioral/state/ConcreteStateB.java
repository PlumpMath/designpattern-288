package org.designpattern.behavioral.state;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/30/13
 * Time: 5:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteStateB extends State {
    @Override
    public void handle(Context context) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("handled by concreteStateB!");
        if(null != context){
            context.changeState(new ConcreteStateA());
        }
    }
}
