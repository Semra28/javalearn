package j36_Map;

import java.util.HashSet;

public class Set_Task { /*
    Task
    Parametre olarak bir String HashSet   ve  iki String alan  return type HashSet
    olan  changeSet() isminde bir method oluşturun.
    Eğer HashSet String 1 e sahipse,HashSet'in  String 1 elemanını String 2 ile değiştirin.
    ÖRNEK:
    hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
    String 1 = banana
    String 2 = peach
    CEVAP: "peach" , "strawberry" , "kiwi" , "pineapple"
     */
    public static <Hashset> void main(String[] args) {
        String str="banana";
        String str2="peach";
        Hashset<String>hs=new HashSet<>();
        hs.add("banana");
        hs.add("strawberry");
        hs.add("kiwi");
        hs.add("pineapple");
        System.out.println("changeset(str,str2,hs)="+changeset(str,str2,hs));


    }

    private static <Hashset> String changeset(String str, String str2, Hashset hs) {
        if (hs.contains(str)){
            hs.remove(str);
           hs.add(str2);
            }

    }


