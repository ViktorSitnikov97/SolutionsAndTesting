package io.tasks.task4;

import lombok.RequiredArgsConstructor;

import java.util.function.Function;

@RequiredArgsConstructor
public class FunctionConverter<T, U> implements Converter<T, U> {

    private final Function<T, U> func;

//    public FunctionConverter(Function<T, U> func) {
//        this.func = func;
//    }
    public U convert(T value) {
        return func.apply(value);
    }

}
