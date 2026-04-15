/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("たいへんお待たせしました。");
		System.out.println("[ポエール・ネルメ]");
		System.out.println("ただいまより開店です!");

		System.out.println("本日のおすすめ商品です。");

		int citoron = 30;
		int syokora = 30;
		int pisutasyu = 30;

		System.out.println("シトロン  \\250…残り" + citoron + "個");
		System.out.println("ショコラ  \\280…残り" + syokora + "個");
		System.out.println("ピスターシュ  \\320…残り" + pisutasyu + "個");

		System.out.println("それぞれ何個ずつ買いますか？　（最大30個まで）");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("シトロン　　>");
		String citoronbuy = reader.readLine();
		int citoronbuycount = Integer.parseInt(citoronbuy);

		System.out.println("ショコラ　　>");
		String syokorabuy = reader.readLine();
		int syokorabuycount = Integer.parseInt(syokorabuy);

		System.out.println("ピスターシュ　　＞");
		String pisutasyubuy = reader.readLine();
		int pisutasyubuycount = Integer.parseInt(pisutasyubuy);

		System.out.println("シトロン" + citoronbuycount + "個");
		System.out.println("ショコラ" + syokorabuycount + "個");
		System.out.println("ピスターシュ" + pisutasyubuycount + "個");

		System.out.println("合計個数  " + (citoronbuycount + syokorabuycount + pisutasyubuycount) + "個");
		System.out.println("合計金額　"
				+ ((citoronbuycount * 250) + (syokorabuycount * 280) + (pisutasyubuycount * 320) + "円"));

		System.out.println("をお買い上げですね。");
		System.out.println("承りました。");

		System.out.println("本日のおすすめ商品です。");

		System.out.println("シトロン  \\250…残り" + (citoron - citoronbuycount) + "個");
		System.out.println("ショコラ  \\280…残り" + (syokora - syokorabuycount) + "個");
		System.out.println("ピスターシュ  \\320…残り" + (pisutasyu - pisutasyubuycount) + "個");

	}
}
