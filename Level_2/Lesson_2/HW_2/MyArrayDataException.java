package HW_2;

public class MyArrayDataException extends NumberFormatException{
    private static final String ERROR_MESSAGE = "Неверный формат элемента массива: [%d][%d]";

    public MyArrayDataException(int i, int j){
        super(String.format(ERROR_MESSAGE, i, j));
    }
}
