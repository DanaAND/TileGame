package gfx;

import java.awt.image.BufferedImage;

public class Assets {

    private static final int width =90, height = 100;

    public static BufferedImage player, dirt, grass, stone, tree;

    public static void init() {
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage( "/textures/tile.jpg"));

        player = sheet.crop(180,41, width, height);
        dirt = sheet.crop(2,200, width, height);
        grass = sheet.crop(640,200, width, height);
        stone = sheet.crop(544,350, width, height);
        tree = sheet.crop(180,640, width, height);

    }
}
