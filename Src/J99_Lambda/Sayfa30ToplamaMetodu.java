package J99_Lambda;

public class C7_DosyaOkuma {
    public static void main(String[] args) {
        int num=5;
        int sum =addNum(num);
        System.out.println("sum is:"+sum);

    }
    private static int addNum(int num) {
        if (num!=0){
            return num+addNum(num-1);

        }else return num;

    }
}
