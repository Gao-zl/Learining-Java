/**
 * 循环结构
 * @author Gao-zl
 */
package ch03;

public class LoopStructure {
    public static void main(String[] args) {
        // 包括当型和直到型，一般用当型
        // while循环
        System.out.println("===============while循环==============");
        int i1 = 0;
        int sum1 = 0;
        // 1 + 2 + 3 + ... +
        while (i1 <= 100) {
            sum1 = sum1 + i1;
            i1++;
        }
        System.out.println("Sum of 1 to 100:" + sum1);

        System.out.println("================while循环100以内的奇数及偶数的和=================");
        int i_1 = 0;
        int sum_1 = 0;
        while (i_1 <= 100)  {
            if (i_1 % 2 == 0) {
                sum_1 = sum_1 + i_1;
            }
            i_1++;
        }
        System.out.println("Sum of cardinal number from 1 to 100 :" + sum_1);

        int i_2 = 0;
        int sum_2 = 0;
        while (i_2 <= 100) {
            if (i_2 % 2 == 1) {
                sum_2 = sum_2 + i_2;
            }
            i_2++;
        }
        System.out.println("Sum of even number from 1 to 100:" + sum_2);


        System.out.println("================while循环计算1000以内能被5整除的数==============");
        int i_3 = 1;
        // 计数的功能j_3
        int j_3 = 0;
        // 1000以内的数获取
        while (i_3 < 1000) {
            // 用5取余为0
            if (i_3 % 5 == 0) {
                // 注意print只能输出String，而println能够输出int等
                // print即可，不用printf
                System.out.print(i_3 + " ");
                // 计数+1
                j_3++;
                // 当一行达到5个的时候，换行
                if (j_3 % 5 == 0) {
                    System.out.println();
                }
            }
            i_3++;
        }
        System.out.println();

        // do while循环
        System.out.println("================do-while循环================");
        int i2 = 0;
        int sum2 = 0;
        do {
            sum2 = sum2 + i2;
            i2++;
        }while(i2 <= 100);
        System.out.println("Sum of 1 to 100:" + sum2);

        // for循环
        System.out.println("=================for循环==================");
        int sum3 = 0;
        // for中定义的int别丢
        for(int i3= 0;i3<=100;i3++) {
            sum3 = sum3 + i3;
        }
        System.out.println("Sum of 1 to 100:" + sum3);

        // 嵌套循环
        // 多个for循环起来
        System.out.println("==================嵌套循环=================");
        for (int i4 = 1; i4 <= 5; i4++) {
            for (int j4 = 1; j4 <= 3; j4++){
                // 打印行号，每一行都一样
                System.out.print(i4 + " ");
            }
            System.out.println();
        }

        System.out.println("=================嵌套循环绘制99乘法表===================");
        for (int i5 = 1; i5<=9; i5++) {
            for (int j5=1; j5<=9; j5++) {
                // 打印出行和列的数据，输出结果
                System.out.print(i5 + "*" + j5 + "=" + i5*j5 + "  ");
                // 特例，如果行号小于列号，那么跳出本次循环，实现阶梯的效果
                if (i5 < j5) {
                    break;
                }
                // 上面几行也可用如下来替代，直接将判断条件写入到一条语句中
                // System.out.print(j5 + "*" + i5 + "=" + (i5 * j5 < 10 ? (" " + i5 * j5) : i5 * j5) + "  ");
            }
            System.out.println(" ");
        }

        // break和continue
        // break跳出本次循环，不执行继续的语句，continue继续执行接下去的语句。
        // continue:把100-150之间不能被3整出的数输出，并且每行输出5个
        System.out.println("===========continue:把100-150之间不能被3整出的数输出==============");
        int count = 0; // define a counter
        for (int i = 100; i < 150; i++) {
            // 如果是三的倍数，则跳过本次循环
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + " ");
            count++;
            if (count % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        // 带标签的break
        // 实现java中的goto的功能，goto虽然是保留字，但是不被使用
        System.out.println("========goto打印101-150之间的质数=============");
        outer: for (int i = 101; i < 150 ; i++) {
            for (int j = 2; j < i/2; j++) {
                if (i % j == 0) {
                    continue outer;
                }
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
