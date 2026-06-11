/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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

		double citoronpe = (100 * citoronprice / sum);
		double syokorape = (100 * syokoraprice / sum);
		double pisutasyupe = (100 * pisutasyuprice / sum);

		//		String citoronpe = ((citoronprice / sum * 100) + "%");
		//		int citoronper = Integer.parseInt(citoronpe);
		//
		//		String syokorape = ((syokoraprice / sum * 100) + "%");
		//		int syokoraper = Integer.parseInt(syokorape);
		//
		//		String pisutasyupe = ((pisutasyuprice / sum * 100) + "%");
		//		int pisutasyuper = Integer.parseInt(pisutasyupe);

		System.out.println("内訳");
		System.out.println("シトロン　\\" + ((int) citoronprice) + "…" + (int) citoronpe + "%");

		System.out.println("ショコラ　\\" + ((int) syokoraprice) + "…" + (int) syokorape + "%");
		System.out
				.println("ピスターシュ　\\" + ((int) pisutasyuprice) + "…" + (int) pisutasyupe + "%");

		System.out.println("明日の三色マカロンの配合率が決まりました！");

		System.out.println("シトロンの味…" + (int) citoronpe + "%");
		System.out.println("ショコラの味…" + (int) syokorape + "%");
		System.out.println("ピスターシュの味…" + (int) pisutasyupe + "%");

		System.out.println("が楽しめます。");
		System.out.println("値段は\\270です。");

	}

}