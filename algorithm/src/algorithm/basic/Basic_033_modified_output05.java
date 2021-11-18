/**
 * 16進数データ1個を入力してもらい、8進数に変換して出力するプログラムを実装してください。
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_033_modified_output05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dataHex = sc.next();
		int dataInt = Integer.parseInt(dataHex, 16);
		String octalData = Integer.toOctalString(dataInt);
		System.out.println(octalData);
	}
}