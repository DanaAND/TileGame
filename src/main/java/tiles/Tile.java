package tiles;

import jdk.nashorn.internal.objects.NativeUint8Array;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Tile {

    //STATIC STUFF HERE

    public static Tile[] tiles = new Tile[256];
    public static Tile grassTile = new GrassTile(0);
    public static Tile dirtTile = new DirtTile(1);
    public static Tile rockTile = new RockTile(2);
    public static Tile flowerTile = new FlowerTile(3);



    //CLASS

    public static final int TILEWIDTH= 60, TILEHEIGHT = 60;

    protected BufferedImage texture;
    protected final int id;

    public Tile(BufferedImage texture, int id) {
        this.texture = texture;
        this.id = id;

        tiles[id] = this;
    }

    public void tick(){

    }

    public void reneder (Graphics g, int x, int y){
        g.drawImage(texture,x,y,TILEWIDTH, TILEHEIGHT, null);
    }

    public boolean isSolid(){
        return false;
    }

    public int getId(){
        return id;
    }
}



































