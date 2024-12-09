package Pieces;

import ChessBoard.ChessBoard;

import static ChessBoard.ChessBoard.sc;

public class Knight extends Piece {

    public Knight(Color color) {

        super(Type.KNIGHT, color, true);


    }

    @Override
    public ChessBoard play(ChessBoard cb) {

        char[] c = new char[2];
        int posY = 0;
        int posX = 0;
        int i;

        while (true) {

            boolean verification;

            while (true) {

                System.out.print(this.type + "//" + this.color);

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
