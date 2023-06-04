package runners;

public class Championsship  {
    public static void main(String[] args) {
        Obstacle[] obstacles = {
                new Track(1200),
                new Wall(30),
                new Track(2000),
                new Wall(140),
                new Track(3000),
                new Wall(250)
        };

        Runner [] runners = {
                new Cat("Персик", 1500, 300),
                new Cat("Персик", 1700, 220),
                new Robot("R238", 9999999, 0),
                new Robot("F456", 1000, 9999999),
                new Human("Ann", 6000, 400),
                new Human("Tom", 8000, 500),

        };

        for (Runner runner: runners) {
            for (Obstacle obstacle:obstacles) {
                if (obstacle instanceof Track) {
                    if (!runner.run(obstacle.getLength())) break;
                } else if (obstacle instanceof Wall) {
                    if (!runner.jump(obstacle.getHeigth())) break;
                }
            }
        }
    }
}
