/**
 * 构造方法
 * 构造器也叫构造方法(constructor)，用于对象的初始化。构造器是一个创建对象时被自动调用的特殊方法，
 * 目的是对象的初始化。构造器的名称应与类的名称一致。
 * Java通过new关键字来调用构造器，从而返回该类的实例，是一种特殊的方法。
 *
 * @author: Gao-zl
 */
package ch04;

public class TestConstructor {
    public static void main(String[] args) {
        Point p = new Point(3.0, 4.0);
        Point origin = new Point(0.0, 0.0);
        System.out.println(p.getDistance(origin));
    }
}
// 构造器[修饰符] 类名（形参列表）{ // n条语句}
// 构造器通过new关键字来调用
// 构造器虽然有返回值，但是不能定义返回值类型
// 如果我们没有定义构造器，编译器会自动定义一个无参的构造函数，如已定义编译器不会添加
// 构造器的方法名必须和类名一致

// 定义一个“点”Point类用来表示二维空间中的点，有两个坐标
// 要求为1、可以生成具有特定坐标的点的对象；
// 2、提供可以设置坐标的方法；
// 3、提供可以计算该“点”距另外一点距离的方法
class Point {
    double x, y;

    // 构造方法名称和类名必须保持一致
    public Point(double _x, double _y) {
        x = _x;
        y = _y;
    }

    public double getDistance(Point p) {
        return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
    }
}