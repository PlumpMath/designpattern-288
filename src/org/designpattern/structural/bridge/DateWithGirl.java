package org.designpattern.structural.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/16/13
 * Time: 7:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class DateWithGirl extends Dating {
   public void act(Activity activity){
       activity = new WatchMovies();
       activity.doSomething();
   }
}
