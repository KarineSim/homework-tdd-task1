import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {

    Map<String, String> phoneBook = new TreeMap<>();

    public int add(String name, String phoneNumber) {
        phoneBook.putIfAbsent(name, phoneNumber);
        return phoneBook.size();
    }
}
