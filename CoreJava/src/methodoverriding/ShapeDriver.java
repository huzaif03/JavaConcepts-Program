package methodoverriding;
import java.util.Scanner;
class Shape{
	public void area(int a , int b) {
		System.out.println("This is to find the area :-");
	}
}
class Rectangle extends Shape{
	
	public void area(int h,int w) {
		System.out.println("Area of rectangle is :-"+h*w);
	}
}
class Triangle extends Shape{
	
	public void area(int h,int b) {
		System.out.println("Area of Triangle is :-"+1.0/2*(b*h));
	}
}
public class ShapeDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Height of rectangle");
		int height = sc.nextInt();
		System.out.println("Enter the width of Rectangle");
		int width = sc.nextInt();
		Shape s1 = new Rectangle();
		Shape s2 = new Triangle();
		s1.area(height,width);
		s2.area(height,width);
		
	}
}
