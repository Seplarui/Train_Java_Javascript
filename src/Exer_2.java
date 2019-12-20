import java.util.Scanner;

<<<<<<< HEAD
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
		
	}
	
	  public static String makeComplement(String dna) {

		  return "string";
		  
	  }

}
=======
public class Exer_2 {

    public static void main(String[] args) {
        System.out.println("Introduce un String");
        Scanner sc = new Scanner(System.in);
        
        String texto = sc.nextLine();
        sc.close();
        String[] resultado = texto.split(" ");
        String[] ordenado;
        String aux = "";
        char car;

       if ("".equals(texto)) {
            System.out.println("");
        } else {

            for (int i=0;i<=resultado.length-1;i++) {
                aux = resultado[i];
                for (int j = 0; j<= aux.length()-1;j++) {
                    car = aux.charAt(j);
                    System.out.println(aux.charAt(j));
                    
                }

            }
             
        }

    }

    public static String order(String words) {
        
        
        return "string";
      }
}
>>>>>>> d07bf18b2f3c34f2e614940a4b8ad419a1aefecf
