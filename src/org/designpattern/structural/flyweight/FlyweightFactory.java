package org.designpattern.structural.flyweight;

import java.util.HashMap;
/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/17/13
 * Time: 4:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class FlyweightFactory {
    private HashMap flyWeights;
    public FlyweightFactory(){
        flyWeights = new HashMap();
    }
    public Flyweight getFlyweight(Character key){
        if(this.flyWeights.containsKey(key)){
            System.out.println(key + " already created!");
            return (Flyweight) flyWeights.get(key);
        }else{
             Flyweight flyweight = new ConcreteFlyweight(key);
             flyWeights.put(key,flyweight);
             return flyweight;
        }
    }

    public Flyweight getUnsharedFlyweight(String keys ){
        UnsharedConcreteFlyweight unsharedConcreteFlyweight = new UnsharedConcreteFlyweight(null);
        for(int i=0;i<keys.length();i++){
            Character character = new Character(keys.charAt(i));
            unsharedConcreteFlyweight.add(character,getFlyweight(character));
        }
        return unsharedConcreteFlyweight;
    }
}
