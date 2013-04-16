package org.designpattern.structural.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/16/13
 * Time: 8:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        Dating dating = new DateWithGirl();
        dating.act(new WatchMovies());

        Dating dat1 = new DateWithLady();
        dat1.act(new EatMeal());
    }
}
