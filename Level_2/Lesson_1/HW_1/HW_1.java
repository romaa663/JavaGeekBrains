package HW_1;

public class HW_1 {
    public static void main(String[] args) {

        Player[] player = new Player[5];
        player[0] = new Cat("Барсик", 2, 50);
        player[1] = new Person("Иван", 2, 800);
        player[2] = new Robot(1, 10, 500);
        player[3] = new Person("Alex", 3, 1500);
        player[4] = new Robot(2, 20, 1000);

        Barrier[] barrier = new Barrier[6];
        barrier[0] = new Treadmill(20);
        barrier[1] = new Wall(1);
        barrier[2] = new Treadmill(100);
        barrier[3] = new Treadmill(600);
        barrier[4] = new Wall(5);
        barrier[5] = new Treadmill(1000);

        for (Player players : player) {
            for (Barrier barriers : barrier) {
                barriers.cross(players);
            }
        }
    }
}


