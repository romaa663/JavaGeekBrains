package HW_1_0;

public class Cat implements Player {
    private String name;
    private int maxHeight;
    private int maxLength;
    private boolean count;

    public Cat(String name, int maxHeight, int maxLength) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
        this.count = true;
    }

    @Override
    public void isCount() {
        this.count = false;
    }

    @Override
    public boolean getCount() {
        return count;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

}
