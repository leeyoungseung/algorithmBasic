/**
 * -2147483648 ~ +2147483647範囲の整数データを無限に入力してもらい、
 * 入力されたデータが0以外の場合、入力された値をそのまま出力、
 * 入力されたデータが0の場合、出力を中断するプログラムを実装してください。
 * ただし、whileを使って実装していください
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_071_loop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int data = sc.nextInt();
			if (data == 0) {
				break;
			} else {
				System.out.println(data);
			}
		}
	}
}
