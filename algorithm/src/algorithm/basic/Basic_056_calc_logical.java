/**
 * 1(true)又は0(false)を2個入力してもらい、
 * 入力してもらった２つの値が二つとも0の場合のみ、1を出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_056_calc_logical {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a != 1 && b != 1) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
