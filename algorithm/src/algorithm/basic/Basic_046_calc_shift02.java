/**
 * 整数データ2個(a,b)を入力してもらい、aを2のb乗した値分掛け算した値を出力するプログラムを実装してください
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_046_calc_shift02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a << b);
	}
}
