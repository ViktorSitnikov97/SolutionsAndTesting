package io.tasks.task5;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import io.tasks.task5.model.Pair;
import io.tasks.task5.model.SimplePair;

public class PairUtils {

   public static <L, R> Map<L, R> fromPairs(List<Pair<L, R>> list) {
       HashMap<L, R> result = new HashMap<>();

       for (var pair : list) {
           result.put(pair.getLeft(), pair.getRight());
       }
       return result;
   }

   public static <L, R> List<Pair<L, R>> toPairs(Map<L, R> map) {
       List<Pair<L, R>> result = new ArrayList<>();
       map.forEach((key, value) -> result.add(new SimplePair<L, R>(key, value)));
       return result;
   }
}

