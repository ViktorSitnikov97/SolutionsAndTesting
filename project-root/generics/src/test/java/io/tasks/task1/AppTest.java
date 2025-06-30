package io.tasks.task1;

import io.tasks.task1.model.Post;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {

    @Test
    public void testUnique1() {

        var fruits = new ArrayList<>(List.of("mango", "apple", "lemon", "apple", "pear", "mango"));
        var expected = List.of("mango", "apple", "lemon", "pear");
        var actual = ListUtils.uniq(fruits);

        assertThat(actual).isEqualTo(expected);
        assertThat(actual).isNotSameAs(fruits);
    }

    @Test
    public void testUnique2() {

        var coll = new ArrayList<>(List.of(1, 3, 7, 5, 3, 7, 5, 8));
        var expected = List.of(1, 3, 7, 5, 8);
        var actual = ListUtils.uniq(coll);

        assertThat(actual).isEqualTo(expected);
        assertThat(actual).isNotSameAs(coll);
    }

    @Test
    public void testUnique3() {

        var posts = new ArrayList<Post>(List.of(
                new Post("super post", "content"),
                new Post("another post", "content"),
                new Post("super post", "content")
        ));

        var expected = new ArrayList<Post>(List.of(
                new Post("super post", "content"),
                new Post("another post", "content")
        ));

        var actual = ListUtils.uniq(posts);

        assertThat(actual).isEqualTo(expected);
        assertThat(actual).isNotSameAs(posts);
    }

}