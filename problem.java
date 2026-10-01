import java.util.*;

public class problem {
    public static void main(String[] args) {
       
        // int[] A = {1, 2, 3};
        // int[] B = {2, 3, 4, 5};
        HashMap<String, String> map = new HashMap<>();

        // count distinct elements in an array


        // for(Integer x:arr){
        //     set.add(x);
        // }
        // System.out.println("HashSet: " + set.size());

        
        // union of two arrays


        // for(Integer x : A){
        //     set.add(x);
        // }
        // for(Integer x : B){
        //     set.add(x);
        // }
        // System.out.println( set);
        


   

        HashMap<String, String> tickets = new HashMap<>();

        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = "Mumbai";

        while (tickets.containsKey(start)) {
            System.out.print(start + " -> ");
            start = tickets.get(start);
        }

        System.out.println(start);
    }
}

    