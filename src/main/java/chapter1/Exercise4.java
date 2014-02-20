package chapter1;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by relango on 2/16/14.
 */
public class Exercise4 {
    public static void main(String args[]) {
        File[] parent = Paths.get(".").toFile().listFiles();
        Arrays.sort(parent, (first,second) -> {
            if ((first.isDirectory() && second.isDirectory()) || (first.isFile() && second.isFile()))
                return first.getAbsolutePath().compareTo(second.getAbsolutePath());
            else if (first.isDirectory())
                return -1;
            else
                return 1;
        });
        Stream.of(parent).forEach(System.out::println);
    }

    private static String[] getFilesWithExtension(Path directory, String extension) {
        return directory.toFile().list((dir, name) -> name.endsWith(extension));
    }
}
