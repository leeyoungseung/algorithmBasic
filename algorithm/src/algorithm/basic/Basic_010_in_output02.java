/**
 * char型変数を宣言し、変数に値を格納して、変数に格納している値を出力する
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_010_in_output02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char x = str.charAt(0);
		System.out.println(x);
	}
}
