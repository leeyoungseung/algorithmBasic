/**
 * 5桁の整数の値を入力してもらい、桁別0を付け、分けて出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_023_in_output15 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		String dataStr = sc.next();
		char [] data = dataStr.toCharArray();
		
		int criteria = data.length-1;
		for (int i=0; i<data.length; i++) {
			String c = ""+data[i];
			int su = Integer.parseInt(c);
			StringBuilder sb = new StringBuilder();
			for (int x=0; x<criteria; x++) {
				sb.append(0);
			}
			System.out.println("["+(c+sb.toString())+"]");
			criteria--;
		}
	}
}
