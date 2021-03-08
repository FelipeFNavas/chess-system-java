package application;

import boardgame.Position;

public class Program {
    public static void main(String[] Args){
        Position pos = new Position(3, 5);

        System.out.println(pos);

    }

    public static void sysout(String s){
        System.out.print(s);
    }
    public static void sysoutln(String s){
        System.out.println(s);
    }
}
