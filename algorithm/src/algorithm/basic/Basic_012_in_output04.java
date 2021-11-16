/**
 * int型のデータ2個が空白を区切りとして入力される。
 * 入力されたint型データをそのまま出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_012_in_output04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		System.out.printf("%d %d",su1,su2);
	}
}
