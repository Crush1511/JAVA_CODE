package JAVA_JJ.Review;

import java.util.Objects;

public class _Objects {
    public static void main(String[] args) {
//        String s1 = "abc";
        String s1 = null;
        String s2 = "abc";
//        boolean b = s1.equals(s2); //空值不能调用方法
//        System.out.println(b);
        boolean b1 = Objects.equals(s1, s2);
        System.out.println(b1);
    }
}
