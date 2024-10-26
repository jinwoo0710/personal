package oop;

import java.util.Scanner;

public class CalCul{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요: ");
        double num1 = scanner.nextDouble();
        System.out.print("두 번째 숫자를 입력하세요: ");
        double num2 = scanner.nextDouble();

        System.out.println("합: " + num1 + num2);
        System.out.println("차: " + num1 - num2);
        System.out.println("곱: " + num1 * num2);
        System.out.println("나: " + num1 / num2);
        
        scanner.close();
    }
}
