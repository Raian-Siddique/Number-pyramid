/**
 * numberPyramid
 */
public class numberPyramid {

    public static void number_pyramid(int n) {
        // Outer Loop

        for (int i = 1; i <= n; i++) {

            // Inner Loop for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Inner Loop for numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        number_pyramid(5);
    }
}