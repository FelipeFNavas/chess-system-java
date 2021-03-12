package application;

import boardgame.Board;
import chess.ChessMatch;

public class Program {
    public static void main(String[] Args){
        ChessMatch chessMatch = new ChessMatch();

        UI.printBoard(chessMatch.getPieces());
    }

    public static void sysout(String s){
        System.out.print(s);
    }
    public static void sysoutln(String s){
        System.out.println(s);
    }
}
