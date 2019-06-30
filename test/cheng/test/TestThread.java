package cheng.test;

import java.util.concurrent.TimeUnit;

/**
 * Desc:
 * Author: 光灿
 * Date: 2019/6/30
 */
public class TestThread implements Runnable {
    @Override
    public void run() {
        try {
            TimeUnit.HOURS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new TestThread());
        thread.setDaemon(false);
        thread.start();
    }

}
