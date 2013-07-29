package org.designpattern.structural.composite;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/16/13
 * Time: 8:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class Programmer extends Employer {
    public Programmer(){
        this.setFollowing(null);
    }
    @Override
    public void add(Employer e) {
        //To change body of implemented methods use File | Settings | File Templates.
        throw new UnsupportedOperationException("unsupported operation!");
    }

    @Override
    public void delete(Employer e) {
        //To change body of implemented methods use File | Settings | File Templates.
        throw new UnsupportedOperationException("unsupported operation!");
    }

    @Override
    public Employer getChild(int index) {
        throw new UnsupportedOperationException("unsupported operation!");
    }

    @Override
    public void info() {
       System.out.println("i'm a programmer!");
    }
}
