package org.designpattern.structural.facade;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/16/13
 * Time: 10:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        Facade facade = new Facade();
        facade.service1();
        System.out.println("--------------");
        facade.service2();
    }
}
