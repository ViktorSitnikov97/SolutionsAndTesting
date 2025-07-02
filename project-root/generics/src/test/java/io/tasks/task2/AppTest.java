package io.tasks.task2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.EmptyStackException;


public class AppTest {

    @Test
    public void testStack1() {

        var stack = new Stack<String>();

        assertThat(stack.isEmpty()).isTrue();

        assertThat(stack.push("a")).isEqualTo("a");
        assertThat(stack.isEmpty()).isFalse();

        stack.push("b");
        assertThat(stack.peek()).isEqualTo("b");
        assertThat(stack.peek()).isEqualTo("b");

        assertThat(stack.pop()).isEqualTo("b");
        assertThat(stack.peek()).isEqualTo("a");

        assertThat(stack.pop()).isEqualTo("a");
        assertThat(stack.isEmpty()).isTrue();

        assertThatThrownBy(() -> stack.pop()).isInstanceOf(EmptyStackException.class);
    }

    @Test
    public void testStack2() {

        var stack = new Stack<Integer>();

        assertThat(stack.isEmpty()).isTrue();

        stack.push(1);
        assertThat(stack.isEmpty()).isFalse();

        stack.push(2);
        assertThat(stack.peek()).isEqualTo(2);
        assertThat(stack.peek()).isEqualTo(2);

        assertThat(stack.pop()).isEqualTo(2);
        assertThat(stack.peek()).isEqualTo(1);

        assertThat(stack.pop()).isEqualTo(1);
        assertThat(stack.isEmpty()).isTrue();

        assertThatThrownBy(() -> stack.pop()).isInstanceOf(EmptyStackException.class);
    }
}