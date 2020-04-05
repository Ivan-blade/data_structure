import java.util.*;

public class test {
    public static void main(String args[]) {
        // 删除字符串a中与b字符串匹配的部分并返回新的字符串
        String a = "123456789456132";
        String b = "456";
        a = a.replace(b,"");
        System.out.println(a);
    }
}