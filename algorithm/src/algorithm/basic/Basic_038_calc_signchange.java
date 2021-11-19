/**
 * 入力してもらった整数の値の値の符号を逆変換するプログラムを実装してください。
 * 入力値の範囲は-2147483647 ~ +2147483647
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_038_calc_signchange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		System.out.println(-(data));
		
	}
}
