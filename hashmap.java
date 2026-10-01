import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,1,3,1,5,1};
        HashMap<Integer, Integer> map = new HashMap<>();
        // map.put(1, "One");
        // map.put(2, "Two"); 
        // map.put(3, "Three");
        // System.out.println("HashMap: " + map);
        // System.out.println(map.get(2));
        // System.out.println(map.containsKey(3));
        // System.out.println(map.remove(4)); // This will return null since key 4 doesn't exist
        

// map.put(101, "Abhay");
// map.put(102, "Rahul");
// map.put(103, "Aman");
// map.put(104, "Rohit");
// map.put(105, "Ankit");

// Set<Integer> keys = map.keySet();
// System.out.println("Keys: " + keys);
// for(Integer k :keys)
// System.out.println(k + " : " + map.get(k));


// find frequency of each element in the array and print the elements which have frequency greater than n/3
 for(int i=0;i<arr.length;i++){
   if(map.containsKey(arr[i])){
    map.put(arr[i], map.get(arr[i]) + 1);
   } else {
    map.put(arr[i], 1);
   }
 }
 Set<Integer> keys = map.keySet();
 for(Integer k : keys){
    if(map.get(k) > arr.length/3){
        System.out.println(k + " : " + map.get(k));
    }
}

// valid anagram
    }
}