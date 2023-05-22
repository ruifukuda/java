import java.util.*;
public class Algo{
	public static void main(String[] args){
		int[] arr = {3, 5, 1, 4, 8};
		//reverse(逆順にする)
		for(int i=0; i<arr.length/2; i++){
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		System.out.println(Arrays.toString(arr));

		//sort(昇順に並び替え、降順だったらifの不等号<にする)
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

		//shuffle(シャッフル)
		for(int i=0; i<arr.length; i++){
			int idx = new Random().nextInt(arr.length-i)+i;
			//0~最後、1~最後、2~最後、入れ替え済みが選ばれなくなる
			int temp = arr[idx];
			arr[idx] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));

		//LinerSearch(線形サーチ)、int iをfor文の外で宣言してるから消えない、
		//iはfor文抜けるときにi == arr.lengthになってから抜けることに注意
		int i = 0;
		for(;i<arr.length; i++){
			if(arr[i] == 7){
				break;
			}
		}
		if(i == arr.length){
			System.out.println("7はありませんでした");
		}else{
			System.out.printf("index%dに7がありました%n",i);
		}
	}
}
