
public class Ex3App {

	public static void main(String[] args) {
		
		//Declaro las variables necessarias
		int X = 5;
		int Y = 7;
		
		double N = 4.32;
		double M = 2.86;
		
		//Muestro su valor
		System.out.println("X = "+X);
		System.out.println("Y = "+Y);
		System.out.println("N = "+N);
		System.out.println("M = "+M);
		
		//Operaciones		
		System.out.println(X+"+"+Y+"="+(X+Y));
		System.out.println(X+"-"+Y+"="+(X-Y));
		System.out.println(X+"*"+Y+"="+(X*Y));
		System.out.println(X+"/"+Y+"="+(X/Y));
		System.out.println(X+"%"+Y+"="+(X%Y));
		
		System.out.println(N+"+"+M+"="+(N+M));
		System.out.println(N+"-"+M+"="+(N-M));
		System.out.println(N+"*"+M+"="+(N*M));
		System.out.println(N+"/"+M+"="+(N/M));
		System.out.println(N+"%"+M+"="+(N%M));
		
		System.out.println(X+"+"+N+"="+(X+N));
		System.out.println(Y+"/"+M+"="+(Y/M));
		System.out.println(Y+"%"+M+"="+(Y%M));
		
		System.out.println(X+"*2="+(X*2));
		System.out.println(Y+"*2="+(Y*2));
		System.out.println(N+"*2="+(N*2));
		System.out.println(M+"*2="+(M*2));
		
		System.out.println(X+"+"+Y+"+"+N+"+"+M+"="+(X+Y+N+M));
		System.out.println(X+"*"+Y+"*"+N+"*"+M+"="+(X*Y*N*M));
		
		
	}
	
}
