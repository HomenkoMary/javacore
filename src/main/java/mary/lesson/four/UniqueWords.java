package mary.lesson.four;

import java.util.*;

public class UniqueWords {
    public static void getWords()
    {
        List<String> words = Arrays.asList(
                "Петр", "Иван", "Сергей", "Николай", "Юлия", "Иван", "Тамара", "Инокентий", "Вадим", "Петр",
                "Василиса", "Роман", "Тамара", "Георгий", "Василий", "Эдуард", "Роман", "Сергей", "Вадим", "Анатолий"
        );

        Set<String> uniqueWords = new HashSet<String>(words);

        System.out.println("Список уникальных слов");
        System.out.println(uniqueWords.toString());

        System.out.println("Частота встречаемости слов");
        for (String key : uniqueWords) {
            System.out.print(key + ": " + Collections.frequency(words, key) + ", ");
        }
        System.out.println();
    }
}
