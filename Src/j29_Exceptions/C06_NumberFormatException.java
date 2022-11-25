package j29_Exceptions;

public class C06_NumberFormatException {
    private static String id;

    public static void main(String[] args) {
        // System.out.println("Integer.parseInt(id) = " + Integer.parseInt(id));//NumberFormatException
        try {
            System.out.println("Integer.parseInt(id) = " + Integer.parseInt(id));//NumberFormatException

        }catch (NumberFormatException e){
            System.out.println("rakam olmayan deger var");
        }

        System.out.println("hata handle edildi code calıstı");
    }




}
