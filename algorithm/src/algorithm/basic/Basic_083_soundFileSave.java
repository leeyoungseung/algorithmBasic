/**
 * 音がコンピューターにセーブされる時にはデジタル化されセーブされます。
 * 
 * マイクを通して、1秒に少ないと数十回、多くと数万回音の強弱をチェックし
 * その値を整数の値に変え、その値をセーブし音をファイルとしてセーブすることができる。
 * 
 * 値をセーブする際にはビット(bit)を使う精度により、細かい録音の音質を決めることができ、
 * 左右(ステレオ)チャンネルにてセーブすれば2倍...5.1チャンネルであれば6倍のセーブ空間が必要で、
 * 録音時間が長ければ長いほどより、多いセーブ空間が必要だ。
 * 
 * 1秒間マイクで音の強弱をチェックする数をh(ヘルツ<Hz>は1秒に何回か?をチェックするかを意味する。)
 * 
 * 1回チェックした結果をセーブするビット b (2ビットを使うと0又は1, 16ビットを使うと65536まで)
 * 
 * 左右など音をセーブするトラク回数でありチャンネル c (モノは1個、ステレオ2個のトラクにてセーブするのを意味)
 * 
 * 録音する時間 sが与える際、
 * 
 * 必要なセーブ容量を求めるプログラムを実装してください。
 * 
 * 一般的なCD音質(44.1KHz, 16bit, ステレオ)で1秒セーブするためには
 * 44100 * 16 * 2 * 1 bitのセーブ空間が必要である。
 * 
 * h, b, c, sが空白を区切りで入力される。
 * hは48,000以下、bは32以下(ただし、8の倍数)、cは5以下, sは6,000以下の整数。
 * 
 * 出力は必要なセーブ空間をMB単位に変換して出力する
 * ただし、浮動小数点数の2桁目から四捨五入、MBを空白一個入れて出力する。
 *  
 */
package algorithm.basic;

import java.util.Scanner;

public class Basic_083_soundFileSave {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long s = sc.nextLong();
		
		double byteRes = (h * b * c * s) / 8.0;    // (1) Bit -> Byte
		double kb = byteRes / 1024.0;              // (2) Byte -> Kilo Byte
		double mb = kb / 1024.0;                   // (2) Kilo Byte -> Mega Byte

		System.out.printf("%.1f MB", mb);
		
	}
}
