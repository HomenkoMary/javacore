package mary.lesson.three;

public class MainApp {

    public static void main(String args[])
    {
        String[] strArray = {"5", "7", "3", "17"};
        swapObj(strArray, 0, 2);
    }

    /**
     * Меняем два элемента массива местами
     * @param array
     * @param firstIndex
     * @param secondIndex
     */
    static void swapObj(Object[] array, int firstIndex, int secondIndex) {

        System.out.print("Меняем два элемента массива местами");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        Object oneVal = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = oneVal;

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
