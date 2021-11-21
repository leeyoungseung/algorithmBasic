/**
 * 整数データ1個を入力してもらい、入力した値までインクリメントした数を出力する。
 * また、インクリメントした値に3・6・9が含まれている場合は数字の代わりに'X'を出力する。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_081_369game {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		for (int i = 1; i<=length; i++) {
			if (i==3 || i==6 || i==9) {
				System.out.print("X ");
			} else {
				System.out.println(i);
			}
		}
	}
}
