/**
 * 整数データ2個(a,b)を入力してもらい、
 * aがbより大きければ1をaがbより小さいかつ同じければ0を出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_047_calc_relational {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a > b) {
			System.out.println(1);
		} else if (a <= b) {
			System.out.println(0);
		}
	}
}
