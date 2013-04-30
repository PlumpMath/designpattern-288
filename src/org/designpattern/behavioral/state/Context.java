package org.designpattern.behavioral.state;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/30/13
 * Time: 5:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }
    public void request(){
        if(null != state){
            this.state.handle(this);
        }
    }

    public void changeState(State state){
        if(null != state){
            this.state = state;
        }
    }
}
