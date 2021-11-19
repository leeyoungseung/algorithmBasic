/**
 * 整数データ2個(a, b)を入力してもらい、aをbで割った余り値を出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_041_calc_remain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a % b);
	}
}
