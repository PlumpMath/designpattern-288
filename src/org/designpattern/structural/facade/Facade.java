package org.designpattern.structural.facade;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/16/13
 * Time: 10:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class Facade {
    private  SubSystemA subSystemA;
    private  SubSystemB subSystemB;
    private  SubSystemC subSystemC;

    public Facade() {
        subSystemA = new SubSystemA();
        subSystemB = new SubSystemB();
        subSystemC = new SubSystemC();
    }

    public void service1(){
        subSystemA.operation();
        subSystemB.operation();
    }

    public void service2(){
        subSystemB.operation();
        subSystemC.operation();
    }
}
