package Tomigachi;
public class Sleep {
    public static void main() {
        int delay = 10000;
        int period = 1000;
        int max = 2;
        int min = 1;
        Trackers sleepTimer = new Trackers(delay, period, max, min);
        sleepTimer.timeInitialization();
    }
}
