package chapter2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Created by relango on 2/17/14.
 */
public class Exercise3 {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("pom.xml")));
        List<String> words = Arrays.asList(contents.split("[\\P{L}]+"));
        // non-parallel version
        long start = System.currentTimeMillis();
        long count = words.stream().filter(w -> w.length() > 12).count();
        long end = System.currentTimeMillis();
        System.out.println("Non parallel version took " + (end - start) + "ms");
        start = System.currentTimeMillis();
        count = words.parallelStream().filter(w -> w.length() > 12).count();
        end = System.currentTimeMillis();
        System.out.println("Parallel version took " + (end - start) + "ms");
        System.out.println(count);


    }
}
