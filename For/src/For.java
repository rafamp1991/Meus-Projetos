
public class For {

	public static void main(String[] args) {
		int x = 0;
		int y = 30;
		
		for (int i = 0; i < 10; i = i + 1) {
			System.out.println("Olá!");
		}
		
		System.out.println("\n");
		
		for (int i = x; i < y; i++) {
			if (i % 19 == 0) {
				System.out.println("Achei um número	divisível por 19 entre x e y");
				break;
			}
		}
		
		System.out.println("\n");
		
		for	(int i = 0;	i <	100; i++) {
			if (i > 50	&& i < 60) {
				continue;
			}
			System.out.println(i);
		}

	}

}
