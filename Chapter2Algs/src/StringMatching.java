
public class StringMatching {
	int find_match(String p, String t) {
		int m = p.length();
		int n = t.length();
		
		for(int i = 0; i <= (n - m); i++) {
			int j = 0;
			while((j < m) && t.charAt(i+j) == p.charAt(j)) {
				j++;
			}
			
			if (j == m) return i;
		}
		
		return -1;
	}
}
