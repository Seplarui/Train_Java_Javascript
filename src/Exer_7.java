public class Exer_7 {
    public static void main(String[] args) {
        //persistence(1234);
        //System.out.println("Número de dígitos: "+persistence(39));

        int n= 12345;
        int aux=0;
        int producto = 1;
        int i=0;
      /*  while (n != 0) {
            aux = n%10;
            n = n/10;
            producto = producto*aux;
            i++;
            System.out.println("Aux-->"+i +"-->"+aux);
            System.out.println("Producto-->"+producto);
        }*/

        int iTamanyo = String.valueOf(n).length();

        System.out.println("iTamanyo "+iTamanyo);
        System.out.println("Producto-->"+producto);

    }

    public static int persistence(long n) {
         
        int aux=1;
       
         while (n != 0) {
            n = n / 10;
            aux=(int)n%10;
           aux=aux*(int)n;
        }

        return aux;
    }
}