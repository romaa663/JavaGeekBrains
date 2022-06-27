package HW_5;

public class Main {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {
        float[] array = new float[SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1f;
        }

        firstMethod(array);
        secondMethod(array);

    }

    public static void firstMethod(float[] array) {
        long a = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                    Math.cos(0.4f + i / 2));
        }
        System.currentTimeMillis();
        System.out.println("One thread time: " + (System.currentTimeMillis() - a) + " mc.");
    }

    public static void secondMethod(float[] array) {
        long a = System.currentTimeMillis();

        float[] leftHalf = new float[HALF];
        float[] rightHalf = new float[HALF];
        System.arraycopy(array, 0, leftHalf, 0, HALF);
        System.arraycopy(array, HALF, rightHalf, 0, HALF);

        Thread thread1 = new Thread(() -> {
            setValue(leftHalf);
        });

        Thread thread2 = new Thread(() -> {
            setValue(rightHalf);
        });
        thread1.start();
        thread2.start();

        float[] mergedArray = new float[SIZE];
        System.arraycopy(leftHalf, 0, mergedArray, 0, HALF);
        System.arraycopy(rightHalf, 0, mergedArray, HALF, HALF);

        System.currentTimeMillis();
        System.out.println("Two thread time: " + (System.currentTimeMillis() - a) + " mc.");

    }

    public static void setValue(float[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                    Math.cos(0.4f + i / 2));
        }
    }

}





