package chapter2;

import java.util.stream.Stream;

/**
 * Problem : Using Straem.iterate, make an infinite stream of random numbers - not by calling Math.random but by directly
 * implementing a linear congruential generator. In such a generator, you start with X0 = seed and then produce XN+1 = (aXN + c) % m.
 * for appropriate values of a, c and m. You should implement a method with parameters a , c, n and seed that yiedls a <code>Stream<Long></code>
 * Try out a = 25214903917L, c = 11 and m = 2 pow 48.
 *
 * @author relango
 */
public class Exercise5 {

    public static void main(String[] args) {
        Stream<Long> randomNumbers = Stream.iterate(0L, seed -> linearCongruentialGenerator(seed,25214903917L,11,(long)Math.pow(2,48))).peek(System.out::println).limit(5);
        randomNumbers.toArray();
    }

    private static Long linearCongruentialGenerator(long seed, long a, int c, long m){
        return ((a * seed) + c) % m;

    }
}
