public class Ex5_1{
	public static void main(String[] args){
		introduceOneself();
	}
	public static void introduceOneself(){
		String name = "rui";
		int age = 33;
		double height = 165;
		char eto = '馬';
		System.out.printf("名前:%s%n",name);
		System.out.printf("年齢:%d%n",age);
		System.out.printf("身長:%.1f%n",height);
		System.out.printf("十二支:%s%n",eto);
	}
}
