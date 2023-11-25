package review;

import java.util.Vector;

public class VectorExample { 

	public static void main(String[] args) {
		Vector<Point> v = new Vector<>();
		v.add(new Point(2,3));
		v.add(new Point(5,7));
		v.add(new Point(4,2));
		
		v.remove(1);
		
		// 벡터에 있는 포인트 객체 출력
		
		
		 for (Point point : v) {
			System.out.println(point); 
		}
		
		for (int i = 0; i < v.size(); i++) {
			Point point1 = v.get(i);
			System.out.println(point1);
			
		}
	}

}

class Point{
	private int x, y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")"; 
				
	}
}
