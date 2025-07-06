package io.tasks.task3;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.time.LocalDate;

public class AppTest {

    @Test
    public void testFimdMax1() {

        var coll = List.of(1, 2, 3, 10, 4, 5, 6);
        var actual = App.findMax(coll);

        assertThat(actual).isEqualTo(10);
    }

    @Test
    public void testFindMax2() {

        var coll = List.of("a", "b", "x", "h", "o");
        var actual = App.findMax(coll);

        assertThat(actual).isEqualTo("x");
    }

    @Test
    public void testFindMax3() {

        var coll = List.of(
            LocalDate.of(2000, 1, 1),
            LocalDate.of(2020, 2, 12),
            LocalDate.of(2018, 5, 3)
        );
        var actual = App.findMax(coll);

        assertThat(actual).isEqualTo(LocalDate.of(2020, 2, 12));
    }

}