/**
 * 成績評価プログラムを実装してください。
 * (1) 整数データを1個入力してもらう。範囲は0~100
 * (2) 入力された値に該当する英文字を出力する
 *  90 ~ 100 : A
 *  70 ~ 89  : B
 *  40 ~ 69  : C
 *  0 ~ 39   : D
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_066_condition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a >= 90 && a <= 100) {
			System.out.println("A");
		} else if (a >= 70 && a <= 89) {
			System.out.println("B");
		} else if (a >= 40 && a <= 69) {
			System.out.println("C");
		} else if (a >= 0 && a <= 39) {
			System.out.println("D");
		}
	}
}
