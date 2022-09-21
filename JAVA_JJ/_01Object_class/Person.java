package JAVA_JJ._01Object_class;

public class Person {
    private String name;
    private  int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /*
    直接打印对象的地址值没有意义。需要重写Object类的toString方法
    打印对象的属性
     */

//    @Override
//    public String toString() {
//        return "Person{name="+name+",age="+age+"}";
//    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    /*
    Object类的equals方法默认比较两个对象的地址值，没有意义，需要重写equals（）方法，比较两个对象的属性值（name，age）
    问题：
    隐含多态
    Object obj = p2 = new Person();
    多态弊端：无法使用子类特有的内容（属性，方法）
    解决：向下转型
     */
    public boolean equals(Object obj){
        //如果传递参数为obj是this本身，直接返回true，提高程序效率
        if(obj == this){
            return true;
        }

        //增加一个判断，传递参数如果是null,提高程序的效率
        if(obj == null){
            return false;
        }
        /*
        判断：防止类型转换异常
         */
        if(obj instanceof Person){
            Person p = (Person)obj;
            //比较两个对象的属性：一个是调用方法的this（p1)，一个就是p(obj=p2)
            boolean b = this.name.equals(p.name) && this.age == age;
            return b;
        }
        //不是Person类型直接fanhuifalse
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
