package chapter1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by relango on 2/16/14.
 */
public class Exercise8 {
    public static void main(String args[]) {
        String[] names = {"Peter", "Paul", "Mary"};
        List<Runnable> runners = new ArrayList<>();
        for (String name : names) {
            runners.add(() -> System.out.println(name));
        }
        runners.forEach((runnable)-> runnable.run());//Works as expected

        List<Runnable> runners2 = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            //Doesn't work as i need to be final to be able to used inside lamda, then it can't be incremented
            //runners2.add(() -> System.out.println(names[i]));
        }

    }

}
