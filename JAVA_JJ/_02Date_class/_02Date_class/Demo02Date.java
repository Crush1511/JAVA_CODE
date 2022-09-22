package JAVA_JJ._02Date_class;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
//        demo01();
//        demo02();
        demo03();
    }
        /*
          Date类的成员方法
          long getTime()把日期转换为毫秒
           */
    private static void demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);  //1663834179325
    }



        /*
        Date(long date):传递毫秒值，把毫秒转换为Date日期
         */
    private static void demo02() {
//        Date d1 = new Date(0L);
        Date d2 = new Date(12873836);

//        System.out.println(d1);
        System.out.println(d2);

    }
        /*
        Date类的空参数方法：
        获取的就是当前系统的日期和时间
         */
    private static void demo01() {
        Date date = new Date();
        System.out.println(date); // Thu Sep 22 16:03:30 CST（China System Time） 2022 当前系统时间

    }
}
