package chapter2;

import java.util.Arrays;
import java.util.List;

/**
 * Created by relango on 2/17/14.
 */
public class Exercise2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("aaaaa", "bb", "ccccc" , "dd", "eeeeee", "ffff", "ggggg", "h", "iiiii" , "jjjjj" , "kkkkk");
        words.stream().filter(word -> word.length() >= 5).peek((e) -> System.out.println("Log " + e)).limit(5).forEach(System.out::println);
    }
}
