package HW_3;

import java.util.ArrayList;
import java.util.HashMap;


public class PhoneBook {
    private HashMap<String, ArrayList<Integer>> phoneBook;

    public void add(String family, Integer phoneNumber) {
        ArrayList<Integer> number;
        if (phoneBook.containsKey(family)) number = phoneBook.get(family);
        else number = new ArrayList<>();
        number.add(phoneNumber);
        phoneBook.put(family, number);

    }

    public ArrayList<Integer> get(String family) {
        return this.phoneBook.get(family);
    }

    public HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;
    }

}