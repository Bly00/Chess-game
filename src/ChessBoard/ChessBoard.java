package ChessBoard;

import Pieces.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChessBoard {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ChessBoard cb = new ChessBoard();

        cb.initGame();

    }

    Piece[][] squares = new Piece[9][9];
    Color time = Color.WHITE;
    boolean bothKingAlive = true;

    public void initGame() {

        int i = 2;

        ChessBoard game = this;

        while (true) {

            for (int l = 1; l <= 8; l++) {

                Piece p = null;

                if (i == 2) {
                    p = new Pawn(Color.BLACK);
                    p.setPosX(i);
                    p.setPosY(l);
                }
                if (i == 7) {
                    p = new Pawn(Color.WHITE);
                    p.setPosX(i);
                    p.setPosY(l);
                }

                squares[i][l] = p;

            }

            if (i == 7) {
                break;
            }

            i = 7;
        }

        squares[1][5] = new King(Color.BLACK);

        squares[1][5].setPosX(1);
        squares[1][5].setPosY(5);

        squares[8][5] = new King(Color.WHITE);

        squares[8][5].setPosX(8);
        squares[8][5].setPosX(5);

        squares[1][4] = new Queen(Color.BLACK);

        squares[1][4].setPosX(1);
        squares[1][4].setPosY(4);

        squares[8][4] = new Queen(Color.WHITE);

        squares[8][4].setPosX(8);
        squares[8][4].setPosY(4);

        squares[1][3] = new Bishop(Color.BLACK);

        squares[1][3].setPosX(3);
        squares[1][3].setPosY(3);

        squares[8][3] = new Bishop(Color.WHITE);

        squares[8][3].setPosX(8);
        squares[8][3].setPosY(3);

        squares[1][6] = new Bishop(Color.BLACK);

        squares[1][6].setPosX(1);
        squares[1][6].setPosY(6);

        squares[8][6] = new Bishop(Color.WHITE);

        squares[8][6].setPosX(7);
        squares[8][6].setPosY(5);

        squares[1][2] = new Knight(Color.BLACK);

        squares[1][2].setPosX(1);
        squares[1][2].setPosY(2);

        squares[1][7] = new Knight(Color.BLACK);

        squares[1][7].setPosX(1);
        squares[1][7].setPosY(7);

        squares[8][2] = new Knight(Color.WHITE);

        squares[8][2].setPosX(8);
        squares[8][2].setPosY(2);

        squares[8][7] = new Knight(Color.WHITE);

        squares[8][7].setPosX(8);
        squares[8][7].setPosY(7);

        squares[1][1] = new Rook(Color.BLACK);

        squares[1][1].setPosX(1);
        squares[1][1].setPosY(1);

        squares[1][8] = new Rook(Color.BLACK);

        squares[1][8].setPosX(1);
        squares[1][8].setPosY(8);

        squares[8][1] = new Rook(Color.WHITE);

        squares[8][1].setPosX(8);
        squares[8][1].setPosY(1);

        squares[8][8] = new Rook(Color.WHITE);

        squares[8][8].setPosX(8);
        squares[8][8].setPosY(8);


        while (true) {

            if (!bothKingAlive) {

                return;

            }

            showGame();

            char[] c = new char[2];
            int posY = 0;

            while (true) {

                System.out.print("Enter position piece: ");
                String[] position = sc.nextLine().split("");

                if (position.length != 2) {
                    System.out.println("Invalid input");
                    continue;
                }

                for (i = 0; i < 2; i++) {
                    c[i] = position[i].charAt(0);
                }


                try {
                    posY = Integer.parseInt(String.valueOf(c[1]));

                    if (posY > 8 || posY < 1) {
                        throw new Exception();
                    }


                } catch (Exception e) {
                    System.out.println("The second character must be a number between 1 and 8");
                    continue;
                }

                boolean verification = false;

                for (char a = 'a'; a <= 'h'; a++) {

                    if (c[0] == a) {
                        verification = true;
                        break;
                    }

                }

                if (!verification) {
                    System.out.println("The first character must be a letter between A and H");
                    continue;
                } else {
                    break;
                }

            }

            int posX = c[0] - 96;
            
            if (squares[posX][posY] != null) {


                if (squares[posX][posY].getColor() == time) {

                    game = squares[posX][posY].play(game);

                } else {

                    if (time == Color.WHITE) {

                        System.out.println("Is time to the white");

                    } else {

                        System.out.println("Is time to the black");

                    }

                }

            } else {
                System.out.println("\nNull position\n");
            }

        }


    }

    public void showGame() {


        char pS = 'A';
        int pI = 1;

        for (int i = 0; i <= 8; i++) {

            if (i == 0) {

                System.out.print("\t1\t  2\t\t3\t  4\t\t5\t  6\t\t7\t  8\n");

                continue;
            }

            pI = 0;

            for (int l = 0; l <= 8; l++) {

                if (squares[i][l] == null) {

                    if (l == 0) {
                        System.out.printf("%s", pS);
                    } else {
                        System.out.printf(" (%s%d) ", pS, pI);
                    }

                } else {

                    if (squares[i][l].getType() == Type.PAWN && squares[i][l].getColor() == Color.BLACK) {
                        System.out.print(" P(B) ");
                    }
                    if (squares[i][l].getType() == Type.PAWN && squares[i][l].getColor() == Color.WHITE) {
                        System.out.print(" P(W) ");
                    }

                    if (squares[i][l].getType() == Type.KING && squares[i][l].getColor() == Color.BLACK) {
                        System.out.print(" K(B) ");
                    }
                    if (squares[i][l].getType() == Type.KING && squares[i][l].getColor() == Color.WHITE) {
                        System.out.print(" K(W) ");
                    }

                    if (squares[i][l].getType() == Type.QUEEN && squares[i][l].getColor() == Color.BLACK) {
                        System.out.print(" Q(B) ");
                    }
                    if (squares[i][l].getType() == Type.QUEEN && squares[i][l].getColor() == Color.WHITE) {
                        System.out.print(" Q(W) ");
                    }

                    if (squares[i][l].getType() == Type.KNIGHT && squares[i][l].getColor() == Color.BLACK) {
                        System.out.print(" k(B) ");
                    }
                    if (squares[i][l].getType() == Type.KNIGHT && squares[i][l].getColor() == Color.WHITE) {
                        System.out.print(" k(W) ");
                    }

                    if (squares[i][l].getType() == Type.BISHOP && squares[i][l].getColor() == Color.BLACK) {
                        System.out.print(" B(B) ");
                    }
                    if (squares[i][l].getType() == Type.BISHOP && squares[i][l].getColor() == Color.WHITE) {
                        System.out.print(" B(W) ");
                    }

                    if (squares[i][l].getType() == Type.ROOK && squares[i][l].getColor() == Color.BLACK) {
                        System.out.print(" R(B) ");
                    } else if (squares[i][l].getType() == Type.ROOK && squares[i][l].getColor() == Color.WHITE) {
                        System.out.print(" R(W) ");
                    }

                }

                pI++;

            }

            pS++;
            System.out.println();
            System.out.println();

        }

    }


    public Piece[][] getSquares() {
        return squares;
    }

    public Color getTime() {
        return time;
    }

    public void setTime(Color color) {
        this.time = color;
    }

    public void setBothKingAlive(boolean bothKingAlive) {
        this.bothKingAlive = bothKingAlive;
    }
}