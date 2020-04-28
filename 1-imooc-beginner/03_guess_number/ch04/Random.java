public class Random{
    public static void main(String[] args) {
        double random_d = Math.random();
        System.out.println(random_d);

        // 生成0到10，不包括10的随机数
        double random_i = (int)(Math.random()*10);
        System.out.println(random_i);
    }
}