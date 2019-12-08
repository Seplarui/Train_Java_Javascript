import java.util.Scanner;

public class Exer_3 {
    
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int p0=0;
        int p=0;
        int percent =0;
        int aumento = 0;
        double dPercent = 0.00;

      //  System.out.println("Introduce los siguientes datos");
     //   System.out.println("Introduce población inicial");
   //      p0 = sc.nextInt();
         System.out.println("Introduce población final");
    //     p = sc.nextInt();
         System.out.println("Porcentaje");
     //   percent = sc.nextInt();
    //    dPercent = Double.valueOf(percent);
   //     System.out.println("Introduce aumento anual");
      //  aumento=sc.nextInt();
       // sc.close();
        //System.out.println("Anyos: "+nbYear(p0,dPercent,aumento, p));
       // System.out.println("Anyos: "+nbYear(1500,0.05,100, 5000));
      //  System.out.println("Anyos: "+nbYear(1500000, 2.5, 10000, 2000000));
           nbYear(1500000, 2.5, 10000, 2000000);
    }
    
    public static int nbYear(int p0, double percent, int aug, int p) {
        
        int anyos=0;
        percent = percent/100;
        while (p0 <= p) {
            
            p0 = (int) (p0 + p0 * percent + aug);
            anyos++;
        }
        System.out.println("ANYOS: "+anyos);
        return anyos;
    }
}
/*At the end of the first year there will be: 
1000 + 1000 * 0.02 + 50 => 1070 inhabitants

At the end of the 2nd year there will be: 
1070 + 1070 * 0.02 + 50 => 1141 inhabitants (number of inhabitants is an integer)

At the end of the 3rd year there will be:
1141 + 1141 * 0.02 + 50 => 1213*/