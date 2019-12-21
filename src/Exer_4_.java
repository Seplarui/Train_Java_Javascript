import java.util.Vector;

public class Exer_4 {

public static void main(String[] args) {
sortDesc(2356435);
}
public static int sortDesc(final int num) {
   //int  numero = 12345;

   String sNumero =  Integer.toString(num);
   char aux;
   char menor='9';
   Vector<Character> resultado = new Vector<Character>();

   for (int i=0; i<=sNumero.length()-1;i++) {
       
    
    aux = sNumero.charAt(i);
    //Creo un array con los numeros
    resultado.add(aux);

    //Ordenar array
    

    if (aux<=menor) {
        menor = aux;
        resultado.add(menor);
    } else {
        resultado.add(aux);
    }

    System.out.println(resultado);
}


    return 0;
}

}