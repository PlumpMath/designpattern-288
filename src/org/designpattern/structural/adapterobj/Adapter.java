package org.designpattern.structural.adapterobj;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/16/13
 * Time: 7:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class Adapter implements Target  {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    public void request(){
           adaptee.sepcificRequest();
     }
}
