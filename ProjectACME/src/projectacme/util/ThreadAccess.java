package projectacme.util;

import projectacme.model.AccessLog;

import java.util.ArrayList;
import java.util.List;

public class ThreadAccess extends Thread{
    private List<AccessLog> results;
    private boolean running = true;


    public ThreadAccess() {
        this.results = new ArrayList<>();
    }

    @Override
    public void run() {
        while (running) {
            try {
                System.out.println("Processing results: " + System.currentTimeMillis());
                // TODO: Implement processing logic
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("ThreadAccess was interrupted.");
                running = false;
            }
        }
    }
    public void stopThread() {
        running = false;
        this.interrupt();
    }

    public static void main(String[] args) {
        ThreadAccess threadAccess = new ThreadAccess();
        threadAccess.start();
    }
}
