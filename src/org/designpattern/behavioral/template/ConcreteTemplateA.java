package org.designpattern.behavioral.template;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/30/13
 * Time: 6:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteTemplateA extends Template {
    @Override
    public void primitiveOperationA() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("operationA implemented by concreteTemplateA");
    }

    @Override
    public void primitiveOperationB() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("operationB implemented by concreteTemplateA");
    }
}
