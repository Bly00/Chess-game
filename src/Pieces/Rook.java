package Pieces;

import ChessBoard.ChessBoard;

import static ChessBoard.ChessBoard.choicePosition;

public class Rook extends Piece {

    public Rook(Color color) {
        super(Type.ROOK, color, true);
    }

    @Override
    public ChessBoard play(ChessBoard cb) {

        while (true) {

            System.out.println(this.getType() + "//" + this.getColor());

            int[] pos = choicePosition();

            int posX = pos[0];
            int posY = pos[1];

            if (cb.getTime() == Color.WHITE) {//Vez dos brancos

                if (posX == this.posX - 1 && posY == this.posY) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX - 2 && posY == this.posY) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX - 3 && posY == this.posY) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX - 4 && posY == this.posY) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX - 5 && posY == this.posY) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX - 6 && posY == this.posY) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX - 7 && posY == this.posY) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX + 1 && posY == this.posY) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX + 2 && posY == this.posY) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX + 3 && posY == this.posY) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX + 4 && posY == this.posY) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX + 5 && posY == this.posY) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX + 6 && posY == this.posY) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX + 7 && posY == this.posY) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX && posY == this.posY + 1) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX && posY == this.posY + 2) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX && posY == this.posY + 3) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX && posY == this.posY + 4) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX && posY == this.posY + 5) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX && posY == this.posY + 6) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX && posY == this.posY + 7) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX && posY == this.posY - 1) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX && posY == this.posY - 2) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX && posY == this.posY - 3) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX && posY == this.posY - 4) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX && posY == this.posY - 5) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX && posY == this.posY - 6) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX && posY == this.posY - 7) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                    }

                } else {

                    System.out.println("\nInvalid move\n");
                    continue;

                }

            }//Vez dos brancos

            if (cb.getTime() == Color.BLACK) {

                if (posX == this.posX - 1 && posY == this.posY) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX - 2 && posY == this.posY) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX - 3 && posY == this.posY) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX - 4 && posY == this.posY) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX - 5 && posY == this.posY) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX - 6 && posY == this.posY) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX - 7 && posY == this.posY) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX + 1 && posY == this.posY) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX + 2 && posY == this.posY) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX + 3 && posY == this.posY) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX + 4 && posY == this.posY) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX + 5 && posY == this.posY) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX + 6 && posY == this.posY) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX + 7 && posY == this.posY) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX && posY == this.posY + 1) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX && posY == this.posY + 2) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX && posY == this.posY + 3) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX && posY == this.posY + 4) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX && posY == this.posY + 5) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX && posY == this.posY + 6) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX && posY == this.posY + 7) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                    }

                } else if (posX == this.posX && posY == this.posY - 1) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX && posY == this.posY - 2) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX && posY == this.posY - 3) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX && posY == this.posY - 4) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX && posY == this.posY - 5) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX && posY == this.posY - 6) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                        System.out.println("Invalid move");
                        continue;

                    }

                } else if (posX == this.posX && posY == this.posY - 7) {

                    if (verification(posX, posY, cb)) {
                        System.out.println("\nInvalid move\n");
                        continue;
                    }

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

                    }

                } else {

                    System.out.println("\nInvalid move\n");
                    continue;

                }


            }


        }

    }

    private boolean verification(int posX, int posY, ChessBoard cb) {

        if (posX < this.posX && posY == this.posY) {

            for (int x = this.posX - 1; x > posX; x--) {

                if (cb.getSquares()[x][this.posY] != null) {

                    return true;

                }

            }

        }

        if (posX > this.posX && posY == this.posY) {

            for (int x = this.posX + 1; x < posX; x++) {

                if (cb.getSquares()[x][this.posY] != null) {

                    return true;

                }

            }

        }

        if (posX == this.posX && posY > this.posY) {

            for (int y = this.posY + 1; y < posY; y++) {

                if (cb.getSquares()[this.posX][y] != null) {

                    return true;

                }


            }

        }

        if (posX == this.posX && posY < this.posY) {

            for (int y = this.posY - 1; y > posY; y--) {

                if (cb.getSquares()[this.posX][y] != null) {

                    return true;

                }


            }

        }

        return false;

    }


}
