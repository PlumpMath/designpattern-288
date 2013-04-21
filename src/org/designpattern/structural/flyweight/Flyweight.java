package org.designpattern.structural.flyweight;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/17/13
 * Time: 4:07 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Flyweight {
    protected String intrinsicState;

    protected Flyweight(String intrinsicState){
        this.intrinsicState = intrinsicState;
    };
    public abstract void operation(String extrinsicState);
    public abstract String getIntrinsicState();
}
