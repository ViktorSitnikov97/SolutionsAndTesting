package io.tasks.task4;

public interface Converter<T, U> {
    U convert(T value);
}
