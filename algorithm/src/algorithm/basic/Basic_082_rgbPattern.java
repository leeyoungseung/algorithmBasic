/**
 * r(red),g(green),b(blue)の値を混ぜて、色色な光の色を作ると思う。
 * rgbそれぞれの値を与えた時の組合せパターンとパターンの数を出力するプログラムを実装してください。
 * (入力)
 * rgbの値が0~128の間で入力される
 */
package algorithm.basic;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Basic_082_rgbPattern {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out)); // Javaで最も出力速度が速いらしい。
		int count = 0;
		for (int i=0; i<r; i++) {
			for (int j=0; j<g; j++) {
				StringBuilder sb = new StringBuilder();
				for (int z=0; z<b; z++) {
					sb.append(i +" "+j+" "+z+"\n");
					count++;
				}
				bf.write(sb.toString());
				bf.flush();
				sb = null;
			}
		}
		System.out.println(count);
		bf.close();
	}
}
