package lk.ijse.gdse.tictactoe;

public interface Board {
    void initializeBoard();
    boolean isLegalMove(int row, int col);
    void updateMove(int row, int col, Piece piece);
    Winner checkWinner();
    boolean isFull();
    void printBoard();
//    void getBoardUI();
}
