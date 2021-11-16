/**
 * 入力された日付データを(区切り文字(.))出力するプログラムを実装してください。
 * yyyy.mm.dd形式にて出力すること
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_017_in_output09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		String [] datetime = data.split("\\.");
		System.out.printf("%04d.%02d.%02d",
				Integer.parseInt(datetime[0]),
				Integer.parseInt(datetime[1]),
				Integer.parseInt(datetime[2])
				);
	}
}
