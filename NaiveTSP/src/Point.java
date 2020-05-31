import java.security.acl.Permission;

public class Point {
	public double x;
	public double y;
	public static double epsilon = 0.0000001;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(double[] pair) {
		
		if(pair.length != 2) {
			return;
		}
		
		this.x = pair[0];
		this.y = pair[1];
	}
	
	public static double dist(Point p1, Point p2) {
		return Math.sqrt((p1.x - p2.x)*(p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y));
	}
	
	@Override
	public boolean equals(Object p) {
		Point p2 = (Point) p;
		return ((this.x - p2.x) < epsilon) && ((this.y - p2.y) < epsilon);
	}
}
