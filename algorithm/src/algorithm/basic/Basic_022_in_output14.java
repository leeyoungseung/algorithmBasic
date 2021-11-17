/**
 * 英単語を入力してもらい、一文字ずっつシングルクォーテーションに囲み出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_022_in_output14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dataStr = sc.next();
		char [] data = dataStr.toCharArray();
		for (char c : data) {
			System.out.println("'"+c+"'");
		}
	}
}
