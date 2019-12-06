import java.util.Scanner;

/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.

    Note: If the number is a multiple of both 3 and 5, only count it once.

 */
public class Exer_1 {

	public static void main(String[] args) {
		
		System.out.println("Introduce un número");
		
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		numero = solution(numero);
		
		
		System.out.println("El resultado es: "+numero);
		
		

	}
	
	public static int solution(int number) {
		
		int suma = 0;
		
		for (int i=0; i<number;i++) {
			
			if(i%3 == 0 || i%5 ==0) {
				
				suma = suma + i ;
				
			}
		}
		
		return suma;
	  }

}
