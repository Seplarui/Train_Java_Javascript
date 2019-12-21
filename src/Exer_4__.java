public class Exer_4 {
    public static void main(String[] args) {

        boolean resultado = getXO("zzoo");

        System.out.println(resultado);
    }

    public static boolean getXO(String str) {
        
        String[] vCadena = str.split("");
        int iX=0;
        int iO=0;
        
        for (int i=0;i<=vCadena.length-1;i++) {
            if ("o".equalsIgnoreCase(vCadena[i])) {
                iO++;
            } else if("x".equalsIgnoreCase(vCadena[i])) {
                iX++;
            }
        }
        
        if (iX==iO) {
            return true;
        } else if(iX == 0 && iO == 0) {
            return true;
        } else {
            return false;
        }
    }
}