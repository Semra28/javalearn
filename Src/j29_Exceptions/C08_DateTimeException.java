package j29_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C08_DateTimeException {
    public static void main(String[] args) {
       //LocalDate date =LocalDate.of(2022,11,33);//RTE ->DateTimeException

       try{
           LocalDate date= LocalDate.of(2022,11,30);
           System.out.println("try block da bu yazıyı okuduysan excp fırlatmadı komut sorunsuz");

       }catch (DateTimeException e){
           System.out.println("bayım ahanda hatanız:"+e.getMessage());
           System.out.println("bayım kasım 33 çekmez ki ");
       }
        System.out.println("bayım sorun handle  edildi DEVAM EDİNİZ:");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur.
    }
}
