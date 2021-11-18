/**
 * 英文字1個を入力してもらい、アスキーコードの10進数の値に変換して出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_034_modified_output06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		char charData = data.toCharArray()[0];
		int suData = (int)charData;
		System.out.println(suData);
	}
}
