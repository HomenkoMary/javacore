package mary.lesson.two;

public class MyArrayDataException extends CustomException {

    public MyArrayDataException(int row, int col) {
        super(String.format("По адресу [%d, %d] немогу начти числовое значение", row, col));
    }
}
