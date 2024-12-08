package Pieces;

import ChessBoard.ChessBoard;

public class Piece {

    protected Type type;
    protected Color color;
    protected boolean inGame;
    protected int posX;
    protected int posY;

    public Piece(Type type, Color color, boolean inGame) {
        this.color = color;
        this.type = type;
        this.inGame = inGame;
    }

    public ChessBoard play(ChessBoard cb) {

        System.out.println("Classe mae");

        return cb;

    }

    public Type getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }

    @Override
    public String toString() {

        return getType().toString() + "//" + getColor().toString();

    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getPosX() {
        return this.posX;
    }

    public int getPosY() {
        return posY;
    }

    public boolean isInGame() {
        return inGame;
    }
}
