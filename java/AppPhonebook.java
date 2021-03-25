public class AppPhonebook {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Дудин", "123456");
        phonebook.add("Дуeeдин", "12345678");
        phonebook.add("Дуeeдин", "1234567811");
        phonebook.get("Дудин");
        phonebook.get("Дуeeдин");
        phonebook.get("3123");
    }


}
