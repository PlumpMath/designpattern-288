package org.designpattern.behavioral.template;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/30/13
 * Time: 6:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        Template templateA = new ConcreteTemplateA();
        Template templateB = new ConcreteTemplateB();

        templateA.templateMethod();
        templateB.templateMethod();
    }
}
