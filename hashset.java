import java.util.*;
class hashset {
    
        public static void main(String[] args) {
            TreeSet< Integer > set = new TreeSet<>();
            set.add(7);
            set.add(2);
            set.add(3);
            set.add(1);
            set.add(5);
            System.out.println("TreeSet: " + set);
            System.out.println("Contains 3? " + set.contains(9));
            System.out.println("Remove 2: " + set.remove(8));
            System.out.println("TreeSet after removal: " + set.size());
            for(Integer x : set){
                System.out.println(x);
            }
        }
    }
 
   
