/**
 * 整数データ2個(a, b)を入力してもらい、合算、減算、乗算、除算した余り、除算の値を自動で計算して、
 * 出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_043_calc_all {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.printf("%d\n", (a / b));
		System.out.println(a % b);
		System.out.printf("%.2f", ((double)a / (double)b));
		
	}
}
