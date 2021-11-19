/**
 * 整数の値2個を入力してもらい、合算した値を出力するプログラムを実装してください。
 * 入力してもらう値の範囲は-1073741824 ~ 1073741824
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_036_calc_sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long data1 = sc.nextInt();
		long data2 = sc.nextInt();
		long sum = data1 + data2;
		System.out.println(sum);
	}
}
