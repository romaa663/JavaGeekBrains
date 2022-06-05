package HW_1_0;

public class Wall extends Barrier {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void overcomeBarrier(Player player) {
        player.jump(this);
    }
}
