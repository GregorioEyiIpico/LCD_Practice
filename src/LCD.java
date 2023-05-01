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
        //printBoxLine("Welcome to Stamford LCD Library Demo", 10);
        LCD.printBoxLine("Welcome to Stamford LCD Library Demo", 2);
        GotoXY(3, 0);
        System.out.println("| |");
        LCD.printBoxLine("Select a Function (0-3)", 2);
        GotoXY(4, 0);

        GotoXY(5, 0);
        System.out.print(midLeft);
        for (int i = 0; i < 78; i++) {
            System.out.print(dash);
        }
        System.out.print(midRight);
        GotoXY(6, 0);
        System.out.println("| |");

        invertColor();
        GotoXY(7, 0);
        LCD.printBoxLine("1. Login", 0);
        GotoXY(8, 0);
        normalColor();
        LCD.printBoxLine("2. Restart", 0);
        GotoXY(9, 0);
        LCD.printBoxLine("3. Shutdown", 0);
        GotoXY(10, 0);
        LCD.printBoxLine("0. Go back to previous menu.", 0);
        GotoXY(11, 0);
        System.out.print(bottomLeft);
        for (int i = 0; i < 78; i++) {
            System.out.print(dash);
        }
        System.out.print(bottomRight);
        GotoXY(12, 0);
    }

    //Task 1
    public static void printSpace(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print("");
        }
    }

    //Task 2
    public static void printBoxLine(String text, int alignment) {
        int textLength = text.length();
        int padding;
        boolean isEven;
        if (textLength % 2 == 0) {
            padding = (80 - (6 + textLength)) / 2;
            isEven = true;
            //System.out.println("Padding value: " + padding + "\n" + isEven);
        } else {
            padding = (80 - (6 + textLength + 1)) / 2;
            isEven = false;
            //System.out.println("Padding value: " + padding + "\n" + isEven);
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
        GotoXY(1, 1);
        System.out.println(topLeft);
        for (int i = 0; i < 78; i++) {
            System.out.print(dash);
        }
        System.out.print(topRight);
        GotoXY(2, 0);

        LCD.printBoxLine("Welcome to Stamford LCD Library Demo", 2);
        GotoXY(3, 0);
        System.out.println("| |");
        LCD.printBoxLine("Select a Function (0-3)", 2);
        GotoXY(4, 0);

        GotoXY(5, 0);
        System.out.print(midLeft);
        for (int i = 0; i < 78; i++) {
            System.out.print(dash);
        }
        System.out.print(midRight);
        GotoXY(6, 0);
        System.out.println("| |");

        invertColor();
        GotoXY(7, 0);
        LCD.printBoxLine("1. Login", 0);
        GotoXY(8, 0);
        normalColor();
        LCD.printBoxLine("2. Restart", 0);
        GotoXY(9, 0);
        LCD.printBoxLine("3. Shutdown", 0);
        GotoXY(10, 0);
        LCD.printBoxLine("0. Go back to previous menu.", 0);
        GotoXY(11, 0);
        System.out.print(bottomLeft);
        for (int i = 0; i < 78; i++) {
            System.out.print(dash);
        }
        System.out.print(bottomRight);
        GotoXY(12, 0);
    }

    private static void normalColor() {
    }

    private static void invertColor() {
    }

    private static void GotoXY(int i, int i1) {
    }
}