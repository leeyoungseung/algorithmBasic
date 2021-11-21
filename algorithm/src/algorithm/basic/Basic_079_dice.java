/**
 * 1からnまで、1からmまで書いているサイコロ2個を投げた時に
 * 得られる全てのケースを出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_079_dice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=m; j++) {
				System.out.println(i+" "+j);
			}
		}
	}
}
