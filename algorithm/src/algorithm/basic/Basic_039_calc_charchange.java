/**
 * 英文字を1個入力してもらい、入力してもらった次の順番の文字を出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_039_calc_charchange {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dataStr = sc.next();
		char data = dataStr.toCharArray()[0];
		int convertIntFromChar = (int)data;
		convertIntFromChar++;
		System.out.println(((char)convertIntFromChar));
	}
}
