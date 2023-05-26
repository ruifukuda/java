public class SubstringLesson{
	public static void main(String[] args){
		String msg = "java lessons";
		//str.substring(以上,未満);
		String str1 = msg.substring(0,3);
		System.out.println(str1);//jav
		String str2 = msg.substring(2,6);
		System.out.println(str2);//va l スペースも数に入る
		String str3 = msg.substring(0,1);
		System.out.println(str3);//j
		String str4 = msg.substring(msg.length()-1);
		System.out.println(str4);//s
		String str5 = msg.substring(5);
		System.out.println(str5);//lessons
		//最後の1文字を削除するイディオム
		String str6 = msg.substring(0,msg.length()-1);
		System.out.println(str6);//java lesson
	}
}
