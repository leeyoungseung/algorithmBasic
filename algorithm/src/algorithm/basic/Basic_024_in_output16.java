/**
 * 時間:分:秒の形で時間データを入力してもらい、分のみ出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_024_in_output16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dataStr = sc.next();
		String [] data = dataStr.split(":");
		System.out.printf("%d", Integer.parseInt(data[1]));
	}
}
