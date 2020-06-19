package collection;

import java.util.*;

class ConvertExample {
   public static void main(String args[]) {
   // Creating LinkedList Object    
   LinkedList<String> linkedlist = new LinkedList<String>();
   linkedlist.add("Mango");
   linkedlist.add("Banana"); 
   linkedlist.add("Pear");
   linkedlist.add("Apple");
   linkedlist.add("Orange");
   // Converting LinkedList to ArrayList
   List<String> list = new ArrayList<String>(linkedlist);

   for (String str : list){
     System.out.println(str);
   } 
 }
} 