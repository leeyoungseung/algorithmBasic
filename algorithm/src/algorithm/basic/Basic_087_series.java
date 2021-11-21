/**
 * 数列の開始の値(a)、等差の値(b)、合算の制限値(c)を入力してもらい、
 * c番の値を出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_087_series {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = a;
		for (int i=1; i<c; i++) {
			sum = sum + b; 
		}
		System.out.println(sum);
	}
}
