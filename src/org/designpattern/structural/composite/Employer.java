package org.designpattern.structural.composite;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/16/13
 * Time: 8:42 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Employer {

    private List<Employer> following;

    public abstract void add(Employer e);
    public abstract  void delete(Employer e);
    public abstract Employer getChild(int  index);
    public void setFollowing(List<Employer> following) {
        this.following = following;
    }

    public List<Employer> getFollowing(){
        return this.following;
    }

    public void info(){
        System.out.println("the employer is an employer!");
    }

/*
    public Employer getChild(int index){
        return null;
    }
*/
}
