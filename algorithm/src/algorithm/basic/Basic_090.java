/**
 * 同じ日に申し込みした3人が規則的に訪問する期間が入力される。
 * 3人がまた一緒に訪問するのは何日語かを出力。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_090 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int day = 1;
		while (true) {
			day++;
			if ( (day % a == 0) && (day % b == 0) && (day % c == 0) ) {
				break;
			}
		}
		System.out.println(day);
	}
}
