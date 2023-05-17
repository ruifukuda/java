import java.util.*;
public class Method4{
	public static void main(String[] args){
		System.out.print("top >> ");
		int t = new Scanner(System.in).nextInt();
		System.out.print("bottom >> ");
		int b = new Scanner(System.in).nextInt();
		System.out.print("height >> ");
		int h = new Scanner(System.in).nextInt();
		calcArea(t, b, h);
	}

	public static void calcArea(int top, int bottom, int height){
		int area = (top+bottom)*height/2;
		System.out.printf("TOPが%d,BOTTOMが%d,HEIGHTが%dの台形の面積は%dです",top, bottom, height, area);
	}
}
