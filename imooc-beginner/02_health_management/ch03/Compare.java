import javax.sound.sampled.SourceDataLine;

public class Compare{
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x < y);

        // 与或非的表达式表示
        System.out.println((3>4) & (1>0));
        System.out.println(x > y);  // false
        System.out.println(x < y);  // true

        System.out.println(x > y & x < y);  // false & true
        System.out.println(x > y | x < y);  // false | true 

        // & 和 && 区别
        // &无论前面是true或者false，右边都参与运算
        // && 前面出现false，右边不计算，前面true，后面才参与计算
        // 大多采用&& 短路与运算，程序运行效率较高
        System.out.println(x > y && x < y);
    }
}