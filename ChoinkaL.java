public class ChoinkaL { 
	public static void main(String[] args) {
	String L = args[0];
	int r = Integer.parseInt(L);
		for (int i = 1; i <= r; i++) {
			for (int x = 1; x <=i; x++) {
				System.out.print("+"); 
			}
				System.out.println();
		}
	} 
} 