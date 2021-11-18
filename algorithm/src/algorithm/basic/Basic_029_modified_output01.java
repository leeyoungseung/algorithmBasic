/**
 * 10進数を入力してもらい、8進数に変換して出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_029_modified_output01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		String octalData = Integer.toOctalString(data);
		System.out.println(octalData);
	}
}
