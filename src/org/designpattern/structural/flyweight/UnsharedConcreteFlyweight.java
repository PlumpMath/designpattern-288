package org.designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/17/13
 * Time: 11:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class UnsharedConcreteFlyweight extends Flyweight {
    private HashMap<Character,Flyweight> unsharedFlyweights;
    private Flyweight  flyweight;

    public UnsharedConcreteFlyweight(Character intrinsicState) {
        super(intrinsicState);
        this.unsharedFlyweights = new HashMap(20);
    }

    public void add(Character key,Flyweight flyweight){
        this.unsharedFlyweights.put(key,flyweight);
    }
    @Override
    public void operation(String extrinsicState) {
        System.out.println("extrinsicState:" +  extrinsicState);
        Iterator<Map.Entry<Character,Flyweight>> it = unsharedFlyweights.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Character,Flyweight> entry = it.next();
            Flyweight fly = entry.getValue();
            fly.operation(extrinsicState);
        }
    }
}
