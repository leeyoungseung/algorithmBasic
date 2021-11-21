/**
 * 整数データ2個を入力してもらい、ビット単位でOR演算し、その結果を
 * 整数で出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_059_calc_logicalBit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a | b);
	}
}
