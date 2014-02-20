package chapter1;

/**
 * Created by relango on 2/17/14.
 */
public class Exercise6 {

    private static interface RunnableEx {
        void run() throws Exception;
    }

    public static Runnable uncheck(RunnableEx runnableEx){
        return () -> {
            try{
            runnableEx.run();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        };
    }

    public static void main(String[] args) {
        new Thread(uncheck(() -> {
            System.out.println("Zzz");
            Thread.sleep(10000);
        })).start();
    }

}
