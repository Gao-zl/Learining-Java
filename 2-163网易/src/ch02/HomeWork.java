/**
 * 第二章课后习题内容
 * @author Gao-zl
 */
package ch02;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        // 选择题
        // 1.以下选项中属于合法的Java标识符的是（CD）。（选择二项）
        //
        //A.public
        //
        //B.3num
        //
        //C.name
        //
        //D._age

        // 2.下面的代码段中，执行之后i和j的值是（ C）。（选择一项）
        //
        //int i=1;   int j;
        //j=i++;
        //
        //A1，1
        //
        //B.1，2
        //
        //C.2，1
        //
        //D.2，2

        //3.下面的赋值语句中错误的是（ A ）。（选择一项）
        //
        //
        //Afloat f = 11.1;
        //
        //B.double d = 5.3E12;
        //
        //C.double d = 3.14159;
        //
        //D.double d = 3.14D;

        //4.在Java中，下面（AB）语句能正确通过编译。（选择二项）
        //
        //
        //ASystem.out.println(1+1);
        //
        //B.char i =2+'2';
        //
        //System.out.println(i);
        //
        //C.String s="on"+'one';
        //
        //D.int b=255.0;

        //5.以下Java运算符中优先级别最低的两个选项是（AB）。（选择二项）
        //
        //
        //A赋值运算符=
        //
        //B.条件运算符 ?=
        //
        //C.逻辑运算符|
        //
        //D.算术运算符+

        // 简答题（略）

        // 编码题
        // 1.输入圆形半径，求圆形的周长和圆形的面积，并将结果输出。
        System.out.println("===========编码题一=========");
        System.out.println("请输入圆的半径：");
        Scanner sc = new Scanner(System.in);
        double round_r = sc.nextDouble();
        System.out.println("该圆的半径为：R=" + round_r);
        System.out.println("该圆的周长为：C=2*3.14*" + (int)round_r + "=" + (2*3.14*12.5));
        System.out.println("该圆的面积为：S=3.14*" + (int)round_r + (int)round_r + "=" + (3.14*round_r*round_r));

        // 2.银行利率表如下表所示，请计算存款10000元，活期1年、活期2年，定期1年，定期2年后的本息合计。
        // Math.round(double d)方法实现：即为四舍五入的方法
        System.out.println("============编码题二==========");
        int deposit = 10000;
        System.out.println("本金：" + deposit);
        System.out.println("活期1年本金总计：" + Math.round((deposit * 1.0035)));
        System.out.println("定期1年本金总计：" + Math.round((deposit * 1.0150)));
        System.out.println("活期2年本金总计：" + Math.round((deposit * 0.0035 * 2 + deposit)));
        System.out.println("定期2年本金总计：" + Math.round((deposit * 0.0210 * 2 + deposit)));

        // 3.某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：每位数字都加上5,然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。结果如图所示。
        System.out.println("============编码题三=========");
        System.out.printf("请输入一个4位正整数：");
        Scanner sc2 = new Scanner(System.in);
        int origin_code = sc2.nextInt();
        int origin_1 = origin_code / 1000;
        int origin_2 = (origin_code % 1000) / 100;
        int origin_3 = (origin_code % 100) / 10;
        int origin_4 = (origin_code % 10);
//        测试
//        System.out.println(origin_1);
//        System.out.println(origin_2);
//        System.out.println(origin_3);
//        System.out.println(origin_4);
        origin_1 = (origin_1 + 5) % 10;
        origin_2 = (origin_2 + 5) % 10;
        origin_3 = (origin_3 + 5) % 10;
        origin_4 = (origin_4 + 5) % 10;
        int final_1 = origin_4;
        int final_2 = origin_3;
        int final_3 = origin_2;
        int final_4 = origin_1;
        System.out.println("加密后的数字为：" + final_1 + final_2 + final_3 + final_4);
    }
}
