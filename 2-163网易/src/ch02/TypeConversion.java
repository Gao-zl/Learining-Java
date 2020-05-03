/**
 * 此程序用于类型转化说明
 * 包括自动类型转化和强制类型转化
 * @author: Gao-zl
 */
package ch02;

public class TypeConversion {
    public static void main(String[] args) {
        // 自动类型转化可以把容量小的数据转为大的
        System.out.println("========自动类型转化=======");
        int a = 324;
        long b = a;
        double d = b;
        // 范围限定，故如下方式就不行
        // a = b;
        // long e = 3.23F;
        float f = 123213L;

        // 特例,int可转其它的，只要不超过范围即可
        byte b2 = 123;

        // 强制类型转化
        System.out.println("=======强制类型转化=======");
        long g = 1254;
        System.out.println((int)g);

        // 基本类型常见错误
        // 主要为注意溢出的问题
        System.out.println("===========常见类型转化错误==========");
        int money = 1000000000; //10亿
        int years = 20;
        // 返回的total是负数，超过了int的范围
        int total = money*years;
        System.out.println("total="+total);
        // 返回的total仍然是负数。默认是int，因此结果会转成int值，再转成long。但是已经发生//了数据丢失
        long total1 = money*years;
        System.out.println("total1="+total1);
        // 返回的total2正确:先将一个因子变成long，整个表达式发生提升。全部用long来计算。
        long total2 = money*((long)years);
        System.out.println("total2="+total2);

    }
}
