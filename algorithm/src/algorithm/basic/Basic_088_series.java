/**
 * 2 6 18 54...は2から初めて、3をかけ続けて作った等比数列です。
 * 数列の開始の値(a)、等比の値(b)、合算の制限値(c)を入力してもらい、
 * c番の値を出力するプログラムを実装してください。
 * 
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_088_series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		
		long sum = a;
		for (int i=1; i<n; i++) {
			sum = sum * r;
		}
		System.out.println(sum);
	}
}
