/**
 * 整数データ(範囲は1~100)を1個入力してもらい、
 * 入力された値から1ずっつ減算して出力するプログラムを実装してください。
 * ただし、配列のインデクスのように出力する事。
 * 例) 3が入力される
 * 2
 * 1
 * 0
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_073_loop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		for (int i=length-1; i>=0; i--) {
			System.out.println(i);
		}
	}
}
