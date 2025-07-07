package io.tasks.task5;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import io.tasks.task5.model.Pair;
import io.tasks.task5.model.SimplePair;

public class AppTest {

    @Test
    public void testFromPairs1() {

        List<Pair<String, Integer>> coll = List.of(
            new SimplePair("a", 1),
            new SimplePair("b", 2)
        );

        var actual = PairUtils.fromPairs(coll);
        var expected = Map.of("a", 1, "b", 2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testFromPairs2() {

        List<Pair<Double, Character>> coll = List.of(
            new SimplePair(2.1, 'a'),
            new SimplePair(5.8, 'c'),
            new SimplePair(-13.1, 'h')

        );

        var actual = PairUtils.fromPairs(coll);
        var expected = Map.of(2.1, 'a', 5.8, 'c', -13.1, 'h');

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testToPairs() {

        Map<String, Integer> data = new LinkedHashMap();
        data.put("a", 1);
        data.put("b", 2);
        var actual = PairUtils.toPairs(data);

        assertThat(actual.get(0).getLeft()).isEqualTo("a");
        assertThat(actual.get(0).getRight()).isEqualTo(1);

        assertThat(actual.get(1).getLeft()).isEqualTo("b");
        assertThat(actual.get(1).getRight()).isEqualTo(2);
    }
}