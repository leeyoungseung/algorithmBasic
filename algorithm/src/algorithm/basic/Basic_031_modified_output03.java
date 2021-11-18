/**
 * 10進数を入力してもらい、16進数(英語大文字)に変換して出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_031_modified_output03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		String dataHex = Integer.toHexString(data);
		System.out.println(dataHex.toUpperCase());
	}
}