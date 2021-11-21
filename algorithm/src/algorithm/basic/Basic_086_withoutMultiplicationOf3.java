/**
 * 1から入力した数まで1ずつインクリメントして、
 * インクリメントした値が3の倍数の場合出力しないプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_086_withoutMultiplicationOf3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i=1; i<=limit; i++) {
			if (i % 3 == 0) {
				continue;
			}
			sb.append(i+" ");
		}
		System.out.println(sb.toString().trim());
	}
}
