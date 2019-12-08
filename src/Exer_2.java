import java.util.Scanner;

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