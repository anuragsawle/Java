package collection;

import java.util.*;
import java.util.Map.Entry;

public class HashMapLoopExample1 {
   public static void main(String args[]) {
       
   // Creating a HashMap of String keys and String values
   HashMap<String, String> hashmap = new HashMap<String, String>();
   hashmap.put("Key1", "Value1");
   hashmap.put("Key2", "Value2");
   System.out.println("Iterating or looping map using entrySet and Iterator");
   // Iterating or looping using entrySet() method
   Set<Map.Entry<String, String>> entrySet1 = hashmap.entrySet();
   Iterator<Map.Entry<String, String>> entrySetIterator = entrySet1.iterator();
   while (entrySetIterator.hasNext()) {
       Entry<String, String> entry = entrySetIterator.next();
       System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
   }
 }
}