package ch03;

public class test {
    public static void main(String[] args) {
        int i=1;
        int j=1;
        int sum=0;
        for(i=1;i<=100;i++) {//控制叠加的上限
            for(j=1;j<=i;j++) {//求叠加
                sum+=j;
            }
        }
        System.out.println("编程求：∑1+∑2+……+∑100的结果为:"+sum);
    }
}

