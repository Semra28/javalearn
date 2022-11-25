package Tasks3;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		int x = 4;
        x++;//(4+1)=
       // x += x;5//(5+5)=10
       // --x;//(10-1)=9
        x = 7 + x;//(9+7)=16
        x *= x;//(16*16)=256
        x -= 3;//(256-3)=253

        System.out.println(" x = " + x );//253
        
        int a = 3;
        double d = 4.5;

        d+=a;//7,5
        a+=d;//12
        d-=a;//9
        a-=d;//4,5

        System.out.println(" d = " + ++d );

	}

}
