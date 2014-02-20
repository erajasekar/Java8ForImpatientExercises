package chapter1;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by relango on 2/16/14.
 */
public class Exercise3 {
    public static void main(String args[]) {
        String[] fileNames = getFilesWithExtension(Paths.get(".", "src", "main", "java", "chapter1"), ".java");
        Stream.of(fileNames).forEach(System.out::println);
    }

    private static String[] getFilesWithExtension(Path directory, String extension) {
        return directory.toFile().list((dir, name) -> name.endsWith(extension));
    }
}
