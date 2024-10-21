package oop;
import java.util.*;

public class Star {
	static void starL(int num) {
		for(int i=1; i<=num; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	static void starR(int num) {
		for(int i=1; i<=num; i++) {
			for(int j=num; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(">>>");
		int num = sc.nextInt();
		starL(num);
		starR(num);
		
		sc.close();
	}

}
