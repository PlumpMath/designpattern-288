package org.designpattern.structural.flyweight;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/17/13
 * Time: 4:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteFlyweight extends Flyweight {
    public ConcreteFlyweight(String intrinsicState){
        super(intrinsicState);
    }
    @Override
    public String getIntrinsicState() {
        //To change body of implemented methods use File | Settings | File Templates.
        return this.intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("extrinsicState:" + extrinsicState);
    }
}
