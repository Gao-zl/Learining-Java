import java.util.Scanner;

public class Choose{
    public static void main(String[] args) {
        System.out.println("选择结构相关程序");

        System.out.println("请输入0、1或其它");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x == 0){
            System.out.println("man");
        }else if(x == 1){
            System.out.println("woman");
        }else{
            System.out.println("sorry!");
        }
    }
}