/**
 * 选择结构说明
 * @author Gao-zl
 */
package ch03;

public class SelectStatement {
    public static void main(String[] args) {
        System.out.println("=============if单选择=============");
        // if 单选择结构
        // Math.random()返回0-1区间的值,不包括1
        double d = Math.random();
        System.out.println(d);
        // 上述的结果生成0-6之间的正整数,加1变成1-7
        int i_1 = (int)(Math.random() * 6)+ 1;
        System.out.println(i_1);

        if(i_1 < 3) {
            System.out.println("small");
        }

        // test
        int i = (int)(6 * Math.random()) + 1;//通过Math.random()产生随机数
        int j = (int)(6 * Math.random()) + 1;
        int k = (int)(6 * Math.random()) + 1;
        int count = i + j + k;
        //如果三个骰子之和大于15，则手气不错
        if(count > 15) {
            System.out.println("今天手气不错");
        }
        //如果三个骰子之和在10到15之间，则手气一般
        if(count >= 10 && count <= 15) { //错误写法：10<=count<=15
            System.out.println("今天手气很一般");
        }
        //如果三个骰子之和小于10，则手气不怎么样
        if(count < 10) {
            System.out.println("今天手气不怎么样");
        }
        System.out.println("得了" + count + "分");

        // if-else双选择结构
        // 产生一个[0.0, 4.0)区间的半径，求面积和周长
        System.out.println("==============if-else双选择============");
        double r = 4 * Math.random();
        double area = Math.PI * Math.pow(r,2);
        double circle = 2 * Math.PI * r;
        System.out.println("半径为：" + r);
        System.out.println("面积为：" + area);
        System.out.println("周长为：" + circle);
        if (area >= circle) {
            System.out.println("area >= circle");
        } else {
            System.out.println("circle > area");
        }

        // if-else-if-else多选择结构
        System.out.println("======if-else-if-else多选择结构=========");
        int age = (int)(100 * Math.random());
        System.out.println("年龄是：" + age + ",属于");
        if (age < 15) {
            System.out.println("儿童");
        } else if (age < 25) {
            System.out.println("青年");
        } else if (age < 45) {
            System.out.println("中年");
        } else if (age < 65) {
            System.out.println("中老年");
        } else if (age < 85){
            System.out.println("老年");
        } else {
            System.out.println("老寿星");
        }

        // switch语句的使用
        char c = 'a';
        int rand = (int) (26 * Math.random());
        char c2 = (char) (c + rand);
        System.out.println(c2 + ": ");
        switch (c2) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("元音");
                break;
            case 'y':
            case 'w':
                System.out.println("半辅音");
            default:
                System.out.println("辅音");
        }
    }
}
