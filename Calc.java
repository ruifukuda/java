package calcapp.main;
import calcapp.logics.CalcLogic;
public class Calc{
	public static void main(String[] args){
		int a = 10;
		int b = 2;
		int total = calcapp.logics.CalcLogic.tasu(a, b);
		int delta = calcapp.logics.CalcLogic.hiku(a, b);
		//int a = Math.max(3, 5);
		//int b  = Integer.parstint("8");
		System.out.println("足すと" + total + "、引くと" + delta);
	}
}
