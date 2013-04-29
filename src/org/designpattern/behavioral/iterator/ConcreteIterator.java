package org.designpattern.behavioral.iterator;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/29/13
 * Time: 5:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteIterator extends Iterator {
    public ConcreteIterator(){
        this.index = 0;
    }

    @Override
    public Object currentItem() {
        return this.getAggregate().getItem(this.index);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void first() {
        this.index = 0;
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void next() {
        if(this.index < this.getAggregate().getSize()){
            this.index ++;
        }
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void last() {
        this.getAggregate().getSize();
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isDone() {
        return this.index == this.getAggregate().getSize();  //To change body of implemented methods use File | Settings | File Templates.
    }
}
