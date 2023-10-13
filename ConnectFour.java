package connectfour;

public class ConnectFour{

    public static void main(String[] args) {
        Board boardGame = new Board();
        boardGame.addPiece(8,"X");
        boardGame.addPiece(8,"O");
        boardGame.printboard();
    }

}