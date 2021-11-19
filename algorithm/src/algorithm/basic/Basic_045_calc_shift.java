/**
 * 整数データ1個を入力してもらい、2倍にして出力するプログラムを実装してください。
 * ただし、掛け算演算子ではなくシフト演算子（<<, >>）を使うこと
 * 
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_045_calc_shift {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		long dataDouble = data << 1;
		System.out.println(dataDouble);
	}
}
