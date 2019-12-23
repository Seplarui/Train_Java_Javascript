
public class Exer_8 {
    public static void main(String[] args) {
        System.out.println("Menor-->"+findShort("bitcoin take over the world maybe who knows perhaps"));
        System.out.println("Menor-->"+findShort("turns out random test cases are easier than writing out basic ones jo a "));
    }

    public static int findShort(String s) {

        String[] vVector;
        vVector = s.split(" ");
        int menor=vVector[0].length();

        for (int i = 0; i < vVector.length - 1; i++) {
            if (menor <= vVector[i+1].length()) {

            } else {
                menor = vVector[i+1].length();
            }
            
        }

        return menor;
    }
}