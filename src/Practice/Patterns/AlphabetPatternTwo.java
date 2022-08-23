package Practice.Patterns;

public class AlphabetPatternTwo {
    public static void main(String[] args) {

        //A-Z : 65 to 90
        //a-z : 97 to 122
        int alpha = 65;
        for (int i=0; i<=25; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print((char)alpha + " ");
            }
            alpha++;
            System.out.println();
        }
    }
}