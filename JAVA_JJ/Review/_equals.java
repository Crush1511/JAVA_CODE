package JAVA_JJ.Review;

public class _equals {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        boolean b = s1.equals(s2);
        System.out.println(b);
        Student stu1 = new Student("张三",01);
        Student stu2 = new Student("张三",01);
        boolean b2 = stu1.equals(stu2);
        System.out.println(b2);   //重写equals之前 false,重写方法后

    }
}
