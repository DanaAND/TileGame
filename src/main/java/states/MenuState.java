package states;

import gfx.Assets;
import tilegame.Game;
import tilegame.Handler;
import ui.ClickListener;
import ui.UIImageButton;
import ui.UIManager;

import java.awt.*;

public class MenuState extends State {

    private UIManager uiManager;

    public MenuState (Handler handler){
        super(handler);
        uiManager = new UIManager(this.handler);
        handler.getMouseManager().setUiManager(uiManager);

        uiManager.addObject(new UIImageButton(240, 150, 160, 45, Assets.btn_start, new ClickListener() {
            @Override
            public void onClick() {
                handler.getMouseManager().setUiManager(null);
                State.setState(handler.getGame().gameState);
            }
        }));
    }

    public void tick() {
        uiManager.tick();
    }

    public void render(Graphics g) {
        uiManager.render(g);
    }
}
