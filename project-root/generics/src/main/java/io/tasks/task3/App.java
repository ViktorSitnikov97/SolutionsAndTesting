package io.tasks.task3;

import java.util.Comparator;
import java.util.List;

public class App {

    public static <T extends Comparable<? super T>> T findMax(List<T> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.stream().max(Comparator.naturalOrder()).orElse(null);
    }

}
