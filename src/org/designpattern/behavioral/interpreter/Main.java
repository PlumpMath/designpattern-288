package org.designpattern.behavioral.interpreter;

import org.omg.IOP.TAG_ALTERNATE_IIOP_ADDRESS;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/29/13
 * Time: 5:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        Context ctx = new Context();
        ctx.add(new TerminalExpression());
        ctx.add(new NonterminalExpression());
        ctx.add(new TerminalExpression());
        for(AbstractExpression exp : ctx.getList()){
            exp.interpret(ctx);
        }
    }
}
