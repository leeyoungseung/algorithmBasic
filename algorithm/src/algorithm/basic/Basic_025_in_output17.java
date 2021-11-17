/**
 * 日付データをyyyy.mm.dd形式に入力してもらい、dd-mm-yyyy形式に変換して出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_025_in_output17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dataStr = sc.next();
		String [] data = dataStr.split("\\.");
		
		int yyyy = Integer.parseInt(data[0]);
		int mm = Integer.parseInt(data[1]);
		int dd = Integer.parseInt(data[2]);
		
		System.out.printf("%02d-%02d-%04d", dd, mm, yyyy);
	}
}
