package org.designpattern.structural.flyweight;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/17/13
 * Time: 2:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly1 = factory.getFlyweight("hello");
        Flyweight fly2 = factory.getFlyweight("world");
        Flyweight fly3 = factory.getFlyweight("hello");
        System.out.println(fly1 == fly3);
    }
}
