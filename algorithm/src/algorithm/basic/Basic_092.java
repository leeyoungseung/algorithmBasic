/**
 * 出席番号を呼出した順番を逆転させ、出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_092 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String data = sc.nextLine();
		
		String [] arrayStr = data.split(" ");
		int length = Integer.parseInt(n) - 1;
		StringBuilder sb = new StringBuilder();
		for (int i=length; i>=0; i--) {
			sb.append(arrayStr[i]+" ");
		}
		System.out.println(sb.toString().trim());
	}
}
