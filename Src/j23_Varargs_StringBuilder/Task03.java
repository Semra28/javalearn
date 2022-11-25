package j23_Varargs_StringBuilder;

public class Task03 {
    public static void main(String[] args) {
       /*
Task ->  girilen bir sayı ile girilen String'lerin en uzun harf sayısını çarpıp print eden METHOD create ediniz.
 */


        int sayi = 5;
        String str1 = "Semra";
        String str2 = "Emine";
        String str3 = "Sinan";
        carpStringEnUzun(sayi,str1,"javacan",str2,str3);//45


    }//main sonu
    public static void carpStringEnUzun(int carpacakSayi, String...str){
        String enUzun="";
        for (String a:str){
            if (a.length()>enUzun.length()){
                enUzun=a;
            }
        }
        System.out.println("istediğin değer:"+ (carpacakSayi*enUzun.length())+" "+enUzun);
}
    }