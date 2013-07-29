package org.designpattern.structural.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/16/13
 * Time: 10:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        Conponent conponent = new ConcreteConponent();
        Conponent decorator = new ConcreteDecorator(conponent);
        decorator.operation();
    }
}
