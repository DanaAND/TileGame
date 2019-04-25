package entities.statics;

import gfx.Assets;
import items.Item;
import tilegame.Handler;
import tiles.Tile;

import java.awt.*;

public class Rock extends StaticEntity {
    public Rock(Handler handler, float x, float y) {
        super(handler, x, y, Tile.TILEWIDTH, Tile.TILEWIDTH);
        bounds.x = 25;
        bounds.y = (int) (height / 1.5f);
        bounds.width = width - 48;
        bounds.height = (int) (height - (height / 1.5f));

    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.stone,(int)(x - handler.getGameCamera().getxOffset()) ,
                (int)(y - handler.getGameCamera().getyOffset()), width, height, null);
    }

    @Override
    public void die() {
        handler.getWorld().getItemManager().addItem(Item.stoneItem.createNew((int)x,(int)y));
    }
}
