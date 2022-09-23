package JAVA_JJ._03Dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
    计算一个人出生了多少天
    分析：
    1.使用Scanner类中的方法next，获取出生日期
    2.使用DateFormat类的方法parse，把字符串的出生日期解析Date格式
    3.把Date格式的出生日期转换为毫秒值
    4.获取当前日期，转换为毫秒值
    5.使用当前日期-出生日期的毫秒值
    6.把毫秒值转换为天（s/1000/60/60/24）
 */
public class _birthday_cal {
    public static void main(String[] args) throws ParseException {
        // 1.使用Scanner类中的方法next，获取出生日期
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入出生日期，格式为yyyy-MM-dd");
        String birthdayDateString = sc.next();
       // 2.使用DateFormat类的方法next，把字符串的出生日期解析Date格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayDateString);
        //3.把Date格式的出生日期转换为毫秒值
        long birthdayDateTime = birthdayDate.getTime();
        //4.获取当前日期，转换为毫秒值
        long todayTime = new Date().getTime();
        // 5.使用当前日期-出生日期的毫秒值
        long time = todayTime - birthdayDateTime;
        // 6.把毫秒值转换为天（s/1000/60/60/24）
        System.out.println(time/1000/60/60/24);
    }
}
