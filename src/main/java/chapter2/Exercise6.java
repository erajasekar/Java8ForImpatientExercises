package chapter2;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Problem : The characterStream method in section 2.3, on page 25, was a bit clumsy, first filling an array list and then turning it into stream.
 * Write a stream-based one liner instead. One approach is to make a stream of integers from 0 to s.length() - 1 and map that with the
 * s::charAt method reference.
 *
 * @author relango
 */
public class Exercise6 {

    public static void main(String[] args) {
        characterStream("Hello World").forEach(System.out::println);

    }

    public static Stream<Character> characterStream(String s){
       return IntStream.range(0, s.length()).mapToObj(s::charAt);
        // alternate solution using iterate
        // return Stream.iterate(0, n -> n + 1).limit(s.length()).map(s::charAt);
    }
}
