package mary.lesson.two;

public class Summ {

    public static int summ(String[][] strArray)
            throws MyArraySizeException, MyArrayDataException {

        int sum = 0;

        if (strArray.length != 4) throw new MyArraySizeException();

        for (int i = 0; i < strArray.length; i++) {

            if (strArray[i].length != 4) throw new MyArraySizeException();

            for (int k = 0; k < strArray[i].length; k++) {
                try {
                    sum += Integer.parseInt(strArray[i][k]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, k);
                }
            }
        }
        return sum;
    }
}
