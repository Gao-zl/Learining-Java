package ch04;

public class Student {
    // 定义一个学生类
    // 需要定义属性fields
    int id;
    String name;
    int age;
    // 调用一个computer类
    Computer pc;

    // 上面定义了三个属性，创建类的时候就会自动带着这三个属性
    // 光有属性，没有方法称为结构体（C语言中的称呼）
    // 因此下面定义方法，用于表示这个类的行为特征和功能实现
    void study(){
        System.out.println("Study hard! With My " + pc.brand + ".");
    }
    void play() {
        System.out.println("Playing Overwatch!");
    }

    // 构造方法，用于创建这个类的对象，无参的构造方法可以由系统自动构建
    Student() {
    }
    // 程序执行的入口
    public static void main(String[] args) {
        // new 即为创建一个类
        Student stu = new Student();
        stu.id = 1001;
        stu.name = "Gao-zl";
        stu.age = 22;

        Computer pc1 = new Computer();
        pc1.brand = "Apple";

        stu.pc = pc1;
        stu.study();
        stu.play();
    }


    // 一个java文件可以有多个类，但是只能有一个public定义的类
    static class Computer {
        String brand;
    }
}
