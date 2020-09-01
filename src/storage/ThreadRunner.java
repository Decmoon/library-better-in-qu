package storage;

import storage.function.Executor;

/**
 * @author decmoon
 */
public class ThreadRunner {

    private ThreadRunner() {
    }

    public static void run(Executor executor, String threadName) {
        new Thread(() -> {
            executor.exe();
        }, threadName).start();
    }
}
