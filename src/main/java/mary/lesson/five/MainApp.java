package mary.lesson.five;

import mary.lesson.four.PhoneBook;
import java.io.IOException;

public class MainApp {

    public static void main(String args[]) throws IOException
    {
        mary.lesson.four.PhoneBook book = new PhoneBook();
        String dataSet = mary.lesson.four.PhoneBook.getAllRecord();
        FileSystem.WriteDataToFile(dataSet);

        FileSystem.ReadDataFromFile("dataForRead.txt");
    }
}
