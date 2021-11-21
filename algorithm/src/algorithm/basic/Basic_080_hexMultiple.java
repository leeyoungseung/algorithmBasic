/**
 * 16進数の九九を出力するプログラムを実装してください。
 * ただし、
 * (1) 入力してもらう値の範囲はA~F
 * (2) 出力する英文字は大文字に出力すること
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_080_hexMultiple {

//  何も考えずと正解だけだしたの
//	static final String [] hexList = 
//		{"0","1", "2", "3", "4", "5", "6", "7",
//		"8", "9", "a", "b", "c", "d", "e", "f" };
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String data = sc.next();
//
//		for (int i=1; i<hexList.length; i++) {
//			System.out.println(data+"*"+(hexList[i]).toUpperCase()+"="+ getHexMultiple(data, hexList[i]));
//			
//		}
//	}
//	
//	public static String getHexMultiple(String inputHex, String hexListElement) {
//		int decimalInputed = Integer.parseInt(inputHex, 16);
//		int decimalFromHexListElement = Integer.parseInt(hexListElement, 16);
//		int resultDecimal = decimalInputed * decimalFromHexListElement;
//		return Integer.toHexString(resultDecimal).toUpperCase();
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		
		// (1) 16進数 -> 10進数のint型に変更
		int dataHex = Integer.parseInt(data, 16);
		
		for (int i = 1; i < 16; i++) {
			// (2) 10進数 -> 16進数の文字列に変更 + Javaは小文字がでるため、大文字に変換出力
			String hexStr = Integer.toHexString(i).toUpperCase();
			// (3) 10進数の間に掛け算実施し、その結果を16進数に変換 + Javaは小文字がでるため、大文字に変換出力
			String multiple = Integer.toHexString(dataHex * i).toUpperCase();
			System.out.println(data + "*" + hexStr + "="+multiple);
		}
	}
}
