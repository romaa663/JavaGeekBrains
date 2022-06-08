package HW_2;

public class Main {
    private static int sum = 0;

    public static void main(String[] args) {
        String[][] arrayString = {
                {"34", "45", "67", "45"},
                {"51", "18", "11", "78"},
                {"54", "12", "67", "25"},
                {"50", "11", "68", "44"}
        };
        try {
            parseInteger(arrayString);
            System.out.println("Размер массива верный. \nЭлементы массива корректны. \nСумма элементов: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

    }

    public static void parseInteger(String[][] arrayString) throws MyArraySizeException, MyArrayDataException {
        for (int i = 0; i < arrayString.length; i++) {
            if (arrayString.length != 4 || arrayString[i].length != 4) throw new MyArraySizeException();
        }

        for (int i = 0; i < arrayString.length; i++) {
            for (int j = 0; j < arrayString[i].length; j++) {
                try {
                    int number = Integer.parseInt(arrayString[i][j]);
                    sum += number;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
    }
}
