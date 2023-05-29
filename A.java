import java.util.*;
public class A{
	public static void main(String[] args){
		String a = new String ("java");
		String b = new String ("java");
		String c = "java";
		if(a == c){
			System.out.println("a");
		}
		if(a.equals(c)){
			System.out.println("b");
		}
	}
}
