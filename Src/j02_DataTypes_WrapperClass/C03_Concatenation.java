package j02_DataTypes_WrapperClass;

public class C03_Concatenation {
    public static void main(String[] args) {
        String ad="semra";
        String soyad ="aydınlı";
         int a=7;
         int b=11;
// birden çok String variable ile farklı data type variable'ler + ile işleme alınırsa
 //java birleştirme yaparak yeni bir String oluşturur.
        System.out.println(ad+soyad+a+b);//

        System.out.println(a+ad+soyad+b);//7SemraAydınlı11

        System.out.println(a+b+ad+soyad);//18SemraAydınlı

        System.out.println(" "+a+b);//711

        System.out.println(ad+soyad+(a+b));//SemraAydınlı18

        System.out.println((a+b)+ad+soyad);//18SemraAydınlı

        System.out.println(ad+(a-b)+(a-b));//Semra-4-4

        System.out.println(ad+((a-b)+(a-b)));//Semra-8
        //mavi parantez özel yapı,siyah parantez genel yapı/



       char ch='1';//
System.out.println(ad+ch);//Semra1

System.out.println(a+ch+ad);//56Semra

System.out.println(ad+(ch+b));//Semra60  //burdaki ch tamsayı işleme girdi, bir tamsayı değeri aldı.

System.out.println(a+ad+ch);//7Semra1
// yukarda ch'ın stringle işleme girdi, karakter değeri kullanıldı,algoritma değeri 49 kullanmadık.

        // Bir den çok variable ile data type variable 'ler + ile işleme alınırsa

     /* TRICK -> char data turu isleme girdigi variables'in turune gore farkli işlem yapar
    eger isleme girdigi variables  aritmetik bir islemse  ascii değeri ile işelm yapar ->
     */
        // TRICK :) Bir aritmetik işlem içinde String kullanılırsa, aritmetik işlem önceliğine göre
        // işlem yapılıp String variable'a Concatenation yapılır.


    }

       }
