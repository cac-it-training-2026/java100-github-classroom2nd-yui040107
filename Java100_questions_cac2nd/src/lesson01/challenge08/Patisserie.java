/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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

		System.out.println("シトロン  \\250…残り" + (citoron) + "個");
		System.out.println("ショコラ  \\280…残り" + (syokora) + "個");
		System.out.println("ピスターシュ  \\320…残り" + (pisutasyu) + "個");

		System.out.println("それぞれ何個ずつ買いますか？　（最大30個まで）");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("シトロン　　>");
		String citoronbuy = reader.readLine();
		double citoronbuycount = Double.parseDouble(citoronbuy);

		System.out.println("ショコラ　　>");
		String syokorabuy = reader.readLine();
		double syokorabuycount = Double.parseDouble(syokorabuy);

		System.out.println("ピスターシュ　　＞");
		String pisutasyubuy = reader.readLine();
		double pisutasyubuycount = Double.parseDouble(pisutasyubuy);

		System.out.println("シトロン" + citoronbuycount + "個");
		System.out.println("ショコラ" + syokorabuycount + "個");
		System.out.println("ピスターシュ" + pisutasyubuycount + "個");

		System.out.println("合計個数  " + (citoronbuycount + syokorabuycount + pisutasyubuycount) + "個");

		double sum = (citoronbuycount * 250) + (syokorabuycount * 280) + (pisutasyubuycount * 320);
		System.out.println("合計金額　" + (int) sum + "円");

		System.out.println("をお買い上げですね。");
		System.out.println("承りました。");

		System.out.println("本日のおすすめ商品です。");

		System.out.println("シトロン  \\250…残り" + (citoron - citoronbuycount) + "個");
		System.out.println("ショコラ  \\280…残り" + (syokora - syokorabuycount) + "個");
		System.out.println("ピスターシュ  \\320…残り" + (pisutasyu - pisutasyubuycount) + "個");

		System.out.println("閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");

		System.out.println("売上の割合");
		System.out.println("売上合計　　\\" + (int) sum);

		double citoronprice = citoronbuycount * 250;
		double syokoraprice = syokorabuycount * 280;
		double pisutasyuprice = pisutasyubuycount * 320;

		System.out.println("内訳");
		System.out.println("シトロン　\\" + ((int) citoronprice) + "…" + ((int) (citoronprice / sum * 100) + "%"));

		System.out.println("ショコラ　\\" + ((int) syokoraprice) + "…" + ((int) (syokoraprice / sum * 100) + "%"));
		System.out
				.println("ピスターシュ　\\" + ((int) pisutasyuprice) + "…" + ((int) (pisutasyuprice / sum * 100) + "%"));
	}

}
