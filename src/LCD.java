public class LCD {
    int x = 8;
    String s = "hello there";
    int stringLength = s.length();
    final static char escCode = 0x1B;
    final static char topLeft = 9484;
    final static char topRight = 9488;
    final static char bottomLeft = 9492;
    final static char bottomRight = 9496;
    final static char dash = '-';
    final static char midLeft = 9500;
    final static char midRight = 9508;

    public static void main(String[] args) {
        printBoxLine("Hello there", 10);
    }

    public static void printSpace(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print("");
        }
    }

    public static void printBoxLine(String text, int alignment) {
        int textLength = text.length();
        int padding;
        boolean isEven;
        if (textLength % 2 == 0) {
            padding = (80 - (6 + textLength)) / 2;
            isEven = true;
            System.out.println("Padding value: " + padding + "\n" + isEven);
        } else {
            padding = (80 - (6 + textLength + 1)) / 2;
            isEven = false;
            System.out.println("Padding value: " + padding + "\n" + isEven);
        }

        switch (alignment) {
            case 1:
                // alignment right
                System.out.print("| ");
                printSpace(75 - textLength);
                System.out.print(text);
                System.out.print(" |");
                break;
            case 2:
                // alignment center
                if (isEven) {
                    System.out.print("| ");
                    printSpace(padding);
                    System.out.print(text);
                    printSpace(padding);
                    System.out.print(" |");
                    break;
                } else {
                    System.out.print("| ");
                    printSpace(padding);
                    System.out.print(text);
                    printSpace(padding + 1);
                    System.out.print(" |");
                    break;
                }
            default:
                // 0:alignment left
                System.out.print("| ");
                System.out.print(text);
                printSpace(75 - textLength);
                System.out.print(" |");
                break;
        }
    }

    public static void showMainMenu() {
        //clearScreen();
        //Preguntar al usuario que introduzca al usuario un intiger (100) tiene que calcular todos los the even number between 1 to the user number
        //Sumar todas las ood numbers ()
    }
}