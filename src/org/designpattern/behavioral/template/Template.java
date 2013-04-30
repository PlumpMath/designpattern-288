package org.designpattern.behavioral.template;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/30/13
 * Time: 6:26 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Template {
    public  void templateMethod(){
        primitiveOperationA();
        primitiveOperationB();
    }

    public abstract void primitiveOperationA();
    public abstract void primitiveOperationB();
}
