package HW_1_0;

public class Racetrack extends Barrier {
    private int length;

    public Racetrack(int height) {
        this.length = height;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void overcomeBarrier(Player player) {
        player.run(this);
    }
}
