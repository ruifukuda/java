public class Code5_10a{
	public static int add(int x, byte y){
		return x + y;
	}
/*	public static double add(int x, short y){
		return x * y;
	}
	*/
	public static String add(String x, String y){
		return x + y;
	}
	public static void main(String[] args){
		System.out.println(add(10,(byte)20));
		System.out.println(add(3,(byte)2));
		System.out.println(add("Hello","World"));
	}
}
