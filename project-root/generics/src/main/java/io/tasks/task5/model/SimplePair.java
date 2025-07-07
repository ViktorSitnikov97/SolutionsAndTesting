package io.tasks.task5.model;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public final class SimplePair<L, R> implements Pair<L, R> {

    private L left;
    private R right;

    public L getLeft() {
        return left;
    }

    public R getRight() {
        return right;
    }
}
