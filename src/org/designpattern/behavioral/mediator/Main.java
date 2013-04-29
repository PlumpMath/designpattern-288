package org.designpattern.behavioral.mediator;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/29/13
 * Time: 9:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        ConcreteColleageA a = new ConcreteColleageA();
        ConcreteColleageB b = new ConcreteColleageB();

        Mediator mediator = new ConcreteMediator(a,b);
        a.setMediator(mediator);
        b.setMediator(mediator);

        a.setMessage("send message to colleageB");
        a.action();
        System.out.println(a.getMessage());
        System.out.println(b.getMessage());

        b.setMessage("send message to colleageA");
        b.action();
        System.out.println(a.getMessage());
        System.out.println(b.getMessage());
    }
}
