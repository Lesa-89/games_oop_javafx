package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;

import static org.assertj.core.api.Assertions.assertThat;

class BishopBlackTest {

    @Test
    void whenRightPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Cell result = bishopBlack.position();
        assertThat(Cell.C8.equals(result));
    }

    @Test
    void wayWhenC1ToG5ThenD2E3F4G5() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] result = bishopBlack.way(Cell.G5);
        Cell[] expected = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(expected.equals(result));
    }

    @Test
    void whenCopySuccessfully() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        BishopBlack copyBishopBlack = (BishopBlack) bishopBlack.copy(Cell.E6);
        Cell result = copyBishopBlack.position();
        assertThat(Cell.E6.equals(result));
    }
}