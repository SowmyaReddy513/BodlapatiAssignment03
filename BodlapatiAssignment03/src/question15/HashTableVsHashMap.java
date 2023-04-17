package question15;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableVsHashMap {
    public static void main(String[] args) {
        // Creating a Hash Map
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Adding elements to the Hash Map
        hashMap.put(1, "Java");
        hashMap.put(2, "Python");
        hashMap.put(3, "C++");
        hashMap.put(null, "Null key");
        hashMap.put(4, null);
        System.out.println("Hash Map: " + hashMap);

        // Creating a Hash Table
        Hashtable<Integer, String> hashTable = new Hashtable<>();

        // Adding elements to the Hash Table
        hashTable.put(1, "Java");
        hashTable.put(2, "Python");
        hashTable.put(3, "C++");
        // error, not allowed null values
        // hashTable.put(null, "Null key");
        // hashTable.put(4, null);
        System.out.println("Hash Table: " + hashTable);
    }
}
