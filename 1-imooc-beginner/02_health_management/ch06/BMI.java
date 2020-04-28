import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

// calculate BMI healthy system
public class BMI{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your height(m):");
        double height = scanner.nextDouble();
        System.out.println("Input your weigth(kg):");
        double weigth = scanner.nextDouble();

        double bmi1 = weigth / (height * height);
        System.out.println("BMI指数为" + bmi1);

        // 此处存在一个bug：由于Java的精度问题，1.74、56情况下属于肥胖
        // 最快的方法就是改掉一个等号就好，以下的两种解决方法可以去掉
        // 修改意见如下：
        // 方法1：乘100用1取余后除100
        // double bmi_temp = bmi1 * 100 ;
        // int temp = bmi_temp;
        // double bmi = temp / 100;
        // 方法2：改变精度的格式:用此方法要转为string类型.....
        // DecimalFormat df = new DecimalFormat("#.##");
        // String bmi = df.format(bmi1);
        // DecimalFormat df = new DecimalFormat("0.00");
        // System.out.println("bmi指数为" + df.format(bmi));
        // 方法3：强制类型转化（可行）
        // double bmi = (int)bmi1 * 100;
        // bmi = bmi / 100;

        // 推荐修改的方法：不需要添加的前面的bmi>=18.5&&
        // 因为此处是bmi<18.5不满足情况下进行判断的，默认就是bmi>18.5,后同
        // 所以为了防止出现刚好卡在中间的情况，建议去掉bmi>=18.5&&
        // 会发生四舍五入，方法三不会。
        double bmi = bmi1;
        if(bmi <= 18.4){
            System.out.println("偏瘦");
        }else if(bmi<=23.9){
            System.out.println("正常");
        }else if(bmi<=27.9){
            System.out.println("偏胖");
        }else{
            System.out.println("肥胖");
        }

        // 原始的判断条件,出现卡中间无法实现的结果
        // 以下代码配合方法三使用
        // if (bmi <= 18.4) {
        //     System.out.println("偏瘦");
        // } else if (bmi> 18.5 && bmi <= 23.9) {
        //     System.out.println("正常");
        // } else if (bmi > 24 && bmi <= 27.9) {
        //     System.out.println("偏胖");
        // } else {
        //     System.out.println("肥胖");
        // }
        // System.out.println("end of program.");
    }
}