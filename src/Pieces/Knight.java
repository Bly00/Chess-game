package Pieces;

import ChessBoard.ChessBoard;

import static ChessBoard.ChessBoard.choicePosition;
import static ChessBoard.ChessBoard.sc;

public class Knight extends Piece {

    public Knight(Color color) {

        super(Type.KNIGHT, color, true);


    }

    @Override
    public ChessBoard play(ChessBoard cb) {


        while (true) {

            int[] pos = choicePosition();

            int posX = pos[0];
            int posY = pos[1];

            if (cb.getTime() == Color.WHITE) {

                if (posX == this.posX - 2 && posY == this.posY - 1) {

                    if (cb.getSquares()[posX][posY] == null) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.BLACK);

                        return cb;

                    } else if (cb.getSquares()[posX][posY].getColor() != Color.WHITE) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.BLACK);

                        return cb;

                    } else {

                        System.out.println("\nInvalid move\n");
                        continue;

                    }


                } else if (posX == this.posX - 2 && posY == this.posY + 1) {

                    if (cb.getSquares()[posX][posY] == null) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.BLACK);

                        return cb;

                    } else if (cb.getSquares()[posX][posY].getColor() != Color.WHITE) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.BLACK);

                        return cb;

                    } else {

                        System.out.println("\nInvalid move\n");
                        continue;

                    }

                } else if (posX == this.posX - 1 && posY == this.posY + 2) {

                    if (cb.getSquares()[posX][posY] == null) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.BLACK);

                        return cb;

                    } else if (cb.getSquares()[posX][posY].getColor() != Color.WHITE) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.BLACK);

                        return cb;

                    } else {

                        System.out.println("\nInvalid move\n");
                        continue;

                    }

                } else if (posX == this.posX + 1 && posY == this.posY + 2) {

                    if (cb.getSquares()[posX][posY] == null) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.BLACK);

                        return cb;

                    } else if (cb.getSquares()[posX][posY].getColor() != Color.WHITE) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.BLACK);

                        return cb;

                    } else {

                        System.out.println("\nInvalid move\n");
                        continue;

                    }

                } else if (posX == this.posX - 1 && posY == this.posY - 2) {

                    if (cb.getSquares()[posX][posY] == null) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.BLACK);

                        return cb;

                    } else if (cb.getSquares()[posX][posY].getColor() != Color.WHITE) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.BLACK);

                        return cb;

                    } else {

                        System.out.println("\nInvalid move\n");
                        continue;

                    }

                } else if (posX == this.posX + 1 && posY == this.posY - 2) {

                    if (cb.getSquares()[posX][posY] == null) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.BLACK);

                        return cb;

                    } else if (cb.getSquares()[posX][posY].getColor() != Color.WHITE) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.BLACK);

                        return cb;

                    } else {

                        System.out.println("\nInvalid move\n");
                        continue;

                    }

                } else if (posX == this.posX + 2 && posY == this.posY - 1) {

                    if (cb.getSquares()[posX][posY] == null) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.BLACK);

                        return cb;

                    } else if (cb.getSquares()[posX][posY].getColor() != Color.WHITE) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.BLACK);

                        return cb;

                    } else {

                        System.out.println("\nInvalid move\n");
                        continue;

                    }

                } else if (posX == this.posX + 2 && posY == this.posY + 1) {

                    if (cb.getSquares()[posX][posY] == null) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.BLACK);

                        return cb;

                    } else if (cb.getSquares()[posX][posY].getColor() != Color.WHITE) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.BLACK);

                        return cb;

                    } else {

                        System.out.println("\nInvalid move\n");
                        continue;

                    }

                } else {

                    System.out.println("\nInvalid move\n");

                }

            }
            if (cb.getTime() == Color.BLACK) {

                if (posX == this.posX + 2 && posY == this.posY + 1) {

                    if (cb.getSquares()[posX][posY] == null) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.WHITE);

                        return cb;

                    } else if (cb.getSquares()[posX][posY].getColor() != Color.BLACK) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.WHITE);

                        return cb;

                    } else {

                        System.out.println("\nInvalid move\n");
                        continue;

                    }

                } else if (posX == this.posX + 2 && posY == this.posY - 1) {

                    if (cb.getSquares()[posX][posY] == null) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.WHITE);

                        return cb;

                    } else if (cb.getSquares()[posX][posY].getColor() != Color.BLACK) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.WHITE);

                        return cb;

                    } else {

                        System.out.println("\nInvalid move\n");
                        continue;

                    }

                } else if (posX == this.posX - 2 && posY == this.posY + 1) {

                    if (cb.getSquares()[posX][posY] == null) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.WHITE);

                        return cb;

                    } else if (cb.getSquares()[posX][posY].getColor() == Color.WHITE) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.WHITE);

                        return cb;

                    } else {

                        System.out.println("\nInvalid move\n");
                        continue;

                    }

                } else if (posX == this.posX - 2 && posY == this.posY - 1) {

                    if (cb.getSquares()[posX][posY] == null) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.WHITE);

                        return cb;

                    } else if (cb.getSquares()[posX][posY].getColor() == Color.WHITE) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.WHITE);

                        return cb;

                    } else {

                        System.out.println("\nInvalid move\n");
                        continue;

                    }

                } else if (posX == this.posX - 1 && posY == this.posY - 2) {

                    if (cb.getSquares()[posX][posY] == null) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.WHITE);

                        return cb;

                    } else if (cb.getSquares()[posX][posY].getColor() == Color.WHITE) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.WHITE);

                        return cb;

                    } else {

                        System.out.println("\nInvalid move\n");
                        continue;

                    }

                } else if (posX == this.posX + 1 && posY == this.posY - 2) {

                    if (cb.getSquares()[posX][posY] == null) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.WHITE);

                        return cb;

                    } else if (cb.getSquares()[posX][posY].getColor() == Color.WHITE) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.WHITE);

                        return cb;

                    } else {

                        System.out.println("\nInvalid move\n");
                        continue;

                    }

                } else if (posX == this.posX - 1 && posY == this.posY + 2) {

                    if (cb.getSquares()[posX][posY] == null) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.WHITE);

                        return cb;

                    } else if (cb.getSquares()[posX][posY].getColor() == Color.WHITE) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.WHITE);

                        return cb;

                    } else {

                        System.out.println("\nInvalid move\n");
                        continue;

                    }

                } else if (posX == this.posX + 1 && posY == this.posY + 2) {

                    if (cb.getSquares()[posX][posY] == null) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.WHITE);

                        return cb;

                    } else if (cb.getSquares()[posX][posY].getColor() == Color.WHITE) {

                        cb.getSquares()[posX][posY] = this;

                        cb.getSquares()[this.posX][this.posY] = null;

                        this.posX = posX;
                        this.posY = posY;

                        cb.setTime(Color.WHITE);

                        return cb;

                    } else {

                        System.out.println("\nInvalid move\n");
                        continue;

                    }

                } else {

                    System.out.println("\nInvalid move\n");
                    continue;

                }

            }
        }

    }


}
