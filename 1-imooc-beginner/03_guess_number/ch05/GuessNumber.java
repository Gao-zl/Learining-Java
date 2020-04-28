import java.util.Scanner;

public class GuessNumber{
    public static void main(String[] args) {
        int randomNum = (int)(Math.random()*10 + 1);
        System.out.println(randomNum);

        Scanner sc = new Scanner(System.in);
        System.out.println("please input the number(1 to 10):");
        
        while(true){
        int guessNumber = sc.nextInt();      
        if(guessNumber < randomNum){
            System.out.println("too small");
        }else if(guessNumber > randomNum){
            System.out.println("too big");
        }else{
            System.out.println("right!");
            break;
        }
    }

    }
}