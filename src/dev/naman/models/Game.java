package dev.naman.models;

import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Dice> dices;
}

// 2 dices
// 1 - 6 -> p(1) -> 1/6
// 1 - 12 -> p(1) -> 1/12
// 2 dices of 1- 6: p(1) -> 0
// implement a uniform random generator?
// math
// 5 -> 1- 12: p(5) 1/12
// 2 dices of 1-6: (1 + 4), (2 + 3), (3 + 2), (4 + 1) ~1/9