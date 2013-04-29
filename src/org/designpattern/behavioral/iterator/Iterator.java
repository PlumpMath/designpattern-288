package org.designpattern.behavioral.iterator;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/29/13
 * Time: 5:52 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Iterator {
    protected Aggregate aggregate;
    protected int index;

    public Aggregate getAggregate() {
        return aggregate;
    }

    public void setAggregate(Aggregate aggregate) {
        this.aggregate = aggregate;
    }
    public abstract void first();
    public abstract void next();
    public abstract void last();
    public abstract boolean isDone();
    public abstract Object currentItem();
}
