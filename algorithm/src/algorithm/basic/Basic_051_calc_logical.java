/**
 * 1(true)又は2(false)が入力してもらって、反転して出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_051_calc_logical {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a == 1) {
			System.out.println(0);
		} else if (a == 0) {
			System.out.println(1);
		}
	}
}
