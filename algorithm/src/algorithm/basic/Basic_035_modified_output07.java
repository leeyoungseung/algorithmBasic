/**
 * 10進数データ1個を入力してもらい、アスキーコードの文字に変換して出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_035_modified_output07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		char charData = (char)data;
		System.out.println(charData);
	}
}