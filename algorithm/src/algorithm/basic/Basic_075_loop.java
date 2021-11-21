/**
 * 整数データを1個（範囲0~100）入力してもらい、0から入力された数まで順次出力するプログラムを実装してください。
 * ただし、for文を使って実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_075_loop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		for (int i=0; i<=length; i++) {
			System.out.println(i);
		}
	}
}
