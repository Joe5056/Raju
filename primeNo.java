
public class primeNo {

	public static void main(String[] args) {

		int i;
		int j;

		for (i = 1; i <= 100; ++i) {
			int c = 0;
			for (j = 2; j <= i / 2; ++j) {
				if (i % j == 0)
					c++;
			}
			if (c == 0 && i != 1) {
				System.out.print(i+" ");
			}
			
		}
	
	}
	

}
