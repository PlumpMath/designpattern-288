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
        Flyweight fly1 = factory.getFlyweight('a');
        fly1.operation("First call!");
        Flyweight fly2 = factory.getFlyweight('b');
        fly2.operation("Second call!");
        Flyweight fly3 = factory.getFlyweight('a');
        fly3.operation("Third call!");
        System.out.println(fly1 == fly3);

        Flyweight unsharedFlyweight = factory.getUnsharedFlyweight("abcde");
        unsharedFlyweight.operation("Forth call!");
    }
}
