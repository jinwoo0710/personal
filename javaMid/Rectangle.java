package oop;
import java.util.*;
public class Rectangle {
	int height;
	int width;
	
	public int getArea() {
		return height * width;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		System.out.print("높이입력>>");
		rect.height = sc.nextInt();
		System.out.print("밑변입력>>");
		rect.width = sc.nextInt();
		System.out.println("사각형의 면적은 " + rect.getArea() + "입니다.");
		sc.close();
	}

}
