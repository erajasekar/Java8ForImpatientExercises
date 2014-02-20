package chapter1;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by relango on 2/16/14.
 */
public class Exercise2 {
    public static void main(String args[]) {
        File[] subDirectors = getSubDirectors(Paths.get("."));
        Stream.of(subDirectors).forEach(System.out::println);
    }

    private static File[] getSubDirectors(Path parent) {
        return parent.toFile().listFiles(pathname -> pathname.isDirectory());

    }
}
