/**
 * 月を入力してもらい、該当する季節を出力するプログラムを実装してください。
 * 例) 
 * 12,1,2  : winter
 * 3,4,5   : spring
 * 6,7,8   : summer
 * 9,10,11 : fall
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_068_condition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		switch (month) {
		case 1:
			System.out.println("winter");
			break;
		case 2:
			System.out.println("winter");
			break;
		case 3:
			System.out.println("spring");
			break;
		case 4:
			System.out.println("spring");
			break;
		case 5:
			System.out.println("spring");
			break;
		case 6:
			System.out.println("summer");
			break;
		case 7:
			System.out.println("summer");
			break;
		case 8:
			System.out.println("summer");
			break;
		case 9:
			System.out.println("fall");
			break;
		case 10:
			System.out.println("fall");
			break;
		case 11:
			System.out.println("fall");
			break;
		case 12:
			System.out.println("winter");
			break;
		}
	}
}
