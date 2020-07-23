import java.util.Scanner;
class ScannerDemo { 
    public static void main(String[] args) { 
            Scanner scan = new Scanner(System.in);
     
            double sum = 0;
            int m = 0;
     
            while (scan.hasNextDouble()) { 
                        double x = scan.nextDouble();
                        m = m + 1;
                        sum = sum + x;
                    }
     
            System.out.println(m + " sum of the number is " + sum);
            System.out.println(m + " the average of this sum is " + (sum / m));
            scan.close();
        }
}
