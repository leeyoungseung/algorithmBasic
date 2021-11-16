/**
 * 2個のchar型データを入力されて、入力された順番を変えて出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_013_in_output05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		char x1 = str1.charAt(0);
		String str2 = sc.next();
		char x2 = str2.charAt(0);
		
		System.out.printf("%c %c", x2, x1);
	}
}
