public class Calculate{ 
    public static void main(String[] args){ 
        int num = 153; 
        System.out.println(num);
        // / is the way get number form back
        // % is the way get number form front
        // method 1
        System.out.println("Method 1");
        int hunder = num / 100;
        System.out.println(hunder);
        int decade = num / 10 - 10;
        System.out.println(decade);
        int unit = num % 10;
        System.out.println(unit);

        // method 2
        System.out.println("Method 2");
        int hunder_2 = num / 100 % 10;
        System.out.println(hunder_2);
        int decade_2 = num / 10 % 10;
        System.out.println(decade_2);
        int unit_2 = num % 10;
        System.out.println(unit_2);
    }
}
