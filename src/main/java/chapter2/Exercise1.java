package chapter2;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;

/**
 * Created by relango on 2/17/14.
 */
public class Exercise1 {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("pom.xml")));
        List<String> words = Arrays.asList(contents.split("[\\P{L}]+"));
        // non-parallel version
        //long count = words.stream().filter(w -> w.length() > 12).count();

        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Cores : " + cores);
        //TODO split based on number of processors for  parallel version
        long count = words.parallelStream().filter(w -> w.length() > 12).count();

        System.out.println(count);


    }
}
