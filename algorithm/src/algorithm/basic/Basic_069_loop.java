/**
 * -2147483648 ~ +2147483647範囲の整数データを無限に入力してもらい、
 * 入力されたデータが0以外の場合、入力された値をそのまま出力、
 * 入力されたデータが0の場合、出力を中断するプログラムを実装してください。
 * ただし、while, for, do-whileは使わないでください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_069_loop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		isZero(sc);
	}
	
	public static boolean isZero(Scanner sc) {
		int data;
		data = sc.nextInt();
	    if (data != 0) {
	    	System.out.println(data);
	    	return isZero(sc);
	    }
	    return true;
	}
}
