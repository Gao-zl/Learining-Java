import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        System.out.println("请输入double类型数据");
        // 创建键盘录入
        Scanner sc = new Scanner(System.in);
        // 读取键盘录入的数据
        double dou = sc.nextDouble();
        System.out.println(dou);

        // 读取键盘输入的int类型数据
        System.out.println("请输入int类型数据");
        Scanner sc_int = new Scanner(System.in);
        int input_int = sc.nextInt();
        System.out.println(input_int);
    }
}