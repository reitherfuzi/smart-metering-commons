package at.pwimmer.metering.interfaces;

public interface Taskable extends Runnable {
    void shutdown();
    boolean isRunning();
}
