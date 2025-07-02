package ru.valaubr.structure.bridge.skins;

import lombok.Getter;

@Getter
public class DefaultSkin implements Skin {
    char ladiaBlack = '♜'; // Ладья чёрных
    char horseBlack = '♞'; // Конь чёрных
    char elephantBlack = '♝'; // Слон чёрных
    char queenBlack = '♛'; // Ферзь чёрных
    char kingBlack = '♚'; // Король чёрных
    char pawnBlack = '♙';

    char ladiaWhite = '♖'; // Ладья белых
    char horseWhite = '♘'; // Конь белых
    char elephantWhite = '♗'; // Слон белых
    char queenWhite = '♕'; // Ферзь белых
    char kingWhite = '♔'; // Король белых
    char pawnWhite = '♟';
}
