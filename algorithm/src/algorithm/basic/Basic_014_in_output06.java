/**
 * float型データ1個を入力して、浮動小数点数の3番目の桁で四捨五入した結果を出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_014_in_output06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float x = sc.nextFloat();
		System.out.printf("%.2f", x);
	}
}
