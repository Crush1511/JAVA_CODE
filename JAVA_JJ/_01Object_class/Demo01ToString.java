package JAVA_JJ._01Object_class;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Demo01ToString {
    public static void main(String[] args) {
        /*
        Person类默认继承Object类
         */
        Person p = new Person("张三",18);
        String s = p.toString();
        System.out.println(s);

        //直接打印对象的名字，其实就是调用对象的ToString方法  p = p.toString()
        System.out.println(p);

        /*
        看一个类是否重写toString方法，直接打印这个类对应的名字即可
        如果没有重写toString方法，那么打印的就是对象的地址值
         */
        Random r = new Random();
        System.out.println(r); //没有重写toString方法
        Scanner sc = new Scanner(System.in);
        System.out.println(sc); //重写toString方法
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);  //重写toString方法
    }
}
