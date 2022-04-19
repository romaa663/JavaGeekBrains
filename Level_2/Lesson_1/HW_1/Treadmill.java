package HW_1;

public class Treadmill implements Barrier{
    private final int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public void cross(Player player) {
        player.run(length);
    }
}

