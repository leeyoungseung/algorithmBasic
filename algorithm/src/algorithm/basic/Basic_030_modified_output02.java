/**
 * 10進数を入力してもらい、16進数に変換して出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_030_modified_output02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		String dataHex = Integer.toHexString(data);
		System.out.println(dataHex);
	}
}
