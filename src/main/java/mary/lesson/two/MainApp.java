package mary.lesson.two;

public class MainApp {
    public static void main(String args[])
    {
        String[][] strArray = {
                {"5", "7", "3", "17"},
                {"7", "0", "1", "12"},
                {"8", "1", "2", "3"},
                {"4", "5", "1", "7"},
        };

        try {
            System.out.println(Summ.summ(strArray));
        } catch (Exception e) {
            e.getMessage();
        }

    }
}
