public class Exer_5 {
    public static void main(String[] args) {
        String salida= createPhoneNumber(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 });
        System.out.println("Aux-->"+salida);
    }

    public static String createPhoneNumber(int[] numbers) {
        String salida="(";
        String aux="";
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (i==3) {
                salida = salida + ") ";
                aux = String.valueOf(numbers[i]);
                salida = salida + aux;
            } else if (i==6){
                salida = salida + "-";
                aux = String.valueOf(numbers[i]);
                salida = salida + aux;
            } else {
                aux = String.valueOf(numbers[i]);
                salida = salida + aux;
               
            }
        }
        return salida;
    }
}