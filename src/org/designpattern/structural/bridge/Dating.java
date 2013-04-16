package org.designpattern.structural.bridge;

import javax.activity.ActivityCompletedException;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/16/13
 * Time: 8:00 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Dating {
    private Activity activity;

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public abstract void act(Activity activity);
}
