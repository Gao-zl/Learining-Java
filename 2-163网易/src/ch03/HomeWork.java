/**
 * 第三章作业
 * @author Gao-zl
 */
package ch03;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        // 选择题：
        // 1.分析如下Java代码，编译运行的输出结果是(A)。(选择一项)
        // public static void main(String[ ] args) {
        //    boolean a=true;
        //    boolean b=false;
        //    if (!(a&&b)) {
        //        System.out.print("!(a&&b)");
        //    }else if (!(a||b)) {
        //        System.out.println("!(a||b)");
        //    }else {
        //        System.out.println("ab");
        //    }
        //}

        // 　　A!(a&&b)
        //
        //　　B.!(a||b)
        //
        //　　C.ab
        //
        //　　D.!(a||b)ab


        // 2.下列选项中关于变量x的定义，(BD)可使以下switch语句编译通过。(选择二项)
        //
        //switch(x) {
        //    case 100 :
        //        System.out.println("One hundred");
        //        break;
        //    case 200 :
        //        System.out.println("Two hundred");
        //        break;
        //    case 300 :
        //        System.out.println( "Three hundred");
        //        break;
        //    default :
        //        System.out.println( "default");
        //}
        //　　A.double x = 100;
        //
        //　　B.char x = 100;
        //
        //　　C.String x = "100";
        //
        //　　D.int x = 100;

        // 3.给定如下Java代码，编译运行的结果是(A)。(选择一项)
        //
        //public class Test {
        //    public static void main(String[] args) {
        //        int sum=0;
        //        for(int i=1;i<10;i++){
        //            do{
        //                i++;
        //                if(i%2!=0)
        //                    sum+=i;
        //            }while(i<6);
        //        }
        //        System.out.println(sum);
        //    }
        //}
        //　　A.8
        //
        //　　B.15
        //
        //　　C.24
        //
        //　　D.什么也不输出


        // 4.以下选项中添加到代码中横线处会出现错误的是(AC)。(选择二项)
        //
        //public class Test {
        //    public float aMethod(float a, float b) {
        //        return 0;
        //    }
        //}
        //　　A.
        //
        //public float  aMethod(float a, float b, float c) {
        //        return 0;
        //}
        //　　B.
        //
        //public float  aMethod(float c, float d) {
        //        return 0;
        //}
        //　　C.
        //
        //public int  aMethod(int a, int b) {
        //    return 0;
        //}
        //　　D.
        //
        //private int  aMethod(float a, float b) {
        //    return 0;
        //}

        // 5.以下关于方法调用的代码的执行结果是(B)。(选择一项)
        //
        //public class Test {
        //    public static void main(String args[]) {
        //        int i = 99;
        //        mb_operate(i);
        //        System.out.print(i + 100);
        //    }
        //    static void mb_operate(int i) {
        //        i += 100;
        //    }
        //}
        //　　A.99
        //
        //　　B.199
        //
        //　　C.299
        //
        //　　D.99100
        // 本题注意，由于mb_operate函数没有方法和返回值，因此操作无效

        // 二、简答题（略）
        // 1. if多分支语句和switch语句的异同之处。
        //  **相同之处：**两者都能实现多分支的处理。
        //  **不同之处：**两者的判断条件有所不同，if多分支语句的判断条件基本上都是布尔值，而switch语句的选项值可以是数据常量表达式、枚举常量，还可以是字符串字面量。而且，在处理多分支时，switch语句比if多分支语句更简洁。
        //　2. break和continue语句的作用。
        //  两者都能中断控制流程，break既可以用于循环语句中，也可以用于switch语句中，而continue只能用于循环语句中。break是终止循环，不再继续执行循环，而是执行循环语句之后的其他语句，而continue是中止本次循环，继续执行下一轮循环。
        //　3. 在多重循环中，如何在内层循环中使用break跳出外层循环。
        //  使用带标签的break语句可以在内层循环跳出外层循环。
        //　4. 方法重载的定义、作用和判断依据。
        //  方法的重载是指一个类中可以定义多个方法名相同，但参数不同的方法。编译器会用各个方法首部中的参数类型与特定方法调用中所使用的值类型进行匹配，来选出正确的方法。如果编译器找不到匹配的参数，就会产生编译时错误，因为根本不存在匹配。为了让方法名相同而形式参数不同的构造器同时存在，必须要用到方法重载。同时，尽管方法重载是构造器所必需的，但它也可以用于其他方法，且用法同样方便。
        //　5. 递归的定义和优缺点。
        //  递归的基本思想就是“自己调用自己”，一个使用递归技术的方法将会直接或者间接的调用自己。优点：对于简单的程序，使用递归能很好地解决一些问题。缺点：递归调用会占用大量的系统堆栈，内存消耗过大，在递归调用层次多时速度要比循环慢的多。

        // 三、编码题
        // 1、从键盘输入某个十进制整数数，转换成对应的二进制整数并输出。
        System.out.println("===============第一题===============");
        System.out.println("请输入十进制数：");
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        System.out.println("原始数值为：" + i1);
        System.out.println("二进制数为：" + Integer.toBinaryString(i1));

        // 2、 编程求：∑1+∑2+……+∑100。
        System.out.println("===============第二题==============");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
        }
        System.out.println("∑1+∑2+……+∑100的值为：" + sum);

        // 3、编写递归算法程序：一列数的规则如下: 1、1、2、3、5、8、13、21、34...... 求数列的第40位
        System.out.println("===============第三题================");
        System.out.println("斐波那契数列第40个为：" + Fibonacci03(40));
    }

    static int Fibonacci03(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }else {
            n = Fibonacci03(n - 2) + Fibonacci03(n - 1);
            return n;
        }
    }
}
