package org.designpattern.structural.adapterclass;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/16/13
 * Time: 7:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Adapter extends Adaptee implements  Target{

    public void request(){
        super.specificRequest();
    }
}
