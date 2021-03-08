package application;

import boardgame.Board;

public class Program {
    public static void main(String[] Args){
        Board board = new Board(8, 8);

        System.out.println(board);
    }

    public static void sysout(String s){
        System.out.print(s);
    }
    public static void sysoutln(String s){
        System.out.println(s);
    }
}
