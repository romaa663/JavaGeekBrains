package HW_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        String[] arrayString = {"Англия", "Америка", "Россия", "Дания", "Англия", "Австрия",
                "Германия", "Россия", "Англия", "Дания", "Египет", "Россия"};
        countString(arrayString);
        System.out.println();
        countStringCollections(arrayString);

        //Задание 2
        PhoneBook phoneBook1 = new PhoneBook();
        phoneBook1.add("Иванов", 89356);
        phoneBook1.add("Пупкин", 8954586);
        phoneBook1.add("Смирнов", 8954758);
        phoneBook1.add("Пупкин", 8545954);
        System.out.println(phoneBook1.getPhoneBook());
        System.out.println(phoneBook1.get("Пупкин"));


    }


    // Задание 1. 1-й вариант решения (без коллекций)
    private static void countString(String[] arrayString) {
        int[] arrayCount = new int[arrayString.length];
        arrayCount[0] = 1;
        int count = 0;

        for (int i = 1; i < arrayString.length; i++) {
            boolean metka = true;
            for (int j = 0; j <= count; j++) {
                if (arrayString[i].equals(arrayString[j])) {
                    arrayCount[j]++;
                    metka = false;
                    break;
                }
            }
            count++;
            if (metka) arrayCount[count]++;
        }

        for (int i = 0; i < arrayCount.length; i++) {
            if (arrayCount[i] > 0) {
                System.out.println(arrayString[i] + " встретилось " + arrayCount[i] + " раз!");
            }
        }
    }


    // Задание 1. 2-й вариант решения (с коллекциями)
    private static void countStringCollections(String[] arrayString) {
        HashSet<String> hashSet = new LinkedHashSet<>(Arrays.asList(arrayString));
        System.out.println("Уникальные слова: " + hashSet);

        HashMap<String, Integer> hashMap = new LinkedHashMap<>();
        for (String i : arrayString) {
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }
        System.out.println("Количество употреблений слов в массиве: " + hashMap);
    }
}