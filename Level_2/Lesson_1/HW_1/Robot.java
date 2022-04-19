package HW_1;

public class Robot implements Player {
    private int id;
    private int maxHeight;
    private int maxLength;
    boolean result;


    public Robot(int id, int maxHeight, int maxLength) {
        this.id = id;
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
        this.result = true;
    }

    @Override
    public void run(int length) {
        if (maxLength < length) {
            result = false;
        } else if (result) {
            System.out.println("Робот " + id + " пробежал " + length + " метров!\n");
        }
    }

    @Override
    public void jump(int height) {
        if (maxHeight < height) {
            result = false;
        } else if (result) {
            System.out.println("Робот " + id + " прыгнул на " + height + " метров!\n");
        }
    }
}
