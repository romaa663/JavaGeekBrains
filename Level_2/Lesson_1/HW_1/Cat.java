package HW_1;

public class Cat implements Player {
    private String name;
    private int maxHeight;
    private int maxLength;
    boolean result;

    public Cat(String name, int maxHeight, int maxLength) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
        this.result = true;
    }

    @Override
    public void run(int length) {
        if (maxLength < length) {
            result = false;
        } else if (result) {
            System.out.println("Кот " + name + " пробежал " + length + " метров!\n");
        }
    }

    @Override
    public void jump(int height) {
        if (maxHeight < height) {
            result = false;
        } else if (result) {
            System.out.println("Кот " + name + " прыгнул на " + height + " метров!\n");
        }
    }
}
