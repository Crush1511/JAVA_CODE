package JAVA_JJ._05System;

import JAVA_JJ.Review._toString;

import java.util.Arrays;

/*
    java.lang.System类中提供大量的静态方法，可以获取与系统相关的信息或系统操作，在System类中的API文档中，常用的方法有：
        public static long currentMillis():返回以毫秒为单位的当前时间
        public static void arraycopy(Object src,int srcPos,Object dest,int length):将数组中指定的数据拷贝到另一个数组中
 */
public class Demo01System {
    public static void main(String[] args) {
        demo01();
        demo02();
    }
/*
public static void arraycopy(Object src,int srcPos,Object dest,int length):将数组中指定的数据拷贝到另一个数组中
    参数：
    src  源数组
    srcPos 源数组中的起始位置
    dest 目标数组
    destPos 目标数组中的起始位置
    lengh 要复制的数组元素的数量
 */
    private static void demo02() {
        //定义源数组
        int [] src = {1,2,3,4,5};
        //定义目标数组
        int [] dest = {6,7,8,9};
        System.out.println("复制前："+ Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,3);
        System.out.println("复制后："+ Arrays.toString(dest));

    }

    /*
    public static long currentTimeMillis():返回以毫秒为单位的当前时间，用来测试程序的效率

     */
    private static void demo01() {
        //程序执行前
        long s = System.currentTimeMillis();
        for (int i = 1; i < 9999; i++) {
            System.out.println(i);
        }
        //程序执行后在获取一次毫秒值
        long e = System.currentTimeMillis();
        System.out.println("程序共耗时："+(e-s)+"毫秒");
    }
}
