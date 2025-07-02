package ru.valaubr.structure.bridge;

import ru.valaubr.structure.bridge.chess.Chess;
import ru.valaubr.structure.bridge.chess.ChessWithoutKing;
import ru.valaubr.structure.bridge.chess.StandardChess;
import ru.valaubr.structure.bridge.skins.AsciSkin;
import ru.valaubr.structure.bridge.skins.DefaultSkin;

public class Game {

    public static void main(String[] args) {
        Chess chessWithoutKing = new ChessWithoutKing(new AsciSkin());
        Chess chessWithoutKingDefaultSkin = new ChessWithoutKing(new DefaultSkin());
        Chess standardChess = new StandardChess(new DefaultSkin());

        printChess(chessWithoutKing);
        System.out.println();
        printChess(chessWithoutKingDefaultSkin);
        System.out.println();
        printChess(standardChess);
    }

    private static void printChess(Chess chess) {
        var chessField = chess.makeChessField();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(chessField[i][j]);
            }
            System.out.println();
        }
    }
}
