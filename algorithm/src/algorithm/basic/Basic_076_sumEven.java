/**
 * 整数データを1個(範囲1~100)入力してもらい、1から入力された値までの偶数の合算値を出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_076_sumEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int sumEven=0;
		for (int i=1; i<=length; i++) {
			if (i % 2 == 0) {
				sumEven = sumEven + i;
			}
		}
		System.out.println(sumEven);
	}
}
