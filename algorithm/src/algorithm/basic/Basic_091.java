/**
 * 一行目は出席番号を呼出した解すが入力される
 * 二行目はランダムで呼出した番号が空白を区切りで順次入力される。
 * 1番から番号が呼出した回数を空白に区切りし、一行で出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_091 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String data = sc.nextLine();
		
		String [] arrayStr = data.split(" ");
		int [] arrayNum = new int [23];
		
		int length = Integer.parseInt(n);
		for (int i=0; i<length; i++) {
			int num = Integer.parseInt(arrayStr[i]);
			arrayNum[num-1]++;
		}
		
		StringBuilder sb = new StringBuilder();
		for (int numCount : arrayNum) {
			sb.append(numCount + " "); 
		}
		System.out.println(sb.toString().trim());
	}
}
