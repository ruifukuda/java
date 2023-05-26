public class Ex5_4{
	public static void main(String[] args){
		double bottom = 10;
		double height = 5;
		double triangleArea = calcTriangleArea(10,5);
		System.out.printf("底辺%.1f高さ%.1fの三角形の面積は%.1fです%n",bottom, height, triangleArea); 
		double radius = 5;
		double circleArea = calcCircleArea(5);
		System.out.printf("半径%.1fの円の面積は%.1fです%n",radius, circleArea); 
	}
	public static double calcTriangleArea(double bottom, double height){
		double area = bottom * height /2;
		return area;
	}
	public static double calcCircleArea(double radius){
		double area = radius * radius * 3.14;
		return area;
	}
}
