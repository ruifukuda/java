import java.util.*;
public class DiceApp{
	public static void main(String[] args){
		//プレイヤーの作成
		System.out.print("何人>>");
		int personNum = new Scanner(System.in).nextInt();
		//playerの名前配列['A','B'...]
		char[] players = createAlphaArr('A',personNum);
		//playerごとの合計を管理する配列
		int[] sums = new int[players.length];

		//ダイスの目作成
		System.out.print("何回ふる>>");
		int count = new Scanner(System.in).nextInt();
		//playerの人数分回るループ
		for(int i= 0; i<players.length; i++){
			//指定回数分サイコロを振った配列を作成
			int[] diceArr = createDiceArr(count);
			//サイコロの目の合計をsums配列に格納
			sums[i] = arrSum(diceArr);
			//実行例に合わせて出力
			System.out.printf("%sさん:%s合計:%d%n",players[i],Arrays.toString(diceArr),sums[i]);
		}

		//結果判定
		if(isSame(sums)){
			System.out.println("引き分け");
		}else{
			//最高得点を求める
			int maxNum = maxNum(sums);
			//勝者の名前を結合していく変数
			String str = "";
			for (int i = 0; i<sums.length; i++){
				if(sums[i] == maxNum){
					str += players[i] + "さん";
				}
			}
			//最後の,を削除する
			str = str.substring(0,str.length()-1);
			System.out.println(str + "の勝ち");
		}
	}

	/*createDiceArrメソッド
	 * 引数で受け取った回数文のサイコロの目の入った配列を作成するメソッド
	 * 引数:count(int)回数
	 * 戻り値:diceArr(int[])サイコロの目が回数分入った配列
	 */
	static int[] createDiceArr(int count){
		//返却する配列を作成
		int[] diceArr = new int[count];
		//配列の要素それぞれにサイコロの目をランダムに格納
		for(int i = 0; i<diceArr.length; i++){
			diceArr[i] = new Random().nextInt(6) + 1;
		}
		//作成した配列を返却
		return diceArr;
	}

	/*arrSumメソッド
	 * 引数にint配列を受け取って要素の合計を返すメソッド
	 * 引数:nums(int[])
	 * 戻り値:sum(int)合計
	 */
	static int arrSum(int[] nums){
		//合計の変数を準備
		int sum = 0;
		//配列から一つ一つ取り出しながら合計に加算
		for(int n: nums){
			sum += n;
		}
		return sum;
	}

	/*createAlphaArrメソッド
	 * 最初の一文字と回数を引数で受け取り、最初の文字から連番になっているアルファベット配列を返す
	 * 引数:first(char)最初の一文字,num(int)個数
	 * 戻り値:alphaArr(char[]) ex['a','b', 'c']
	 */
	static char[] createAlphaArr(char first, int num){
		char[] alphaArr = new char[num];
		for(int i = 0; i<alphaArr.length; i++){
			alphaArr[i] = (char)(first + i);
		}
		return alphaArr; 
	}
	/*isSameメソッド
	 * 配列の要素がすべて同じならばtrueをそうでなければfalseを返す
	 * 引数:nums(int[])
	 * 戻り値:bool(すべてが等しい場合にtrue)
	 */
	static boolean isSame(int[] nums){
		//配列の最初の1つを取り出す
		int first =nums[0];
		//2つ目から最後まで回すループ
		for(int i=1; i<nums.length; i++){
			//もし1つ目と違えば
			if(nums[i] != first){
				//falseを返却
				return false;
			}
		}
		//ここまで来たということは全部同じなのでtrueを返却
		return true;
	}

	static int maxNum(int[] nums){
		//最初の1つ目をmaxと仮定
		int max = nums[0];
		//残り全部と比較して
		for(int i = 1; i<nums.length; i++){
			//もし記録更新ならば
			if(nums[i] > max){
				//その値をmaxとする
				max = nums[i];
			}
		}
		return max;
	}
}
