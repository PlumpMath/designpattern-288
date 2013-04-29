package org.designpattern.behavioral.iterator;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/29/13
 * Time: 5:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteAggregate extends Aggregate{
    private  Object[] objs;
    public ConcreteAggregate(){
        this.objs = new Object[32];
        this.size = 0;
    }
    @Override
    public Iterator createIterator() {
        Iterator iterator = new ConcreteIterator();
        iterator.setAggregate(this);
        return iterator;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Object getItem(int index) {
        return this.objs[index];  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getSize() {
        return this.size ;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void addObject(Object obj) {
        this.objs[this.size] = obj;
        this.size++;
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
