import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Point[] set = {};
		
		ArrayList<Point> closestPair = ClosestPair(set);
		ArrayList<Point> nearestNeighbor = NearestNeighbor(set);
		ArrayList<Point> bruteForce = BruteForce(set);
		
		
	}
	
	public static ArrayList<Point> ClosestPair(Point[] set){
		int n = set.length;
		
		ArrayList<LinkedList<Point>> chains = new ArrayList<>();
		
		
		
		for(int i = 1; i < n - 1; i++) {
			double d = Double.POSITIVE_INFINITY;
			
			for(int j = 0; j < set.length; j++) {
				
			}
		}
		
		
		
		return null;
	}
	
	public static ArrayList<Point> NearestNeighbor(Point[] set){
		int rand = new Random().nextInt(set.length);
		Point p0 = set[rand];
		boolean[] visited = new boolean[set.length];
		
		visited[rand] = true;
		
		return null;
	}
	
	public static ArrayList<Point> BruteForce(Point[] set){
		return null;
	}
	

}
