public class Meirei{
	public static void main(String[] args){
		//引数を出力して改行
		System.out.println("hello");
		//引数を出力(改行なし)
		System.out.print("hello");
		//書式付き出力(%nで改行)
		System.out.printf("%s(%d)こんにちは%n","山田",23);

		//1未満の乱数を生成
		double rnd =Math.random();
		//0~9の値をランダムに生成
		int rndNum =new java.util.Random().nextInt(10);
		//aとbを比較して大きい方の値を返す
		int max = Math.max(a,b);
		//aとbを比較して小さい方の値を返す
		int min = Math.min(a,b);
		//strの文字列をintに変換
		int n = Integer.parseInt("10");
		//strの文字列をdoubleに変換
		double h = Double.parseDouble("152.3");

		//キーボードからの入力を１行まるっと受け取る
		String line=new java.util.Scanner(System.in).nextLine();
		//キーボードからの入力から一つの単語を受け取る
		String word=new java.util.Scanner(System.in).next();
		//キーボードから入力された数字をintに変換
		int num = new java.util.Scanner(System.in).nextInt();
		//キーボードから入力された数字をdoubleに変換
		double w = new java.util.Scanner(System.in).nextDouble();

		//配列の中身表示
		//java.util.Arrays.toString()
		System.out.println(Arrays.toString(arr));
		
		//部分文字列の作成
		//文字列.substring(以上,未満)
		String s = "Java".substring(0,2);//Ja
	}
}
