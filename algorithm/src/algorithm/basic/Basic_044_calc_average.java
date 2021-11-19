/**
 * 整数データ3個を入力してもらい、合計値と平均値を出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_044_calc_average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long sum = a + b + c;
		double average = sum / (double)3;
		System.out.println(sum);
		System.out.printf("%.1f", average);
	}
}
