package j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class deneme {
    public static void main(String[] args) {
        List<String> name= new ArrayList<>(Arrays.asList("Sema","Semra","Zümra"));
        System.out.println(name);
        for (int i=0;i<name.size();i++){
            name.set(i,name.get(i).toUpperCase());
            System.out.println(name);
            for (String w: name){
                w.toUpperCase();
                            }
            System.out.println(name);
        }
    }
}
