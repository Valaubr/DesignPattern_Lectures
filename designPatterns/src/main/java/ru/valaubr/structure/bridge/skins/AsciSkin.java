package ru.valaubr.structure.bridge.skins;

import lombok.Getter;

@Getter
public class AsciSkin implements Skin {
    char ladiaBlack = 'L'; // Ладья чёрных
    char horseBlack = 'H'; // Конь чёрных
    char elephantBlack = 'E'; // Слон чёрных
    char queenBlack = 'Q'; // Ферзь чёрных
    char kingBlack = 'K'; // Король чёрных
    char pawnBlack = 'P';

    char ladiaWhite = '^'; // Ладья белых
    char horseWhite = '%'; // Конь белых
    char elephantWhite = '#'; // Слон белых
    char queenWhite = '@'; // Ферзь белых
    char kingWhite = '!'; // Король белых
    char pawnWhite = '.';
}
