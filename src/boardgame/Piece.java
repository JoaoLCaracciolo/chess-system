package boardgame;

import java.util.Scanner;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Position position, Board board) {
        this.position = position;
        this.board = null;
    }

    protected Board getBoard() {
        return board;
    }


}
