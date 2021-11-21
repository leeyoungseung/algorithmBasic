/**
 * 成績評価プログラムを実装してください。
 * (1) 文字データを1個入力してもらう。A~Z
 * (2) 入力された値に該当する英文字を出力する
 *  A : best!!!
 *  B : good!!
 *  C : run!
 *  D : slowly~
 *  その他 : what?
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_067_condition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char key = sc.next().toCharArray()[0];
		switch (key) {
		case 'A':
			System.out.println("best!!!");
			break;
		case 'B':
			System.out.println("good!!");
			break;
		case 'C':
			System.out.println("run!");
			break;
		case 'D':
			System.out.println("slowly~");
			break;
		default:
			System.out.println("what?");
			break;
		}
	}
}
