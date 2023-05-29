import java.util.*;
public class Method6{
	public static void main(String[] args){
		int num1 = new Random().nextInt(10) + 1;
		System.out.println(num1);
		System.out.println(method(num1));
		int num2 = new Random().nextInt(10) - 10;
		System.out.println(num2);
		System.out.println(method(num2));

		int num3 = new Random().nextInt(10);	
		int num4 = new Random().nextInt(10);	
		int num5 = new Random().nextInt(10);	
		System.out.printf("%d,%d,%d%n",num3,num4,num5);
		System.out.println(method1(num3,num4,num5));

		System.out.printf("%.2f%n",method2(4.3,5.7,6.3));

		System.out.println(method3("みなさん","こんにちは"));
		
		int num6 = new Random().nextInt(10);	
		System.out.println(num6);
		if(method4(num6)){
			System.out.println("偶数");
		}else{
			System.out.println("奇数");
		}

		int[] arr = {3, 5, 6};
		method5(arr);

		int[] arr1 = {5, 3, 2};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(method6(arr1)));
	}
	public static int method(int n){
		return n * -1;
	}
	public static int method1(int a, int b, int c){
		int max = a;
		if(max < b){
			max = b;
		}
		if(max < c){
			max = c;
		}
		return max;
	}
	public static double method2(double d1, double d2, double d3){
		double avg = (d1 + d2 + d3) / 3;
		return avg;
	}
	public static String method3(String str1, String str2){
		String bond = str1 + str2;
		return bond;
	}
	public static boolean method4(int n){
		/*
		if(n % 2 == 0){
			return true;
		}else{
			return false;
		}
		*/
		return n % 2 == 0;
	}
	public static void method5(int[] arr){
		System.out.println(Arrays.toString(arr));
		for(int i = 0;i<arr.length; i++){
			arr[i] *= 2;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static int[] method6(int[] arr){
		int[] arr2 = new int[arr.length];
		for(int i = 0; i<arr2.length; i++){
			arr2[i] = arr[i] * 2;
		}
		return arr2;
	}
}
