package org.designpattern.structural.composite;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/16/13
 * Time: 9:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class Manager extends Employer {
       public Manager(){
           this.setFollowing(new ArrayList<Employer>());
       }

    @Override
    public void add(Employer e) {
        this.getFollowing().add(e);
    }

    @Override
    public void delete(Employer e) {
       if(!this.getFollowing().isEmpty()){
           this.getFollowing().remove(e);
       }
    }

    @Override
    public void info() {
        System.out.println("i'm a manager!");
    }

    @Override
    public Employer getChild(int index) {
        //To change body of overridden methods use File | Settings | File Templates
        return this.getFollowing().get(index);
    }
}
