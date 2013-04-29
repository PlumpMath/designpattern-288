package org.designpattern.behavioral.iterator;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/29/13
 * Time: 6:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.addObject("a");
        aggregate.addObject(18226637374f);
        aggregate.addObject("i love you!");

        Iterator iterator = aggregate.createIterator();

        while(!iterator.isDone()){
            System.out.println(iterator.currentItem());
            iterator.next();
        }
        System.out.println("-------------------------------");
        for(int i=0;i<aggregate.getSize();i++){
            System.out.println(aggregate.getItem(i));
        }
    }
}
