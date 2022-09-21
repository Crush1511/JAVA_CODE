package JAVA_JJ._01Object_class;

import java.util.Objects;
/*
Objects类的equals方法：对两个对象进行比较，防止空指针
 */
public class Demo03Objects {
    public static void main(String[] args) {
//        String s1 = "abc";
//        String s1 = "def";
        String s1 = null;
        String s2 = "def";
        /*
         boolean b = s1.equals(s2);  boolean b = s1.equals(s2);null是不能调用方法的，会抛出空指针异常
        System.out.println(b);

         */
        boolean b1 = Objects.equals(s1, s2);
        System.out.println(b1);
    }
}
