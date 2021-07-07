
public class Ex5App {

	public static void main(String[] args) {
		
		int A = 3;
		int B = 6;
		int C = 8;
		int D = 1;
		
		System.out.println("A = "+A);
		System.out.println("B = "+B);
		System.out.println("C = "+C);
		System.out.println("D = "+D);
		
		B = C;
		C = A;
		A = D;
		D = B;
		
		System.out.println("\nA = "+A);
		System.out.println("B = "+B);
		System.out.println("C = "+C);
		System.out.println("D = "+D);
		
	}
	
}
