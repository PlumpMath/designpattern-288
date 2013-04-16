package org.designpattern.structural.composite;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/16/13
 * Time: 9:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        Employer programmer = new Programmer();
        Employer manager = new Manager();
        Employer developer = new Programmer();
        Employer architect = new Manager();

        manager.add(architect);
        manager.add(programmer);
        manager.add(developer);
        for(Employer e : manager.getFollowing()){
            e.info();
        }
        System.out.println("------------------");
        manager.delete(architect);
        for(Employer e: manager.getFollowing()){
            e.info();
        }
    }
}
