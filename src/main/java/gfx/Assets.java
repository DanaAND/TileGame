package gfx;

import java.awt.image.BufferedImage;

public class Assets {

    private static final int width =60, height = 60;

    public static BufferedImage dirt, grass, rock, tree, flower, stone;
    public static BufferedImage[] player_down, player_up, player_left, player_right;
    public static BufferedImage[] btn_start;
    public static BufferedImage wood;
    public static BufferedImage stone_re;

    public static void init() {
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage( "/textures/tile_2.png"));
        SpriteSheet sheet1 = new SpriteSheet(ImageLoader.loadImage( "/textures/char.png"));
        SpriteSheet sheet2 = new SpriteSheet(ImageLoader.loadImage( "/textures/Tree.png"));
        SpriteSheet sheet3 = new SpriteSheet(ImageLoader.loadImage( "/textures/new_game.png"));
        SpriteSheet sheet4 = new SpriteSheet(ImageLoader.loadImage( "/textures/stone.png"));
        SpriteSheet sheet5 = new SpriteSheet(ImageLoader.loadImage( "/textures/tilee.png"));

        wood = sheet2.crop(254,15, 60, 45);
        stone_re = sheet5.crop(750,490, 40, 20);

        btn_start = new BufferedImage[2];
        btn_start[0] = sheet3.crop(43, 28, 186, 45);
        btn_start[1] = sheet3.crop(370, 28, 186, 45);

        player_down = new BufferedImage[2];
        player_up = new BufferedImage[2];
        player_left = new BufferedImage[2];
        player_right = new BufferedImage[2];

        player_down[0] = sheet1.crop(65, 195, 30, 45);
        player_down[1] = sheet1.crop(0, 195, 30, 45);

        player_up[0] = sheet1.crop(0, 338, 30, 45);
        player_up[1] = sheet1.crop(65, 338, 30, 45);

        player_left[0] = sheet1.crop(0, 244, 30, 45);
        player_left[1] = sheet1.crop(65, 244, 30, 45);

        player_right[0] = sheet1.crop(0, 290, 30, 45);
        player_right[1] = sheet1.crop(65, 290, 30, 45);

        dirt = sheet.crop(64,2, width, height);
        grass = sheet.crop(0,0, width, height);
        rock = sheet.crop(128,65, width, height);
        tree = sheet2.crop(0,92, 65, 160);
        stone = sheet4.crop(0,0, 54, 37);
//        flower = sheet2.crop(65,4, width, height);

    }
}
