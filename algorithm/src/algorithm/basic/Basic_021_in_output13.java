/**
 * 浮動小数点数を入力してもらい、整数の値と実数の値をそれぞれ出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_021_in_output13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		String [] data = x.split("\\.");
		System.out.println(data[0]);
		System.out.println(data[1]);
	}
}
