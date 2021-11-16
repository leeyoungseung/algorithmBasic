/**
 * 浮動小数点数のfloat型を浮動小数点数の桁数まで全部出力するプログラムを実装してください。
 * 
 */

package algorithm.basic;

import java.util.Scanner;

public class Basic_011_in_output03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float x = sc.nextFloat();
		System.out.printf("%f", x);
	}
}
