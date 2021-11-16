/**
 * とある形式に合わせて、時間を入力し、その入力された時間をそのまま出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_016_in_output08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		String [] times = data.split(":");
		System.out.printf("%d:%d",Integer.parseInt(times[0]),Integer.parseInt(times[1]));
		
	}
}
