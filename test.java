import java.util.*;

public class test{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please input the num: ");
        int n = sc.nextInt();
        fun(n);
    }

    // 0 1 1 2 3
    public static void fun(int n) {
        int font = 0;
        int end = 1;
        while(n > 1) {
            end = font + end;
            font = end - font;
            n--;
        }
        System.out.println(font);
    }
}