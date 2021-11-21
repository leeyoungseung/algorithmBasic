/**
 * イメージがコンピューターにセーブする際にもデジタル化され、セーブされる。
 * 
 * 最も基本的な方法はイメージを構成する意図つの点(pixel, ピックセル)の色を
 * r, g, bの3つの値で変更してセーブするですが、
 * 
 * 例えると r,g,bのそれぞれの色に対して、8ビット(0~255, 256個まで可能)ずっつ使うとしたら、
 * 
 * 一個の点の色はr,g,bの8ビット * 8ビット * 8ビットで24ビットで表現し、
 * 総2^24個の違う光の色が使える。
 * 
 * この様にセーブした点を集めて、一つのイメージをセーブすることができるようになるが、
 * 1024 * 768サイズに各点に対し、24ビットにセーブするとそのイメージをセーブするためのセーブ空間を計算することができる。
 * 
 * イメージの幅の解像度 w, 高さの解像度 h, ピックセルをセーブするためのビット bが与えるとき、
 * 圧縮せず、セーブするための空き容量を求めるプログラミングを実装してください。
 * 
 * w, h, bが空白を区切りで入力される
 * w,hは整数(1~1024)でbは40以下の4の倍数
 * 
 * 
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_084_savePic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long w = sc.nextInt();
		long h = sc.nextInt();
		long b = sc.nextInt();
		
		double byteRes = (w * h * b) / 8.0;    // (1) Bit -> Byte
		double kb = byteRes / 1024.0;              // (2) Byte -> Kilo Byte
		double mb = kb / 1024.0;                   // (2) Kilo Byte -> Mega Byte

		System.out.printf("%.2f MB", mb);
		
	}
}
