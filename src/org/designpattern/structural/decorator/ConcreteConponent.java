package org.designpattern.structural.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/16/13
 * Time: 10:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteConponent extends Conponent {
    @Override
    public void operation() {
       System.out.println("concreteconponent operated!");
    }
}
