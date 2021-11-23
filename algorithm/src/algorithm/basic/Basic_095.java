/**
 * 碁盤の十字逆転
 * 
 */
package algorithm.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basic_095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// (1) 碁盤のInput
		List<String []> tableList = new ArrayList<>();
		for (int i=0; i<19; i++) {
			String [] row = sc.nextLine().split(" ");
			tableList.add(row);
		}
		int table[][] = new int[19][19];
		for (int i=0; i<table.length; i++) {
			int[] rowAry = table[i];
			for (int j=0; j<rowAry.length; j++) {
				rowAry[j] = Integer.parseInt(tableList.get(i)[j]);
			}
		}
		
		// (2) 逆転回数のInput
		String n = sc.nextLine();
		int length = Integer.parseInt(n);
		
		// (3) 座標のInput
		List<String []> locationList = new ArrayList<>();
		for (int i=0; i<length; i++) {
			String [] location = sc.nextLine().split(" ");
			locationList.add(location);
		}
		
		// (4) 値を逆転
		for (int z=0; z<length; z++) {
			String [] location = locationList.get(z);
			int x = Integer.parseInt(location[0]) - 1;
			int y = Integer.parseInt(location[1]) - 1;
			
			for (int i=0; i<19; i++) {
				if (table[x][i] == 0) {
					table[x][i] = 1;
				} else if (table[x][i] == 1) {
					table[x][i] = 0;
				}
				if (table[i][y] == 0) {
					table[i][y] = 1;
				} else if (table[i][y] == 1) {
					table[i][y] = 0;
				}
				
			}
		}
		
		// (5) 値の出力
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
	
	/**
	 * 逆転の中心かを判断する
	 * @param x
	 * @param y
	 * @param locationList
	 * @return
	 */
	public static boolean isCenter(int x, int y, List<String []> locationList) {
		for (int z=0; z<locationList.size(); z++) {
			String [] location = locationList.get(z);
			int tempX = Integer.parseInt(location[0]) - 1;
			int tempY = Integer.parseInt(location[1]) - 1;
			if (x == tempX && y == tempY) {
				return true;
			}
		}
		return false;
	}
}
