import java.util.*;
import java.util.stream.Stream;

public class ArrayWords {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("привет");
        words.add("привет");
        words.add("она");
        words.add("сам");
        words.add("сам");
        words.add("брат");
        words.add("друг");
        words.add("вон");
        words.add("там");
        words.add("вон");
        words.add("как");
        words.add("его");
        words.add("она");
        words.add("ого");
        words.add("кто");
        words.add("как");
        words.add("оно");
        words.add("здесь");
        words.add("оно");
        words.add("это");
        words.add("пока");

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Первоначальный массив");
        System.out.println(words.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости слов");
        for (String word : unique) {
            System.out.println(word + ": " + Collections.frequency(words, word));
        }
    }
}
