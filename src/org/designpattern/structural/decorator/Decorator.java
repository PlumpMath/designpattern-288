package org.designpattern.structural.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/16/13
 * Time: 10:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class Decorator extends Conponent {
    private Conponent conponent;
    public Decorator(Conponent conponent){
        this.conponent = conponent;
    }
    @Override
    public void operation() {
        conponent.operation();
    }
}
