import java.util.Scanner;

/*
 * In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". 
 * You have function with one side of the DNA (string, except for Haskell); 
 * you need to get the other complementary side. 
 * DNA strand is never empty or there is no DNA at all (again, except for Haskell).
 */
public class Exer_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el DNA");
		String dna = sc.next();
		
		
        System.out.println("DNA introducido: "+dna);
        sc.close();
		
	}
	
	  public static String makeComplement(String dna) {

		  return "string";
		  
	  }

}
