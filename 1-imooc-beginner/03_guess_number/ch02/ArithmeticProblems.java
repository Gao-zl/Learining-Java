public class ArithmeticProblems{
    public static void main(String[] args) {
        // 声明一个变量
        int x = 1;
        System.out.println("x = " + x);

        x++;
        System.out.println("x = " + x);

        ++x;
        System.out.println("x = " + x);

        int y = x++;
        int z = ++x;
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}