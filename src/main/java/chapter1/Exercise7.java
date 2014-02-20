package chapter1;

/**
 * Created by relango on 2/16/14.
 */
public class Exercise7 {
    public static void main(String args[]) {
        Runnable r = andThen(() -> System.out.println("Run this first") , () -> System.out.println("Run this second"));
        new Thread(r).run();
    }

    private static Runnable andThen(Runnable first, Runnable second){
        return () -> {
            first.run();
            second.run();
        };
    }
}
