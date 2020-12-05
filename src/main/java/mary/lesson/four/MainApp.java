package mary.lesson.four;

import java.util.*;

public class MainApp {

    public static void main(String args[])
    {
        UniqueWords.getWords();
        System.out.println("===");
        PhoneBook book = new PhoneBook();

        System.out.println("Укажите имя абонента для поиска:");
        Scanner console = new Scanner(System.in);
        String abonentName = console.nextLine();
        System.out.println(PhoneBook.getRecord(abonentName));
    }

}
