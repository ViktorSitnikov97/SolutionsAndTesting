package io.tasks.task4;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;
import java.time.LocalDate;
import java.util.function.Function;

import io.tasks.task4.model.Post;


public class AppTest {

    @Test
    public void testIntStringConversion() {

        var converter = new FunctionConverter<Double, String>(v -> v.toString());

        assertThat(converter.convert(2.5)).isEqualTo("2.5");
        assertThat(converter.convert(5.0)).isEqualTo("5.0");
    }

    @Test
    public void testDateStringConversion() {

        var converter = new FunctionConverter<LocalDate, String>(LocalDate::toString);
        var date = LocalDate.of(2024, 1, 1);

        assertThat(converter.convert(date)).isEqualTo("2024-01-01");
    }

    @Test
    public void testMapToPostConversion() {

        Function<Map<String, String>, Post> func = data -> {
            return new Post(
                data.get("name"),
                data.get("body")
            );
        };

        var converter = new FunctionConverter<Map<String, String>, Post>(func);

        var postData = Map.of(
            "name", "test post",
            "body", "test body"
        );

        var actualPost = converter.convert(postData);

        assertThat(actualPost.getTitle()).isEqualTo("test post");
        assertThat(actualPost.getContent()).isEqualTo("test body");
    }

}