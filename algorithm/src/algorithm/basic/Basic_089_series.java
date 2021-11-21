/**
 * 1 -1 3 -5 11..は1から初めて、以前に出た数字から-2を掛けてから1を加えて作った数列だ。
 * 初めての数(a), 掛ける数(m), 加える数(d), 何番目かを表す数(n)を入力してもらい、
 * 数列のn番目の数を出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_089_series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		
		long sum = a;
		for (int i=1; i<n; i++) {
				sum = (sum * m) + d;
		}
		System.out.println(sum);
	}
}
