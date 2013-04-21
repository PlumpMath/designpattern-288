package org.designpattern.structural.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/16/13
 * Time: 10:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteDecorator extends  Decorator {

    public ConcreteDecorator(Conponent conponent){
        super(conponent);
    }
    @Override
    public void operation() {
        super.operation();
        System.out.println("concreteDecorator operation!");
        addedBehavior();
    }

    public void addedBehavior(){
        System.out.println("concreteDecorator added behavior!");
    }
}
