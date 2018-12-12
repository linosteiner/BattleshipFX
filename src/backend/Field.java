package backend;

public class Field {

    private Tile[][] tiles;
    private int height;
    private int width;

    public Field(int height, int width) {
        this.height = height;
        this.width = width;

        tiles = new Tile[height][width];
        for (int i = 0; i < height ; i++) {

            for (int j = 0; j < width; j++) {
                tiles[i][j] = new Tile(j, i);
            }

        }

    }
}
