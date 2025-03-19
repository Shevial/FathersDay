package org.example;

public class DadExecuteThis {

    // Códigos ANSI para colores
    public static final String RED = "\033[91m";
    public static final String RESET = "\033[0m";

    public static void main(String[] args) throws InterruptedException {
        String[] corazon = {
                "  ██████   ██████  ",
                " ██▓▓▓▓██ ██▓▓▓▓██ ",
                "██▓▓▓▓▓▓▓▓▓▓▓▓▓▓██",
                " ██▓▓▓▓▓▓▓▓▓▓▓▓██ ",
                "  ██▓▓▓▓▓▓▓▓▓▓██  ",
                "   ██▓▓▓▓▓▓▓▓██   ",
                "    ██▓▓▓▓▓▓██    ",
                "     ██▓▓▓▓██     ",
                "      ██▓▓██      ",
                "       ████       ",
                "        ██        ",
                "  ███   ███    ███   ███ ",
                " ██▓██ ██▓██  ██▓██ ██▓██ ",
                " ██▓▓▓▓▓▓▓██  ██▓▓▓▓▓▓▓██",
                "  ██▓▓▓▓▓██    ██▓▓▓▓▓██  ",
                "   ██▓▓▓██      ██▓▓▓██  ",
                "    ██▓██        ██▓██ ",
                "     ███          ███  ",
                "      █            █  "
        };

        for (int i = 0; i < 3; i++) {
            clearScreen();

            // Versión normal
            printHeart(corazon, 1);
            Thread.sleep(300);

            clearScreen();

            // Versión ampliada
            printHeart(corazon, 2);
            Thread.sleep(300);
        }

        // Mensaje final
        clearScreen();
        printHeart(corazon, 1);
        System.out.println(RED + "\n      ¡Te Quiero Papá!" + RESET);
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void printHeart(String[] heart, int scale) {
        for (String linea : heart) {
            String scaledLine = repeatCharacters(linea, scale);
            System.out.println(RED + centerString(scaledLine, 80) + RESET);
        }
    }

    private static String repeatCharacters(String str, int times) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append(String.valueOf(c).repeat(times));
        }
        return sb.toString();
    }

    private static String centerString(String str, int width) {
        int padding = (width - str.length()) / 2;
        if (padding > 0) {
            return String.format("%" + padding + "s%s%" + padding + "s", "", str, "");
        }
        return str;
    }
}