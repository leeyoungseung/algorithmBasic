/**
 * 整数の値2個を入力してもらい、合算した値を出力するプログラムを実装してください。
 * 入力してもらう値の範囲は-2147483648 ~ +2147483648
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_037_calc_sum02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long data1 = sc.nextLong();
		long data2 = sc.nextLong();
		long sum = data1 + data2;
		System.out.println(sum);
	}
}
