package JAVA_JJ._01Object_class;

import java.util.Random;

public class Demo02Equals {
    public static void main(String[] args) {
        /*
        Person类继承了Object类，所以可以使用Object类中的equals（）方法

          public boolean equals(Object obj) {
             return (this == obj);
          }
          参数：
          Object obj：可以传递任意的对象
          方法体：
          ==：比较运算符，返回布尔值 true,false
          基本数据类型：比较的是值
          引用数据类型：比较两个对象的地址值
         */
        Person p1 = new Person("迪丽热巴",10);
        Person p2 = new Person("迪丽热巴",10);
//        Person p2 = new Person("王淑美",19);
        
//        p1 = p2;
        Random r = new Random();
//        boolean b = p1.equals(p2);
//        boolean b = p1.equals(r);
        boolean b = p1.equals(null);
        System.out.println(b);
//        p1 = p2;
//        System.out.println("p1"+p1);
//        System.out.println("p2"+p2);

    }
}
