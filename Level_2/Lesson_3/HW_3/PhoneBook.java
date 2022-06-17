package HW_3;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String family, String phoneNumber) {
        ArrayList<String> number;
        if (phoneBook.containsKey(family)) number = phoneBook.get(family);
        else number = new ArrayList<>();
        number.add(phoneNumber);
        phoneBook.put(family, number);


    }

    public ArrayList<String> get(String family) {
        return phoneBook.getOrDefault(family, new ArrayList<>());

    }

    public HashMap<String, ArrayList<String>> getPhoneBook() {
        return phoneBook;
    }

}