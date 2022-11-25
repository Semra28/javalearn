package Day11;

import java.time.LocalDate;

public class Q01_LocalDate {
    //Bugunun tarihini aliniz , yazdırınız...
    //Daha Sonra 1 gun 1 Ay ve 1 Yil ekleyerek degisen tarihi yazdiriniz..
    //Degişen tarih uzerinden 3 gun ,2 ay ve 5 yil eksilterek son tarihi yaziniz..

public static void main (String[] args){
   LocalDate bugun=LocalDate.now();
    System.out.println("bugun = " + bugun);

    LocalDate degisenTarih= bugun.plusDays(1).plusMonths(1).plusYears(1);
    System.out.println("degisenTarih = " + degisenTarih);

    LocalDate sonTarih= degisenTarih.minusDays(3).minusMonths(2).minusYears(5);
    System.out.println("sonTarih = " + sonTarih);

}



}
