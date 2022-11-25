package j03_ScannerClass;

public class HelloWorld {


    public static void main(String[] args) {
        System.out.println("merhaba dünya");//bu komut konsola yazılan metni print eder
        // dan sonra yazılan ifadeler komut veya kod satırı olarak değil yorum olarak tanımlanır.

        /*
        bu araya yazılan her ifade yorum satırı olur java kod olarak derlemez
        başarı gayrete aşıktır.
        bahanesi olanın başarısı olmaz
             */
        //imlecin olduğu satır ctrl + d ile bir alt satıra kopyalanır.
        /*
     System.out.println("javacanlara selam olsun");// çalısmasını istemediğiniz kod satırının başına // yazarak  yoruma alınır
     System.out.println("javacanlara selam olsun");// çalısmasını istemediğiniz kod satırının başına // yazarak  yoruma alınır
     System.out.println("javacanlara selam olsun");// çalısmasını istemediğiniz kod satırının başına // yazarak  yoruma alınır
     System.out.println("javacanlara selam olsun");// çalısmasını istemediğiniz kod satırının başına // yazarak  yoruma alınır

               */
        /*
         TRICK: javada code satırı cümle (statement) sonuna mutlaka  ; koyulmalı code satırında kırmızı alt çizgi
      uyarısı "compile time error " CTE hatası uyarısı demektir. CTE düzeltilmeden code yazılmaz yazılan code çalışmaz.
            */

        System.out.println("adım soyadım : semra aydınlı");
        System.out.println("yaşım : 38");
        System.out.println("memleketim giresun");
        System.out.println("mesleğim : öğretmen");

        /*
        TRICK :
        print-> yazdırma işleminden sonraki komutu AYNI satırda devam ettirir.
        print In-> yazdırma işleminden sonraki komutu ALT satırda devam ettirir.
        javada space "boşluk" bir character olarak tanımlanır.
        s e m r a->9 karakter
         */

        float f1 = 12.45f;
        float f2 = 23.56f;
        double boy = 1.85;
        System.out.println(f1 + f2);//12.45*23.56 =293.322






    }

    }