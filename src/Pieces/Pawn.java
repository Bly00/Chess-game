package Pieces;

import ChessBoard.ChessBoard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static ChessBoard.ChessBoard.sc;

public class Pawn extends Piece {

    boolean firstPlay = true;

    public Pawn(Color color) {
        super(Type.PAWN, color, true);
    }

    @Override
    public ChessBoard play(ChessBoard cb) {

        if (cb.getTime() == Color.WHITE) {

            if (cb.getSquares()[this.posX - 1][this.posY] != null && (cb.getSquares()[this.posX - 1][this.posY + 1] == null && cb.getSquares()[this.posX - 1][this.posY - 1] == null)) {
                System.out.println("Piece without possible moves");
                return cb;
            }

        } else {

            if (cb.getSquares()[this.posX + 1][this.posY] != null && (cb.getSquares()[this.posX + 1][this.posY + 1] == null && cb.getSquares()[this.posX + 1][this.posY - 1] == null)) {
                System.out.println("Piece without possible moves");
                return cb;
            }

        }


        char[] possibility = new char[2];

        System.out.print("\n" + this);

        char[] c = new char[2];
        int posY = 0;
        int posX = 0;
        int i;

        while (true) {


            boolean verification;

            while (true) {

                System.out.print(" - Your move: ");

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

                verification = false;

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
                    posX = c[0] - 96;
                    break;
                }


            }

            if (cb.getTime() == Color.WHITE) {

                if (posX == this.posX - 2 && posY == this.posY) {

                    if (cb.getSquares()[this.posX - 2][this.posY] == null && firstPlay) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = this.posX - 2;

                        firstPlay = false;

                        cb.setTime(Color.BLACK);

                        return cb;

                    } else {

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX - 1 && posY == this.posY) {

                    if (cb.getSquares()[this.posX - 1][this.posY] == null) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;

                        firstPlay = false;

                        cb.setTime(Color.BLACK);

                        return cb;

                    } else {

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX - 1 && posY == this.posY - 1) {

                    if (cb.getSquares()[posX][posY] != null) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        firstPlay = false;

                        cb.setTime(Color.BLACK);

                        return cb;

                    } else {

                        System.out.println("\nInvalid move\n");
                        continue;

                    }

                } else if (posX == this.posX - 1 && posY == this.posY + 1) {

                    if (cb.getSquares()[posX][posY] != null) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        firstPlay = false;

                        cb.setTime(Color.BLACK);

                        return cb;

                    } else {

                        System.out.println("\nInvalid move\n");
                        continue;

                    }

                } else {

                    System.out.println("\nInvalid move\n");
                    continue;

                }


            } else {

                if (posX == this.posX + 2 && posY == this.posY) {

                    if (cb.getSquares()[this.posX + 2][this.posY] == null && firstPlay) {

                        cb.getSquares()[this.posX + 2][this.posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = this.posX + 2;

                        firstPlay = false;

                        cb.setTime(Color.WHITE);

                        return cb;

                    } else {

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX + 1 && posY == this.posY) {

                    if (cb.getSquares()[this.posX + 1][this.posY] == null) {

                        cb.getSquares()[this.posX + 1][this.posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = this.posX + 1;

                        firstPlay = false;

                        cb.setTime(Color.WHITE);

                        return cb;

                    } else {

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX + 1 && posY == this.posY - 1) {

                    if (cb.getSquares()[posX][posY] != null) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        firstPlay = false;

                        cb.setTime(Color.WHITE);

                        return cb;

                    }

                } else if (posX == this.posX + 1 && posY == this.posY + 1) {

                    if (cb.getSquares()[posX][posY] != null) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        firstPlay = false;

                        cb.setTime(Color.WHITE);

                        return cb;

                    }

                } else {

                    System.out.println("Invalid move");
                    continue;

                }

            }


        }


    }
}
