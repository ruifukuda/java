import java.util.*;
public class Method4b{
	public static void main(String[] args){
		System.out.print("税抜き価格 >> ");
		int price = new Scanner(System.in).nextInt();
		System.out.print("税率 >> ");
		int taxRatio = new Scanner(System.in).nextInt();
		System.out.println("税込み価格は" + calcPrice(price, taxRatio) + "です");

	}
	public static int calcPrice(int price, int taxRatio){
		price = (int)(price * (1 + taxRatio/100.0)); 
		return price;
	}
}
