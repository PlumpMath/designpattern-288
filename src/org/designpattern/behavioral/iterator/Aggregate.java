package org.designpattern.behavioral.iterator;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/29/13
 * Time: 5:50 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Aggregate {
    protected int size;
    public abstract Iterator createIterator();
    public abstract Object getItem(int index);
    public abstract  int getSize();
    public abstract void addObject(Object obj);
}
