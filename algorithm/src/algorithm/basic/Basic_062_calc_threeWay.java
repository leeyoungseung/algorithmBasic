/**
 * 整数データ3個を入力してもらい、入力値のうち最も小さい値を出力するプログラムを実装してください。
 * ただし、三項演算子を使ってください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_062_calc_threeWay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = ((a < b ? a : b) > c )
				? c 
				: (a < b ? a : b); 
		System.out.println(result);
	}
}
