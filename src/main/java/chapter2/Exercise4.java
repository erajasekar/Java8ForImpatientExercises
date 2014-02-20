package chapter2;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by relango on 2/17/14.
 */
public class Exercise4 {
    public static void main(String[] args) {
        int[] values = {1, 4, 9, 16};

        //Prints array as one element
        Stream.of(values).forEach(System.out::println);

        IntStream stream = Arrays.stream(values, 0, values.length);

        //Now each element is int 
        stream.forEach(System.out::println);


    }
}
