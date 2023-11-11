package multiply;

public class Math {
	
	public void table(int input) {
		int x = 0;
		int y = 0;
		int z = 0;

		while(x <= input) {
			
			System.out.print(x + " ");
			x++;
		}
		System.out.println("");
		while (y <= input) {
			while(z <= input) {
			int num;
			num = y * z;
			System.out.print(num + " ");
			z++;
		}
			y++;
			z = z - (z - 1);
			System.out.println("");
		
	}
	}
}
	
	

