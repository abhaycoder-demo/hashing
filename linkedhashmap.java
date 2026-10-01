import java.util.*;
public class linkedhashmap {
    public static void main(String[] args){
        LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
        map.put(101,"Abhay");
        map.put(104,"Rahul");
        map.put(103,"Aman");
        System.out.println("LinkedHashMap: "+map);
    }
}
