package HW_1;

public class Wall implements Barrier {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void cross(Player player) {
        player.jump(height);
    }
}
