package ru.valaubr.structure.bridge.chess;

import ru.valaubr.structure.bridge.skins.Skin;

public class ChessWithoutPawn implements Chess {
    private Skin skin;

    // Размеры доски
    final int BOARD_SIZE = 8;

    // Двумерный массив для хранения состояния доски
    char[][] board = new char[BOARD_SIZE][BOARD_SIZE];

    public ChessWithoutPawn(Skin skin) {
        this.skin = skin;
    }

    // Метод инициализации позиции фигур на доске
    private char[][] initializeBoard() {
        // Чёрные фигуры сверху
        board[0][0] = skin.getLadiaWhite(); // Ладья чёрных
        board[0][1] = skin.getHorseBlack(); // Конь чёрных
        board[0][2] = skin.getElephantBlack(); // Слон чёрных
//        board[0][3] = skin.getQueenBlack(); // Ферзь чёрных
        board[0][4] = skin.getKingBlack(); // Король чёрных
        board[0][5] = skin.getElephantBlack(); // Слон чёрных
        board[0][6] = skin.getHorseBlack(); // Конь чёрных
        board[0][7] = skin.getLadiaBlack(); // Ладья чёрных

        // Белые фигуры внизу
        board[7][0] = skin.getLadiaWhite(); // Ладья белых
        board[7][1] = skin.getHorseWhite(); // Конь белых
        board[7][2] = skin.getElephantWhite(); // Слон белых
//        board[7][3] = skin.getQueenWhite(); // Ферзь белых
        board[7][4] = skin.getKingWhite(); // Король белых
        board[7][5] = skin.getElephantWhite(); // Слон белых
        board[7][6] = skin.getHorseWhite(); // Конь белых
        board[7][7] = skin.getLadiaWhite(); // Ладья белых

        // Белые пешки снизу
        for (int col = 0; col < 8; col++) {
            board[1][col] = skin.getPawnWhite();
        }

        // Чёрные пешки вверху
        for (int col = 0; col < 8; col++) {
            board[6][col] = skin.getPawnBlack();
        }

        // Остальные поля пусты
        for (int row = 2; row <= 5; row++) {
            for (int col = 0; col < 8; col++) {
                board[row][col] = ' '; // Пустое поле
            }
        }
        return board;
    }

    @Override
    public char[][] makeChessField() {
        return initializeBoard();
    }
}
