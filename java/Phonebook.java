import java.lang.reflect.Array;
import java.util.*;

public class Phonebook {
    private HashMap <String, List <String>> book;

    public Phonebook() {
        this.book = new HashMap<>();
    }

    public void add(String surname, String phoneNumb){
        if(book.containsKey(surname)){
            List <String> phoneNumbs = book.get(surname);
            if (!phoneNumbs.contains(phoneNumb)){
                phoneNumbs.add(phoneNumb);
                System.out.printf("Номер %s добавлен для фамилии %s\n",phoneNumb, surname);
                System.out.println("=====================");
            }else {
                System.out.printf("Номер %s уже добавлен для фамилии %s\n",phoneNumb, surname);
                System.out.println("=====================");
            }
        }else {
            book.put(surname, new ArrayList<>(Arrays.asList(phoneNumb)));
            System.out.printf("Номер %s добавлен для фамилии %s\n",phoneNumb, surname);
            System.out.println("=====================");
        }
    }

    public void get(String surname) {
        if (book.containsKey(surname)) {
            if (book.values().size() >= 1){
                System.out.println(surname + ": " + book.get(surname));
                System.out.println("=====================");
            }
        }else {
            System.out.printf("Такой фамилии нет %s\n", surname);
            System.out.println("=====================");
        }
    }
}
