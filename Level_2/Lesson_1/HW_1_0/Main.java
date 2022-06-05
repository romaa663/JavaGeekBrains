package HW_1_0;

public class Main {
    public static void main(String[] args) {
        Player[] team = {
                new Cat("Барсик", 10, 10),
                new Robot("robot1", 40, 40),
                new Human("Ivan", 50, 50),
                new Human("Alex", 25, 250),
                new Robot("robot2", 400, 400)
        };

        Barrier[] barriers = {
                new Wall(5),
                new Racetrack(8),
                new Racetrack(45),
                new Wall(45),
                new Wall(44)
        };

        for (Player teams : team) {
            for (Barrier barrier : barriers) {
                barrier.overcomeBarrier(teams);
            }
            System.out.println();
        }

    }
}
