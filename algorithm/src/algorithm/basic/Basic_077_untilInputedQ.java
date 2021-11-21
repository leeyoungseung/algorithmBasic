/**
 * 英文字'q'が入力されるまで、入力された文字を出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_077_untilInputedQ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			char data = sc.next().toCharArray()[0];
			if ('q' == data) {
				System.out.println(data);
				break;
			} else {
				System.out.println(data);
			}
		}
	}
}
