public class Exer_3 {
public static void main (String[] args) {
    
    int result=squareDigits(2112);
    System.out.println(result);

}
    
    public static int squareDigits(int n) {

        String cadena = String.valueOf(n);
        int aux=0;
        String sAux= "";
        String salidaCadena = "";
        int iSalida = 0;
        String[] vCadena = cadena.split("");
        
        for (int i=0;i<=vCadena.length-1;i++) {
            aux = Integer.parseInt(vCadena[i]);
            aux = aux*aux;
            sAux = String.valueOf(aux);
            salidaCadena = salidaCadena + sAux;
        }
        iSalida = Integer.parseInt(salidaCadena);
        return iSalida;
    }
}
