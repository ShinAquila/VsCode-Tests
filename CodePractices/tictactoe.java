package CodePractices;

import java.util.Scanner;
import java.io.IOException;
import java.util.Random;

public class tictactoe {

    static String table[][] = {
            { " ", " ", " " },
            { " ", " ", " " },
            { " ", " ", " " },
    };

    static boolean gameContinues = true;
    static boolean askPerson = true;
    static boolean personWin = false;
    static int pieceCount = 0;
    static String personName = "";

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        ///Guide
        System.out.println("[!] Tic Tac Toe Table Guide [!]\n");
        System.out.println("\t " + "-".repeat(13));
        System.out.print("\t ");
        for (int i = 1; i <= 9; i++) {
            System.out.print("| " + i + " ");
            if (i == 3 || i == 6 || i == 9) {
                System.out.print("|\n");
                System.out.println("\t " + "-".repeat(13));
                System.out.print("\t ");
            }
        }
        System.out.println("\n[!]" + "=".repeat(25) + "[!]\n");
        ///End of Guide

        ///Actual Game
        System.out.print("Enter Player Name: ");
        personName = scan.nextLine();

        do {
            ///Person Turn
            winCheck("X");
            int personLoc = 0;
            do {
                Thread.sleep(700);
                printTable();
                askPerson = true;

                System.out.println("\n[P] " + personName + "'s Turn (X)");
                System.out.print("Enter Location for your move (1-9): ");
                try {
                    personLoc = Integer.parseInt(scan.nextLine());
                    askPerson = false;
                } catch (NumberFormatException NFEx) {
                }
                System.out.println();

                actionMade(personLoc, 0);
            } while (askPerson);

            printTable();
            ///end of person turn

            winCheck("X");
            ///computer turn
            if (!personWin) {
                System.out.println("\n[C] Computer's Turn (O)");
                Thread.sleep(500);
                System.out.print("Calculating for best move");
                Thread.sleep(1000);
                for (int i = 0; i < 3; i++) {
                    System.out.print(".");
                    Thread.sleep(1000);
                }
                
                int compLoc = 0;
                do {
                    do {
                        compLoc = random.nextInt(9);
                    } while (compLoc == 0);
                    actionMade(compLoc, 1);
                } while (askPerson);
                
                System.out.println("\nComputer picked: " + compLoc);
                Thread.sleep(700);
                System.out.println();
                
                printTable();
            }
            winCheck("O");
            ///end of computer turn
        } while (gameContinues);

        scan.close();
    }

    public static void printTable() {
        clearScreen();
        System.out.println(" ".repeat(3) + "[-] Tic Tac Toe Table [-]\n");
        System.out.println("\t " + "-".repeat(13));
        for (int i = 0; i < 3; i++) {
            System.out.print("\t ");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + table[i][j] + " ");
            }
            System.out.print("|\n");
            System.out.println("\t " + "-".repeat(13));
        }
        System.out.println();
        System.out.println(" ".repeat(3) + "[-]" + "=".repeat(19) + "[-]\n");
    }

    public static void actionMade(int loc, int player) {
        boolean occupied = false;
        String piece = "";
        if (player == 0) {
            piece = "X";
        } else if (player == 1) {
            piece = "O";
        }

        switch (loc) {
            case 1:
                if (!table[0][0].equals(" ")) {
                    askPerson = true;
                    occupied = true;
                } else {
                    table[0][0] = piece;
                    pieceCount++;
                    askPerson = false;
                }
                break;

            case 2:
                if (!table[0][1].equals(" ")) {
                    askPerson = true;
                    occupied = true;
                } else {
                    table[0][1] = piece;
                    pieceCount++;
                    askPerson = false;
                }

                break;

            case 3:
                if (!table[0][2].equals(" ")) {
                    askPerson = true;
                    occupied = true;
                } else {
                    table[0][2] = piece;
                    pieceCount++;
                    askPerson = false;
                }
                break;

            case 4:
                if (!table[1][0].equals(" ")) {
                    askPerson = true;
                    occupied = true;
                } else {
                    table[1][0] = piece;
                    pieceCount++;
                    askPerson = false;
                }
                break;

            case 5:
                if (!table[1][1].equals(" ")) {
                    askPerson = true;
                    occupied = true;
                } else {
                    table[1][1] = piece;
                    pieceCount++;
                    askPerson = false;
                }
                break;

            case 6:
                if (!table[1][2].equals(" ")) {
                    askPerson = true;
                    occupied = true;
                } else {
                    table[1][2] = piece;
                    pieceCount++;
                    askPerson = false;
                }
                break;

            case 7:
                if (!table[2][0].equals(" ")) {
                    askPerson = true;
                    occupied = true;
                } else {
                    table[2][0] = piece;
                    pieceCount++;
                    askPerson = false;
                }
                break;

            case 8:
                if (!table[2][1].equals(" ")) {
                    askPerson = true;
                    occupied = true;
                } else {
                    table[2][1] = piece;
                    pieceCount++;
                    askPerson = false;
                }
                break;

            case 9:
                if (!table[2][2].equals(" ")) {
                    askPerson = true;
                    occupied = true;
                } else {
                    table[2][2] = piece;
                    pieceCount++;
                    askPerson = false;
                }
                break;

            default:
                System.out.println("Invalid Location. Try Again...");
                askPerson = true;
                break;

        }

        if (occupied == true && piece.equals("X")) {
            System.out.println("Location Occupied. Try Again...");
            occupied = false;
        }
    }

    public static void winCheck(String piece) {
        if (
            table[0][0].equals(piece) && table[0][1].equals(piece) && table[0][2].equals(piece) ||
            table[1][0].equals(piece) && table[1][1].equals(piece) && table[1][2].equals(piece) ||
            table[2][0].equals(piece) && table[2][1].equals(piece) && table[2][2].equals(piece) ||
            table[0][0].equals(piece) && table[1][1].equals(piece) && table[2][2].equals(piece) ||
            table[0][2].equals(piece) && table[1][1].equals(piece) && table[2][0].equals(piece) ||
            table[0][0].equals(piece) && table[1][0].equals(piece) && table[2][0].equals(piece) ||
            table[0][1].equals(piece) && table[1][1].equals(piece) && table[2][1].equals(piece) ||
            table[0][2].equals(piece) && table[1][2].equals(piece) && table[2][2].equals(piece) && 
            pieceCount != 9) {
            gameContinues = false;

            if (piece.equals("X")) {
                System.out.println(personName + " Wins!");
                System.exit(0);
            } else if (piece.equals("O")) {
                System.out.println("Computer Wins!");
                System.exit(0);
            }

        } else if (
            !table[0][0].isEmpty() && !table[0][1].isEmpty() && !table[0][2].isEmpty() &&
            !table[1][0].isEmpty() && !table[1][1].isEmpty() && !table[1][2].isEmpty() &&
            !table[2][0].isEmpty() && !table[2][1].isEmpty() && !table[2][2].isEmpty() &&
            !table[0][0].isEmpty() && !table[1][1].isEmpty() && !table[2][2].isEmpty() &&
            !table[0][2].isEmpty() && !table[1][1].isEmpty() && !table[2][0].isEmpty() &&
            !table[0][0].isEmpty() && !table[1][0].isEmpty() && !table[2][0].isEmpty() &&
            !table[0][1].isEmpty() && !table[1][1].isEmpty() && !table[2][1].isEmpty() &&
            !table[0][2].isEmpty() && !table[1][2].isEmpty() && !table[2][2].isEmpty() && 
            pieceCount == 9) {
            System.out.println("Draw");
            System.exit(0);
        }
    }

    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime();
            }
        } catch (IOException | InterruptedException ex) {
        }
    }
}
