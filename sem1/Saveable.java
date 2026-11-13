class test {}

abstract class Game {
    public abstract void init();
    public abstract void update();
    public abstract void draw();
}

public interface Saveable {
    public void save();
}

class Player {
    private double x;
    private double y;
}

class Enemy {
}

class Minigame1 extends Game implements Saveable {
    private Player player;
    private Enemy[] enemies;
}

class Minigame2 extends Game {
    private Player player;
}
