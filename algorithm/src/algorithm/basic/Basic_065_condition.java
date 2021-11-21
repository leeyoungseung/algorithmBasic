/**
 * 整数データ1個を入力してもらい、
 * (1)陽数(plus)か負数(minus)かと
 * (2)偶数(even)か奇数(odd)かを判断するプログラムを実装してください。
 * 例) -2が入力された場合 
 * minus
 * even
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_065_condition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a < 0) {
			System.out.println("minus");
			
			if (a % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		} else {
			System.out.println("plus");
			if (a % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}
	}
	
}
