package org.designpattern.structural.flyweight;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/17/13
 * Time: 11:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class UnsharedConcreteFlyweight extends Flyweight {

    public UnsharedConcreteFlyweight(String intrinsicState) {
        super(intrinsicState);
    }

    @Override
    public String getIntrinsicState() {
        return null;
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("extrinsicState: + extrinsic");
    }
}
