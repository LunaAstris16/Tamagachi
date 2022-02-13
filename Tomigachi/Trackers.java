package Tomigachi;

import java.util.Timer;
import java.util.TimerTask;

public class Trackers {

    public int period;
    public int delay;
    public int seconds;
    public int max;
    public int min;
    public boolean returnvalue = false;

    public Trackers(int delay, int period, int max, int min) {
        this.delay = delay;
        this.period = period;
        this.max = max;
        this.min = min;
    }

    Timer myTimer = new Timer();
    TimerTask myTask = new TimerTask() {
        int secounds = 0;
        public void run() {
            secounds++;
            System.out.println(seconds);
            if (seconds == 10) {
                System.out.println("found5");
                double randomint = Math.floor(Math.random() * (max - min + 1) + min);
                System.out.println(randomint);
                if (randomint == 1) {
                    returnvalue = true;
                    System.out.println(returnvalue);
                    returnValue();

                } else {
                    System.out.println(returnvalue);
                }
                seconds = 0;
                returnvalue = false;
            }
        }
    };

    public boolean returnValue(){
        return true;
    }

    public void timeInitialization() {
        this.myTimer.scheduleAtFixedRate(myTask, delay, period);
        System.out.println("found4");
    }
}
