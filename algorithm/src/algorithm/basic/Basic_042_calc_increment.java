/**
 * 整数データを1個入力してもらい、1を増加した値を出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_042_calc_increment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long data = sc.nextLong();
		System.out.println(++data);
	}
}
