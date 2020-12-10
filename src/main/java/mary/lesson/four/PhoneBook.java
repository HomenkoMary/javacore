package mary.lesson.four;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {

    private static HashMap<String, List<String>> PhoneBook;

    public PhoneBook(){
        PhoneBook = new HashMap<String, List<String>>();

        this.addRecord("Иванов", "9179520001");
        this.addRecord("Иванов", "9179520002");
        this.addRecord("Петров", "9179520003");
        this.addRecord("Сидоров", "9179520004");
        this.addRecord("Иванов", "9179520005");
    }

    public static void addRecord(String abonentName, String phoneNumber)
    {
        if(PhoneBook.containsKey(abonentName)){
            List<String> numbers = PhoneBook.get(abonentName);
            if(!numbers.contains(phoneNumber)){
                numbers.add(phoneNumber);
                System.out.println(String.format("Абоненту %s добавлен номер %s", abonentName, phoneNumber));
            } else {
                System.out.println(String.format("У абонента %s уже есуществует запись с номером %s", abonentName, phoneNumber));
            }
        } else {
            PhoneBook.put(abonentName, new ArrayList<String>(Arrays.asList(phoneNumber)));
            System.out.println(String.format("Абоненту %s добавлен номер %s", abonentName, phoneNumber));
        }
    }

    public static List<String> getRecord(String abonentName)
    {
        if(PhoneBook.containsKey(abonentName)){
            return PhoneBook.get(abonentName);
        } else {
            System.out.println(String.format("Абонент %s не найден :(", abonentName));
            return null;
        }
    }

    public static String getAllRecord()
    {
        return PhoneBook.toString();
    }

}
