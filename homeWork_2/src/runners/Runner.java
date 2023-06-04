package runners;

public interface Runner {

    String getName();
    int getMaxRun();
    int getMaxJump();

    default boolean run(int length) {
        if (length <= getMaxRun()) {
            System.out.printf(" %s пробежал %d метров\n", getName(), length);
            return true;
        } else {
            System.out.printf("%s не может пробежать %d метров\n", getName(), length);
            return false;}
    }

    default boolean jump(int weigth) {
        if (weigth <= getMaxJump()) {
            System.out.printf("%s перепрыгнул %d сантиметров\n", getName(), weigth);
            return true;
        } else {
            System.out.printf("%s не может перепрыгнуть %d сантиметров\n", getName(), weigth);
            return false;}
    }
}
