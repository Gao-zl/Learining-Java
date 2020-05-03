/**
 * 本程序用于实现一些简单的代码说明与测试
 * 变量相关
 * @author Gao-zl
 */
package ch02;

import java.math.BigDecimal;

public class Test {

    // 自动赋初值0
    int member_i;
    static int static_i;

    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);

        // 声明变量，建议的是一般一行声明一个变量
        // double 8字节
        double salary;
        // long 8字节
        long earthPopulation;
        // int 4字节
        int age = 18;

        // 变量分类：局部变量，成员变量，静态变量
        // 后两者使用要学习面向对象
        // 局部变量:必须要先初始化才能使用
        // 从属于方法
        {
            // 正确做法
            int local_i = 5;
            int local_j = local_i + 1;
            System.out.println(local_j);
            // 错误写法，无法编译
            // int i;
            // int j = i + 1;
        }

        // 成员变量见开头定义的member_i
        // 从属于对象
        // 成员变量可以不用赋初值,会自动赋值上去
        // int=》0，double=》0.0，char=》‘\u0000’，boolean=》false

        // 静态变量，static variable
        // 从属于类，生命周期最长
        // 定义见开头定义的static_i

        // 常量Constant,规范为全大写。
        final String NAME = "Gao-zl";
        final double PI = 3.14;
        double r = 4;
        double area = PI * r * r;
        System.out.println("My name is" + NAME);
        System.out.println("Circle area is:" + area);

        // 基本数据类型，数据类型包括基本数据类型和引用数据类型
        // 基本数据类型三大类，8小类：数值型，字符型，布尔型
        // 基本数据类型：（括号内为长度）
        // 数值型-整数类型：byte(1)、short(2)、int(4)、long(8)
        // 数值型-浮点类型：float(4)、double(8)
        // 字符型：char(2)
        // 布尔型：boolean(1)
        // 引用数据类型：(全为4，代表对象的地址)
        // 类：class、接口：interface、数组

        // 整型常量和整型变量
        // 测试整型变量
        int a = 15;
        int b = 015;
        int c = 0x15;
        // 下面的内容不能写成System.out.println("xxx" + x);
        // 会导致输出的为字符类型
        System.out.println("10进制的15" );
        System.out.println(a);
        System.out.println("8进制的015" );
        System.out.println(b);
        System.out.println("16进制的0x15");
        System.out.println(c);

        // 后面加L表示这是一个long类型的常量
        // 大小写都给可以，只是大写好看点，小写和1重复
        long globalPopulation = 7400000000000L;
        System.out.println("Show the long number");
        System.out.println(globalPopulation);

        // 浮点型变量和BigDecimal的使用
        // 浮点型表示有两种方法十进制和科学计数法3.14、314E-2
        // 浮点数最大特点是不精确，一般用double，float只有7位
        // 一般位double，如果要转float，数后面要加f/F
        float f_a = 3.14F;
        // double 也可写作double d_b = 6.28d;
        double d_b = 6.28;
        double d_c = 628E-2;

        // 浮点数不精确，一定不要用比较
        float f_f = 0.1f;
        double d_g = 10/10;
        System.out.println("echo:double and float?");
        System.out.println(f_f==d_g);

        // 如果一定要做比较运算，用BigDecimal方法来进行浮点数的比较
        // 定义一个1.0的值
        BigDecimal bd = BigDecimal.valueOf(1.0);
        // 每次都减0.1
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        System.out.println(bd); //0.5
        System.out.println(1.0 -0.1 -0.1 -0.1 -0.1 -0.1); //0.5000000000000001

        BigDecimal bd2 = BigDecimal.valueOf(0.1);
        BigDecimal bd3 = BigDecimal.valueOf(1.0/1.0);
        System.out.println("bd2与bd3是否相等");
        System.out.println(bd2.equals(bd3));

        // 字符型变量/常量
        char char_a = 'T';
        char char_b = '高';
        char char_c = '\u0061';
        System.out.println("\\u0061为：" + char_c);

        // 转义字符,也是char
        // 遇到+时候，就会发生转为数字，如下
        System.out.println('a' + 'b');
        // 因此因该写成：
        System.out.println("" + 'a' + 'b');
        System.out.println("" + 'a' + '\t' + 'b');

        // 字符串时候
        String String_d = "abc";

        // boolean 类型的变量和常量
        // boolean在内存中占一位，不是一个字节！不可用0或1替代
        boolean man = true;
        // 一般在这个括号不加==，直接判断
        if (man) {
            System.out.println("男性");
        }




    }
}
