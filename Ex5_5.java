import java.util.*;
public class Ex5_5{
	public static void main(String[] args){
		int[] arr = new int[]{2,3,3,4};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(evenArr(arr)));
	}
	static int[] evenArr(int[] arr){
		int count = 0;
		for(int n: arr){
			if(n % 2 == 0){
				count++;
			}
		}
		int[] evenNumber = new int[count]; 
		int idx = 0;
		for(int n: arr){
			if(n % 2 == 0){
				evenNumber[idx] = n; 
				idx++;
			}
		}
		return evenNumber;
	}
}
