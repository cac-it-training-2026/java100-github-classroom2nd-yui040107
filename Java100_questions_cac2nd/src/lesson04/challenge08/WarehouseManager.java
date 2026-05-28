/**
 * 第4章 倉庫番のお仕事
 *
 * 問題8 荷物の入れ替え（二つの配列の要素を入れ替える）
 *
 * AB興産から新たな荷物のセットを預かりました。
 * 5袋からなる荷物のセットで、それぞれ6～10の数値が入っており、
 * どの袋にどの数値が入っているのかはランダムに決定し、
 * それぞれの袋の値は重複しません。
 *
 * AB興産からの依頼は、以前から預かっている1～5の荷物と
 * 今回預かる6～10の荷物を再編し、奇数のみの配列と
 * 偶数のみの配列に分けるというものです。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  AB興産から新たに預かった荷物と以前から預かっている荷物の
 *  中身を確認してください。
 *
 *  Yさん：
 *  はい、
 *  以前から預かっている荷物の状態は、
 *  3,2,1,5,4
 *  です。
 *
 *  今回預かった荷物の状態は、
 *  7,9,10,6,8
 *  です。
 *
 *  E主任：
 *  その二つの荷物を奇数群、偶数群で入れ替えてください。
 *
 *  Yさん：
 *  はい、入れ替えました。
 *  奇数群の荷物の状態は、
 *  3,5,1,9,7
 *  です。
 *
 *  偶数群の荷物の状態は、
 *  10,2,8,6,4
 *  です。
 *
 */

package lesson04.challenge08;

public class WarehouseManager {

	public static void main(String[] args) {

		// 以前からある荷物用配列
		int[] ABKosanArray1 = new int[5];

		// 新しく預かった荷物用配列
		int[] ABKosanArray2 = new int[5];

		int inputNum = 0;

		// 重複チェック用フラグ
		boolean loopFlag = false;

		// 1～5の重複なしランダム数を配列1へ格納
		for (int i = 0; i < ABKosanArray1.length; i++) {

			do {
				loopFlag = false;

				// 1～5のランダム数生成
				inputNum = (int) (Math.random() * 10) % 5 + 1;

				// 重複チェック
				for (int j = 0; j < ABKosanArray1.length; j++) {

					if (ABKosanArray1[j] == inputNum) {
						loopFlag = true;
						break;
					}
				}

			} while (loopFlag);

			ABKosanArray1[i] = inputNum;
		}

		inputNum = 0;
		loopFlag = false;

		// 6～10の重複なしランダム数を配列2へ格納
		for (int i = 0; i < ABKosanArray2.length; i++) {

			do {
				loopFlag = false;

				// 1～10のランダム数生成
				inputNum = (int) (Math.random() * 10) % 10 + 1;

				// 6以上のみ許可
				if (inputNum > 5) {

					// 重複チェック
					for (int j = 0; j < ABKosanArray2.length; j++) {

						if (ABKosanArray2[j] == inputNum) {
							loopFlag = true;
							break;
						}
					}

				} else {

					// 5以下なら再抽選
					loopFlag = true;
				}

			} while (loopFlag);

			ABKosanArray2[i] = inputNum;
		}

		System.out.println("E主任：");
		System.out.println("AB興産から新たに預かった荷物と以前から預かっている荷物の");
		System.out.println("中身を確認してください。\n");

		System.out.println("Yさん：");
		System.out.println("はい、");
		System.out.println("以前から預かっている荷物の状態は、");

		// 配列1表示
		for (int i = 0; i < ABKosanArray1.length; i++) {

			System.out.print(ABKosanArray1[i]);

			if (i != (ABKosanArray1.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.println("\nです。\n");

		System.out.println("今回預かった荷物の状態は、");

		// 配列2表示
		for (int i = 0; i < ABKosanArray2.length; i++) {

			System.out.print(ABKosanArray2[i]);

			if (i != (ABKosanArray2.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.println("\nです。\n");

		System.out.println("E主任：");
		System.out.println("その二つの荷物を奇数群、偶数群で入れ替えてください。\n");

		// 偶数探索用index
		int evenNumberIndex = 0;

		// 奇数探索用index
		int oddNumberIndex = 0;

		// 入れ替え回数
		int changeTimes = 0;

		do {

			// 配列1から偶数を探す
			for (int i = evenNumberIndex; i < ABKosanArray1.length; i++) {

				if (ABKosanArray1[i] % 2 == 0) {

					evenNumberIndex = i;
					break;
				}
			}

			// 配列2から奇数を探す
			for (int i = oddNumberIndex; i < ABKosanArray2.length; i++) {

				if (ABKosanArray2[i] % 2 != 0) {

					// 値交換
					int temp = ABKosanArray1[evenNumberIndex];

					ABKosanArray1[evenNumberIndex] = ABKosanArray2[i];

					ABKosanArray2[i] = temp;

					oddNumberIndex = i;

					// 交換回数を加算
					changeTimes++;

					break;
				}
			}

		} while (changeTimes < 2);

		System.out.println("Yさん：");
		System.out.println("はい、入れ替えました。");
		System.out.println("奇数群の荷物の状態は、");

		// 入れ替え後の配列1表示
		for (int i = 0; i < ABKosanArray1.length; i++) {

			System.out.print(ABKosanArray1[i]);

			if (i != (ABKosanArray1.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.println("\nです。\n");

		System.out.println("偶数群の荷物の状態は、");
		System.out.println("");

		// 入れ替え後の配列2表示
		for (int i = 0; i < ABKosanArray2.length; i++) {

			System.out.print(ABKosanArray2[i]);

			if (i != (ABKosanArray2.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.println("\nです。");

	}
}
