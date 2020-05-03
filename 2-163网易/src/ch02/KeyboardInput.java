/**
 * 测试scanner键盘输入
 * @author Gao-zl
 */
package ch02;

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name:");
        String name = scanner.nextLine();
        System.out.println("Input hobby:");
        String hobby = scanner.nextLine();
        System.out.println("Input age:");
        int age = scanner.nextInt();

        System.out.println("+++++++++++++");
        System.out.println(name);
        System.out.println(hobby);
        System.out.println(age);
    }
}
