package io.tasks.task1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class ListUtils {

//    public static <E> List<E> uniq(List<E> list) {
//        ArrayList<E> listUniq = new ArrayList<>();
//        for (var item :list) {
//            if (!listUniq.contains(item)) {
//                listUniq.add(item);
//            }
//        }
//        return listUniq;
//    }
    public static <T> List<T> uniq(List<T> list) {
        return new LinkedHashSet<>(list).stream().toList();
    }
}