/**
 * 呼出した出席番号のうち、最も速い番号を出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String data = sc.nextLine();
		
		String [] arrayStr = data.split(" ");
		int length = Integer.parseInt(n);
		int result = Integer.parseInt(arrayStr[0]);
		for (int i=1; i<length; i++) {
			int temp = Integer.parseInt(arrayStr[i]);
			if (temp < result) {
				result = temp;
			}
		}
		System.out.println(result);
	}
}
