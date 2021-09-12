package class_objects;

import java.util.Scanner;

public class AreaOfRectangle {
	
	int length;
	int breadth;
	
	public AreaOfRectangle(int l, int b) {
		this.length = l;
		this.breadth = b;
	}
	
	int area() {
		return length*breadth;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int b = sc.nextInt();
		
		AreaOfRectangle obj = new AreaOfRectangle(l,b);
		int result = obj.area();
		System.out.println(result);
	}

}