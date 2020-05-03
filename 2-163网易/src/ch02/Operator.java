/**
 * 介绍运算符相关内容
 * @author Gao-zl
 */
package ch02;

public class Operator {
    public static void main(String[] args) {
        // 算术运算符
        // +、-、*、/、%、++、--
        // 由于需要两个数进行运算，称为二元运算符，自增和自减属于

        System.out.println("==============整数运算==============");
        // 整数运算：
        // 两数有一为long，结果为long；没有long，结果为int
        // 浮点运算：
        // 全为float运算才最终为float，否则为double
        byte b1 = 1;
        int i1 = 2;
        // 如下就是错的
        // byte b2 = b1 + i1;

        float f1 = 3.14F;
        // 产生强制类型转化
        float f2 = i1 + f1;
        System.out.println(f2);

        // 取余%，操作数可以为浮点数，一般使用的是整数，因为余数的符号和左边的操作数相同
        System.out.println("=============取余=============");
        System.out.println(7 % 3);
        System.out.println(-7 % 3);

        // 自增自减操作
        System.out.println("==============自增自减=============");
        int i2 = 3;
        int i3 = i2++;
        System.out.println("i2 = " + i2 + "\ni3 = " + i3);
        i2 = 3;
        i3 = ++i2;
        System.out.println("i2 = " + i2 + "\ni3 = " + i3);

        // 赋值运算及拓展赋值运算符
        System.out.println("========赋值运算及拓展赋值运算符=================");
        int i4 = 3;
        int i5 = 4;
        i4 += i5;
        System.out.println("i4 = " + i4 + "\ni5 = " + i5);
        i4 = 3;
        i4 *= i5 + 3;
        System.out.println("i4 = " + i4 + "\ni5 = " + i5);

        // 关系运算符
        System.out.println("=========关系运算符========");
        // 关系运算符的结果只有true或false两种
        // ==和!=是所有的数据类型都可以使用
        // >,>=,<,<=仅针对数值类型byte/short/int/long，float/double和char
        int i6 = 3;
        System.out.println(i6 == 3);
        System.out.println(i6 != 3);
        System.out.println(i6 < 5);

        char c2 = 'a';
        char c3 = 'c';
        System.out.println("显示c2、c3的值" + (int)c2 + "," + (int)c3);
        System.out.println(c2 == c3);

        // 逻辑运算符
        System.out.println("============逻辑运算符=============");
        // 用于操作布尔值，与、或、非、异或、短路与、短路或
        // 短路与的使用：如果前面为true，直接返回true，一般用短路与，比较简便
        boolean b2 = 1 > 2 && 2 >(3/0);
        System.out.println(b2);
        // 上述方式即不计算后续的内容，如果按如下方法，则会返回异常
        // boolean b3 = 1 > 2 & 2 > (3/0);
        // System.out.println(b3);

        // 位运算符
        System.out.println("===========位运算符===========");
        // 位运算符	说明
        // ~	    取反
        // &	    按位与
        // |	    按位或
        // ^	    按位异或
        // <<	    左移运算符，左移1位相当于乘2
        // >>	    右移运算符，右移1位相当于除2取商
        // 所有进行操作的内容都是对boolean的运算，和上面的逻辑运算不一样！
        int i7 = 3*2*2;
        // 左移一位相当于乘以一个2
        int i8 = 3<<2;
        int i9 = 12/2/2;
        // 右移一位相当于除以一个2
        int i10 = 12>>2;
        System.out.println("i7,i8 = " + (int)i7 + (int)i8);
        System.out.println("i9,i10 = " + (int)i9 + (int)i10);
        int i11 = 3;
        int i12 = ~3;
        System.out.println("~i12:"+(int)i12);

        // 字符串连接符
        System.out.println("===========字符串连接符=============");
        // 字符串连接符即为一直用到的+号
        // 只要其中一个用“”字符串，那么+不代表加号，代表连接符
        System.out.println("2" + 3);
        System.out.println(2 + 3);

        // 条件运算符
        System.out.println("=========条件运算符=============");
        // 又称三元运算符
        int score = 80;
        String type = score < 60 ? "不及格":"及格";
        System.out.println(type);

        int i13 = 100;
        System.out.println(i13 > 0?1:0);

        // 运算符的优先级
        // 优先级	运算符	类	结合性
        // 1	()	括号运算符	由左至右
        // 2	!、+（正号）、-（负号）	一元运算符	由左至右
        // 2	~	位逻辑运算符	由右至左
        // 2	++、--	递增与递减运算符	由右至左
        // 3	*、/、%	算术运算符	由左至右
        // 4	+、-	算术运算符	由左至右
        // 5	<<、>>	位左移、右移运算符	由左至右
        // 6	>、>=、<、<=	关系运算符	由左至右
        // 7	==、!=	关系运算符	由左至右
        // 8	&	位运算符、逻辑运算符	由左至右
        // 9	^	位运算符、逻辑运算符	由左至右
        // 10	|	位运算符、逻辑运算符	由左至右
        // 11	&&	逻辑运算符	由左至右
        // 12	||	逻辑运算符	由左至右
        // 13   ? :	条件运算符	由右至左
        // 14	=、+=、-=、*=、/=、%=	赋值运算符、扩展运算符	由右至左
        // 优先级非 > 与 > 或
        // 平时用优先级最好用括号括起来

    }
}
