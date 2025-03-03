public class S5 {

    public static void main(String[] args) {

        int height = 12;

        for (int i = 1; i <= height; i++) {

            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int trunkHeight = 4;

        for (int i = 1; i <= trunkHeight; i++) {

            for (int j = 1; j <= height - 1; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            System.out.println();
        }
    }
}
