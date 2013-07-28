package org.designpattern.structural.adapterclass;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/16/13
 * Time: 7:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String [] args){
        Target target = new Adapter();
        target.request();
    }
}
