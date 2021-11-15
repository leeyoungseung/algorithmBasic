/**
 * 以下のような特殊文字を用いた表を出力するプログラムを実装してください。
 * ┌┬┐
 * ├┼┤
 * └┴┘
 * ただし┌、┬、┐、├、┼、┤、└、┴、┘こちらの絵文字を直接入力するのではなく、ユニコード文字を用いて、表を出力してください。
 * 以下のサイトを参考にしてください。
 * http://ash.jp/code/unitbl21.htm
 */
package algorithm.basic;

public class Basic_008_output08 {

	public static void main(String[] args) {
		System.out.println("\u250C\u252C\u2510\n\u251C\u253C\u2524\n\u2514\u2534\u2518");
	}
}
