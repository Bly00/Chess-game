package Pieces;

import ChessBoard.ChessBoard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static ChessBoard.ChessBoard.choicePosition;
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


        System.out.print("\n" + this);

        while (true) {

            int[] pos = choicePosition();

            int posX = pos[0];
            int posY = pos[1];

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

                    if (cb.getSquares()[posX][posY] != null && cb.getSquares()[posX][posY].getColor() != Color.WHITE) {


                        if (cb.getSquares()[posX][posY].getType() == Type.KING) {

                            System.out.println("\nThe Whites Win\n");

                            cb.setBothKingAlive(false);

                            return cb;

                        }

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

                } else if (posX == this.posX - 1 && posY == this.posY + 1 && cb.getSquares()[posX][posY].getColor() != Color.WHITE) {

                    if (cb.getSquares()[posX][posY].getType() == Type.KING) {

                        System.out.println("\nThe Whites Win\n");

                        cb.setBothKingAlive(false);

                        return cb;

                    }

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

                } else if (posX == this.posX + 1 && posY == this.posY - 1 && cb.getSquares()[posX][posY].getColor() != Color.BLACK) {

                    if (cb.getSquares()[posX][posY].getType() == Type.KING) {

                        System.out.println("\nThe Blacks Win\n");

                        cb.setBothKingAlive(false);

                        return cb;

                    }

                    if (cb.getSquares()[posX][posY] != null) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        firstPlay = false;

                        cb.setTime(Color.WHITE);

                        return cb;

                    }

                } else if (posX == this.posX + 1 && posY == this.posY + 1 && cb.getSquares()[posX][posY].getColor() != Color.BLACK) {

                    if (cb.getSquares()[posX][posY].getType() == Type.KING) {

                        System.out.println("\nThe Blacks Win\n");

                        cb.setBothKingAlive(false);

                        return cb;

                    }

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
