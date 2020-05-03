/**
 * 递归方法测试
 * @author Gao-zl
 */
package ch03;

public class RecursionTest {
    public static void main(String[] args) {
        // 一般不用递归，能够用递归的都可以用循环来写，并且递归花费太多时间和内存
        // 因此高性能要求的情况下一般使用循环来使用
        // 爬虫就是一个典型的递归程序
        System.out.println("==========随意递归测试===========");
        long d1 = System.currentTimeMillis();
        a();
        long d2 = System.currentTimeMillis();
        System.out.printf("递归用时：%sms%n",d2 - d1);

        System.out.println("=============阶乘递归测试================");
        long factorial_d1 = System.currentTimeMillis();
        System.out.printf("%d阶乘的结果为%s\n",16,factorial(16));
        long factorial_d2 = System.currentTimeMillis();
        System.out.printf("递归费时：%sms%n",factorial_d2 - factorial_d1);

        System.out.println("================普通循环求递归================");
        long factorialLoop_d1 = System.currentTimeMillis();
        System.out.printf("循环方式求阶乘结果为%s%n",factorialLoop(16));
        long factorialLoop_d2 = System.currentTimeMillis();
        System.out.printf("循环用时：%sms%n",factorialLoop_d2 - factorialLoop_d1);
    }

    // 随意的测试功能
    static int count = 0;
    static void a() {
        System.out.println("a");
        // 也可以直接调用自己的方法,会发生错误
        // a();
        // 因此要定义递归头和递归体
        count++;
        if (count < 10) {
            a();
            return;
        }
    }

    // 求阶乘的递归方法
    static long factorial(int n) {
        if (n == 1) { // 递归头
            return 1;
        }else  { // 递归体
            // 所做的事情：n! = n * (n-1)!
            return n * factorial(n-1);
        }
    }

    static long factorialLoop(int a) {
        int result = 1;
        while (a > 1) {
            result *= a * (a-1);
            a -= 2;
        }
        return result;
    }
}
