package algorithm.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basic_096 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// (1) 碁盤の入力
		String [] xy = sc.nextLine().split(" ");
		int [][] table = new int [Integer.parseInt(xy[0])][Integer.parseInt(xy[1])];
		
		// (2) スティックの個数
		int n = Integer.parseInt(sc.nextLine());
		
		// (3) スティックの座標のInput
		List<String []> locationList = new ArrayList<>();
		for (int i=0; i<n; i++) {
			// l(長さ), d(方向), x(高さ), y(幅) 
			String [] location = sc.nextLine().split(" ");
			locationList.add(location);
		}
		
		// (4) スティックを描く
		for (int i=0; i<locationList.size(); i++) {
			String [] location = locationList.get(i);
			int l = Integer.parseInt(location[0]);
			int d = Integer.parseInt(location[1]);
			int x = Integer.parseInt(location[2]) -1;
			int y = Integer.parseInt(location[3]) -1;
			
			// 横向きスティック
			if (d == 0) {
				for (int j=0; j<l; j++) {
					table[x][y++] = 1;
				}
			} 
			// 縦向きスティック
			else if (d == 1) {
				for (int j=0; j<l; j++) {
					table[x++][y] = 1;
				}
			}
		}
		
		// (5) 結果を出力
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<table.length; i++) {
			int[] rowAry = table[i];
			for (int j=0; j<rowAry.length; j++) {
				sb.append(rowAry[j] + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString().trim());
		
	}
}
