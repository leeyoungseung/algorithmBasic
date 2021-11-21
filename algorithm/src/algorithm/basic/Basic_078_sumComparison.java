/**
 * 1,2,3,4...のように整数データをインクリメントする際に、
 * その合計が入力された数と
 * (1)同じか
 * (2)小さい値になるまで、
 * インクリメントして、最後に加えた整数データを出力するプログラムを実装してください。
 * 
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_078_sumComparison {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		int sum = 0;
		int inc = 0;
//		while(true) {
//			inc++;
//			sum = sum + inc;
//			// 入力されたdata変数より、インクリメントした合算値が同じか・大きくなるとループから外される。
//			// breakの条件は問題の条件と逆になってしまう、
//			// なぜかというと、問題の条件はループを維持する条件のため
//			if (data <= sum) { 
//				break;
//			}
//		}
//		System.out.println(inc);
		
		// sumとdataが同じ場合はwhile文の中のコードがもう一回実行してしまうため、'<='ではなく'<'
		while (sum < data) {
			inc++;
			sum = sum + inc;
		}
		
		System.out.println(inc);
	}
}
