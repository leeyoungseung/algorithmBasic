/**
 * 整数データ(範囲は1~100)を1個入力してもらい、入力された値から1ずっつ減算して出力するプログラムを実装してください。
 * ただし、while文を使って実装してください。
 * 例) 3が入力される
 * 3
 * 2
 * 1
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_072_loop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int i = length;
		while (i>=1) {
			System.out.println(i);
			i--;
		}
	}
}
