/**
 * 浮動小数点数データを1個入力してもらい、そのまま出力するプログラムを実装してください。
 * ただし、入力される値の範囲は+- 1.7*10-308 ~ +- 1.7*10308
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_027_datatype02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double data = sc.nextDouble();
		System.out.printf("%.11f",data);
	}
}
