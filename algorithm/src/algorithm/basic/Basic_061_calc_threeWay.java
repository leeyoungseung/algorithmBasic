/**
 * 整数データ2個を入力してもらい、より大きい方の値を出力するプログラムを実装してください。
 * ただし、三項演算子を使ってください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_061_calc_threeWay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = a <= b ? b : a;
		System.out.println(result);
	}
}
