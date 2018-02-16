package data;

import static helpers.Artist.QuickLoad;

import static helpers.Clock.*;

public class Game {

    private TileGrid grid;
    private Player player;
    private WaveManager waveManager;

    private float test;

    public Game(int[][] map) {
        grid = new TileGrid(map);

        waveManager = new WaveManager(new Enemy(QuickLoad("UFO64"), grid.GetTile(10,8), grid,64,64, 70),
                2, 2);
        player = new Player(grid, waveManager);


    }
    public void update(){
        test += Delta();
        System.out.println(test);

        grid.Draw();
        waveManager.update();
        player.update();

    }
}
