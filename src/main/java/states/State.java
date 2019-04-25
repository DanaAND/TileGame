package states;

import tilegame.Game;
import tilegame.Handler;

import java.awt.*;

public abstract class State {

    private static State currentState = null;

    public static void setState(State state){
        currentState = state;
    }

    public static State getState(){
        return currentState;
    }

    //CLASS

    protected Handler handler;

    public State(Handler handeler){
        this.handler = handeler;
    }

    public abstract void tick();

    public abstract void render(Graphics g);
}
