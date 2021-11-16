/**
 * 入力された住民登録番号を'-'なしに出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_018_in_output10 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		System.out.println(data.replaceAll("-", ""));
	}
}
