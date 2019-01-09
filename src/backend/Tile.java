package backend;


public class Tile {

    private int x;
    private int y;
    boolean isShip;
    // true = ship, false = water
    boolean shot;
    // true = tile has been shot, false = tile has not been shot


    public Tile(int x, int y) {
        this.x = x;
        this.y = y;
        shot = false;
    }
}