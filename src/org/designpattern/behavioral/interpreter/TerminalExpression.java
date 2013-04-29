package org.designpattern.behavioral.interpreter;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/29/13
 * Time: 4:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class TerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context ctx) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("this is a terminalExpression!");
    }
}
