/**
 * -2147483648 ~ +2147483647範囲の整数データをn個に入力してもらい、
 * 入力された値をそのまま出力するプログラムを実装してください。
 * ただし、while, for, do-whileは使わないでください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_070_loop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0;
		isLimited(sc, n, i);
	}
	
	public static boolean isLimited(Scanner sc, int n, int i) {
		int limitCount = n;
		int incrementCount = i;
		int data = sc.nextInt();
		
		System.out.println(data);
		incrementCount++;
		
		if (incrementCount < limitCount) {
			return isLimited(sc, limitCount, incrementCount);
		} else {
			return true;
		}
		
	}
}
