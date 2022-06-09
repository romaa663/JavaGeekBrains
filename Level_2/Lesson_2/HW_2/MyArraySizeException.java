package HW_2;

public class MyArraySizeException extends RuntimeException{
    private static final String ERROR_MESSAGE = "Неверный размер массива";

    public MyArraySizeException(){
        super(ERROR_MESSAGE);

    }
}
