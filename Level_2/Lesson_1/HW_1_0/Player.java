package HW_1_0;

public interface Player {
    String getName();

    int getMaxHeight();

    int getMaxLength();

    void isCount();

    boolean getCount();

    default void jump(Wall wall) {
        if (getCount()) {
            if (getMaxHeight() >= wall.getHeight()) {
                System.out.println(getName() + " прошел испытание \"Стена\": " + wall.getHeight() + " метров!");
            } else {
                System.out.println(getName() + " не смог пройти испытание \"Стена\": " + wall.getHeight() + " метров!");
                isCount();
            }
        }

    }

    default void run(Racetrack racetrack) {
        if (getCount()) {
            if (getMaxLength() >= racetrack.getLength()) {
                System.out.println(getName() + " прошел испытание \"Стена\": " + racetrack.getLength() + " метров!");
            } else {
                System.out.println(getName() + " не смог пройти испытание \"Стена\": " + racetrack.getLength() + " метров!");
                isCount();
            }
        }

    }

}
