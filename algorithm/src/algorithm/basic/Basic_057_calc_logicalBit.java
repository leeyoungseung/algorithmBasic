/**
 * 入力してもらった整数データをビット単位に真・偽を反転し、整数で出力するプログラムを実装してください。
 * 
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_057_calc_logicalBit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(~a);
	}
}
