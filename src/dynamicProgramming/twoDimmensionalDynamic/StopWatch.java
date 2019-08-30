package dynamicProgramming.twoDimmensionalDynamic;

public class StopWatch {

    private static long startTime = 0;
    public static void start(){
        startTime = System.nanoTime();
    }

    public static long stop(){
        return System.nanoTime() - startTime;
    }
}
