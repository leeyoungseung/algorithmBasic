/**
 * 1,2,3..を順次合算していくうち、
 * その合計値が入力しただーたより小さいまで、合算し続けるプログラムを実装してください。
 * 
 * 例) 入力値 57
 * 
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		int cnt=0;
		int sum=0;
		while (true) {
			cnt++;
			sum = sum + cnt;
			if (sum >= data) {
				break;
			}
		}
		System.out.println(sum);
		
	}
}
