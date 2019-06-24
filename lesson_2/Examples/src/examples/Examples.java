package examples;

import java.util.ArrayList;
import java.util.LinkedList;

public class Examples {

    public static void main(String[] args) {
        int some[] = new int[4];
        
        ArrayList<Integer> some_dyn = new ArrayList<>(5);
        some_dyn.add(56);
        some_dyn.add(6);
        some_dyn.add(5);
        some_dyn.add(7);
        some_dyn.add(435);
        some_dyn.add(8);
        
//        some_dyn.clear();
        some_dyn.remove(1);
        
        for(Integer x : some_dyn)
               System.out.println(x);
//            System.out.println(some_dyn.size());

        LinkedList<String> names = new LinkedList<>();
        names.add("Tom");
        names.add("George");
        names.add("John");
   
     
        names.add(1,"Alex");
        
        for(String x : names)
               System.out.println(x);
    }
    
}
