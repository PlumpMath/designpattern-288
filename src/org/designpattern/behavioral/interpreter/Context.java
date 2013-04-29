package org.designpattern.behavioral.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/29/13
 * Time: 4:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class Context {
    private List list;
    public void add(AbstractExpression exp){
        list.add(exp);
    }
    public List<AbstractExpression> getList(){
        return list;
    }
    public Context(){
        this.list = new ArrayList<AbstractExpression>();
    }
}
