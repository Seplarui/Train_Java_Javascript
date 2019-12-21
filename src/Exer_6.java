public class Exer_6 {

    public static void main(String[] args) {
      // System.out.println(whoLikesIt("","aa","ss"));
       //System.out.println(whoLikesIt("Sebas"));
       System.out.println(whoLikesIt("Sebas", "Jose", "Manuel", "Paco", "Juan"));
       System.out.println(whoLikesIt());
    }


public static String whoLikesIt(String... names) {
    
    String salida="";
    int num_params = names.length;
    if (num_params == 0) {
        salida = "no one likes this";
    }else if (num_params == 1) {
        salida = names[0] + " likes this";
    } else if(num_params == 2) {
       
            salida = names[0] + " and " + names[1] + " like this";
       
    } else if (num_params == 3){
        //Max, John and Mark like this
        salida = names[0]+", "+names[1]+ " and " + names[2] + " like this";
    } else {
        //Alex, Jacob and 2 others like this
        num_params = num_params-2;
        salida = names[0] + ", "+ names[1] + " and "+ num_params + " others like this";
    }

    
    return salida;
}

}