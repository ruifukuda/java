import java.util.*;
public class Sample1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("何人>>");
		int n = scan.nextInt();
		Random rand = new Random();
		int[] scores = new int[n];
		for(int i = 0; i<scores.length; i++){
			scores[i] = rand.nextInt(101);
		}
		System.out.println(Arrays.toString(scores));
	}
}
