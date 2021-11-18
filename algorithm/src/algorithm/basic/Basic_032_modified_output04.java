/**
 * 8進数データ1個を入力してもらい、10進数に変換して出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_032_modified_output04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dataOct = sc.next();
		int dataInt = Integer.valueOf(dataOct, 8);
		System.out.println(dataInt);
	}
}
