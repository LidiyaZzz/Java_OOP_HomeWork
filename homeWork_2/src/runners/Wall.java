package runners;

public class Wall extends Obstacle{
    private final int heigth;

    public Wall(int heigth) {
        this.heigth = heigth;
    }

    @Override
    public int getLength() {
        return heigth;
    }

    @Override
    public int getHeigth() {
        return 0;
    }
}
