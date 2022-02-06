import java.util.concurrent.TimeUnit;

public class Stopwatch {
    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();
        TimeUnit TimeUnits = null;
        TimeUnits.SECONDS.sleep(5);
        long endTime = System.currentTimeMillis();

        long timeElapsed = endTime - startTime;

        System.out.println("Execution time in milliseconds : " + " " + timeElapsed);
        System.out.println("Execution time in seconds :" + " " + timeElapsed/60);

    }
}
