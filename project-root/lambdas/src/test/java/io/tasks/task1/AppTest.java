package io.tasks.task1;

import org.assertj.core.data.Index;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AppTest {
    @Test
    public void enlargeArrayImageTest() {
        String[][] image = {
                {"*", "*", "*", "*"},
                {"*", " ", " ", "*"},
                {"*", " ", " ", "*"},
                {"*", "*", "*", "*"},
        };

        var expected = new String[][] {
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
        };

        var actual = App.enlargeArrayImage(image);
        Assertions.assertTrue(actual.length == image.length * 2);
        Assertions.assertTrue(actual[0].length == image[0].length * 2);

        org.assertj.core.api.Assertions.assertThat(actual)
                .isNotEmpty()
                .contains(new String[]{"*", "*", "*", "*", "*", "*", "*", "*"}, Index.atIndex(0))
                .contains(new String[]{"*", "*", " ", " ", " ", " ", "*", "*"}, Index.atIndex(5));

        Assertions.assertArrayEquals(expected, actual);


    }

}
