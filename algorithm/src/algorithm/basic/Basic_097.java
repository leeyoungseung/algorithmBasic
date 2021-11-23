/**
 * 誠実な蟻
 * 箱の構造0(行ける)、1(壁)、2(餌)、9(移動したの経路)
 * 蟻は右方向に向かい壁を会うと下の方に向かう。
 * 餌を見つかったり、一番下の右側に着いたら蟻はこれ以上動かない。
 * 餌を探すための蟻の移動経路を出力してみましょう。
 * 
 */
package algorithm.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basic_097 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//sc.next();
		// (1) 蟻の箱Input
		List<String []> boxList = new ArrayList<>();
		for (int i=0; i<10; i++) {
			String [] row = sc.nextLine().split(" ");
			boxList.add(row);
		}
		
		int box[][] = new int[10][10];
		for (int i=0; i<box.length; i++) {
			int[] rowAry = box[i];
			for (int j=0; j<rowAry.length; j++) {
				rowAry[j] = Integer.parseInt(boxList.get(i)[j]);
			}
		}
		
		// (2) 蟻の最初の位置は固定
		int [] antHome = {1,1};
		
		// (3) 餌探し
		int flg = antHome[1];
		home : for (int i=antHome[0]; i<box.length; i++) {
			int[] rowAry = box[i];
			for (int j = flg; j<rowAry.length; j++) { // 蟻の移動
				rowAry[j] = Integer.parseInt(boxList.get(i)[j]);
				
				if (rowAry[j] == 2) { // 餌か?
					rowAry[j] = 9;
					break home;
					
				} else if (rowAry[j] == 1) { // 壁か?
					flg = j - 1;
					break;
				} 
				
				rowAry[j] = 9; // 移動経路
			}
		}
		
		// (4) 蟻の移動経路出力
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<box.length; i++) {
			int[] rowAry = box[i];
			for (int j=0; j<rowAry.length; j++) {
				sb.append(rowAry[j] + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString().trim());
	}
}
