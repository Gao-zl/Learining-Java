/**
 * 方法简介
 * @author Gao-zl
 */
package ch03;

public class MethodTest {
    public static void main(String[] args) {
        // 方法是一段用来完成特定功能的代码片段，类似其它语言的函数
        // 实参的数目、数据类型和次序都要和所调用的匹配
        int num1 = 10;
        int num2 = 20;
        // 加了static能够在此处直接调用，否则需要new一个
        int sum = add(num1, num2);
        System.out.println("sum:" + sum);
        int sum2 = add(3,4,5);
        System.out.println(sum2);
        // 如果不加static就需要创建一个新的对象
        MethodTest add = new MethodTest();
        int c = add.add3(3,4,5);
        System.out.println(c);

        print();
    }
    // 定义add方法
    public static int add(int n1, int n2) {
        return n1 + n2;
    }
    public static int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    // 定义print方法
    public static void print() {
        System.out.println("Test Done.");
    }

    // 方法的重载，overload
    // 重载的方法实际是不同的方法，只是名称相同罢了。
    // 只有参数名称不同，不构成重载
    // 只有返回值不同，也不构成重载
    public int add3(int n1, int n2,int n3) {
        return n1 + n2 + n3;
    }

}
