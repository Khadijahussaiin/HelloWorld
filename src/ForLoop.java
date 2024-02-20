public class ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            int result = i * 2;
            System.out.println(" 2 gange " + i + " = " + result);
        }
        for (int i = 2; i <= 12; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 4; i <= 79; i += 15) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 30; i >= -20; i -= 10) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = -7; i <= 13; i += 4) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 97; i >= 82; i -= 3) {
            System.out.print(i + " ");
        }
    }
}