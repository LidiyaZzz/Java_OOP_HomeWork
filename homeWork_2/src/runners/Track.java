package runners;

public class Track extends Obstacle{
    private final int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getHeigth() {
        return 0;
    }
}
