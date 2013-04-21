package org.designpattern.structural.flyweight;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/17/13
 * Time: 4:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class FlyweightFactory {
    private List<Flyweight> flyWeights;
    public FlyweightFactory(){
        flyWeights = new ArrayList<Flyweight>();
    }
    public Flyweight getFlyweight(String key){
        Iterator it = this.flyWeights.iterator();
        while (it.hasNext()){
            Flyweight fly = (Flyweight) it.next();
            if(fly.getIntrinsicState().equals(key)){
                System.out.println("already created!");
                return fly;
            }
        }
        Flyweight flyWeight = new ConcreteFlyweight(key);
        this.flyWeights.add(flyWeight);
        return flyWeight;
    }

}
