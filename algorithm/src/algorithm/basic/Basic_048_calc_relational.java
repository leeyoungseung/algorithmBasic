/**
 * 整数データ2個を入力してもらい、
 * aとbが同じければ1を、違ったら0を出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_048_calc_relational {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a == b) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
