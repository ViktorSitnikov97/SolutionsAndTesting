package io.tasks.task1;

import java.util.Arrays;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        String[][] image = {
                {"*", "*", "*", "*"},
                {"*", " ", " ", "*"},
                {"*", " ", " ", "*"},
                {"*", "*", "*", "*"},
        };
        System.out.println(Arrays.deepToString(image));

        String[][] enlargedImage = App.enlargeArrayImage(image);
        System.out.println(Arrays.deepToString(enlargedImage));
    }
    public static String[][] enlargeArrayImage(String[][] figure) {
        String[][] verticalEnlarge = Stream.of(figure)
                .flatMap(array ->  Stream.of(array, array))
                .toArray(String[][]::new);
        return Stream.of(verticalEnlarge)
                .map(row -> Arrays.stream(row)
                        .flatMap(s -> Stream.of(s, s))
//                        .map(s -> s + s)
                        .toArray(String[]::new)
                )
                .toArray(String[][]::new);


    }
//    private static String[] getFlatArray(String[][] array) {
//        String[] result = new String[array.length * array.length];
//        int k = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                result[k++] = array[i][j];
//            }
//        }
//        System.out.println(Arrays.toString(result));
//        return result;
//    }
}
