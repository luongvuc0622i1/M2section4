package StopWatch;

public class Demo {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("Đang đếm thời gian:");
        for (int i = 1; i <= 1000000; i++) {
            stopWatch.stop();
        }
        stopWatch.getElapsedTime();
    }
}
