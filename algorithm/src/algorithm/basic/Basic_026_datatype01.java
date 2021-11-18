/**
 * 整数データ1個を入力してもらい、そのまま出力するプログラムを実装してください。
 * ただし、入力される値の範囲は 0 ~ 4,294,967,295です。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_026_datatype01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long data = sc.nextLong();
		System.out.println(data);
	}
}
