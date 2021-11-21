/**
 * 整数データ3個を入力してもらい、偶数のみ出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_063_condition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] data = new int[3];
		data[0] = sc.nextInt();
		data[1] = sc.nextInt();
		data[2] = sc.nextInt();
		for (int i=0; i<data.length; i++) {
			if (data[i] % 2 == 0) {
				System.out.println(data[i]);
			}
		}
	}
}
