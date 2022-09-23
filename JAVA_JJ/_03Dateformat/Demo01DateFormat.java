package JAVA_JJ._03Dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java.text.DateFormat:日期/时间格式化子类的抽象类
    作用：
    格式化（日期->文本） 解析（文本->日期）
    成员方法：
    String format(Date date) 将日期转换为文本
    Date parse(String source)  文本转换为日期

    DateFormat是一个抽象类，无法创建对象使用，可以使用它的子类SimpleDateFormat，
    构造函数：
    SimpleDateFormat(String pattern)用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat
    模式：
        区分大小写
 */
public class Demo01DateFormat {
    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();
    }
        /*
        使用DateFormat类中的方法parse，将文本解析为日期
        Date parse(String source) 按照指定的模式，把符合模式的字符串解析为Date日期
        使用步骤：
        1，创建指定对象，构造方法中传递指定的模式
        2，调用SimpleDateFormat对象中的方法parse，把符合构造方法中模式的字符串，解析为Date日期
         */
    private static void demo02() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH时mm分ss秒");
        Date date1 = sdf.parse("2010-12-12 12时12分12秒");
        System.out.println(date1);  //Sun Dec 12 12:12:12 CST 2010
    }

    /*
    使用
     */
    private static void demo01() {
        //1.创建SimpleDateFormat对象，构造方法中传递指定的模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH时mm分ss秒");
        //2.调用SimpleDateFormat对象中的方法format，按照构造方法中指定的模式，把Date日期格式化为符合模式的字符串（文本）
        Date date = new Date();
        String text = sdf.format(date);
        System.out.println(date);   //Fri Sep 23 22:00:42 CST 2022
        System.out.println(text);   //2022-09-23 22时00分42秒


    }
}
