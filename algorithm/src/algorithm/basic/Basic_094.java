/**
 * 碁盤(19 * 19)にn個の白石を置くとすると、n個の白石が置いている位置を出力するプログラムを実装してください。
 * 一行目は置く色石の数、
 * 二行目からは座標が入力される。
 * また、白石が置いているところは１ないのは0を出力する
 */
package algorithm.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basic_094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int length = Integer.parseInt(n);
		
		List<String []> list = new ArrayList<>();
		for (int i=0; i<length; i++) {
			String [] location = sc.nextLine().split(" ");
			list.add(location);
		}
		
		int [][] table = new int [19][19];
		for (String [] location : list) {
			int x = Integer.parseInt(location[0]);
			int y = Integer.parseInt(location[1]);
			table[x-1][y-1] = 1;
		}
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<table.length; i++) {
			int[] rowAry = table[i];
			for (int j=0; j<rowAry.length; j++) {
				sb.append(rowAry[j]+" ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString().trim());
	}
}
