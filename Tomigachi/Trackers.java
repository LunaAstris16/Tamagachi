package Tomigachi;

import java.util.Timer;
import java.util.TimerTask;

public class Trackers {

    public int period;
    public int delay;
    public int seconds;
    public int max;
    public int min;

    public Trackers(int delay, int period, int max, int min) {
        this.delay = delay;
        this.period = period;
        this.max = max;
        this.min = min;
    }

    Timer myTimer = new Timer();
    TimerTask myTask = new TimerTask() {
        public void run() {
            this.seconds++;
            System.out.println(seconds);
            if (seconds == 10) {
                double randomint = Math.floor(Math.random() * (max - min + 1) + min);
                seconds = 0;
            }
        }
    };

    public boolean returnValue(){
        while (true) {
            if (seconds == 10) {
                System.out.println("found 6");
                return true;
            }
            return false;
        }
    }

    public void timeInitialization() {
        this.myTimer.scheduleAtFixedRate(myTask, delay, period);
        System.out.println("found4");
    }
}
