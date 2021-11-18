/**
 * 整数データ1個を入力してもらい、そのまま出力するプログラムを実装してください。
 * ただし、入力される値の範囲は -9,223,372,036,854,775,808 ~ +9,223,372,036,854,775,807です。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_028_datatype03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long data = sc.nextLong();
		System.out.println(data);
	}
}

