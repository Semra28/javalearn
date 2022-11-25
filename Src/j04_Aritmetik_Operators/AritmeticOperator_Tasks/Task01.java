package j04_AritmetikOperators.AritmeticOperator;

public class Task01 {
	public static void main(String[] args) {
		int x = 4;
        x++;//5
        x += x;//10
        --x;//9
        x = 7 + x;// 16
        x *= x;//256
        x -= 3;//256-256=3

        System.out.println(" x = " + x );
        
        int a = 3;
        double d = 4.5;

        d+=a;//7,5
        a+=d;//10,5
        d-=a;
        a-=d;

            System.out.println(" d = " + ++d );//-1.5
            System.out.println(" a = " + a-- );//12 yazdırır 11 hesaplar



    }

}
