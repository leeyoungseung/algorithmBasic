/**
 * 英語大文字(a~z)のうち1個を入力してもらい、
 * aから入力された英文字までのアルファベット文字を出力するプログラムを実装してください。
 * ただし、do-while文を使って実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_074_loop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char data = sc.next().toCharArray()[0];
		int incrementStart = (int)'a';
		int incrementEnd = (int)data;
		do {
			System.out.printf("%s ", (char)incrementStart);
			incrementStart++;
			
		} while(incrementStart <= incrementEnd);
		
	}
}
