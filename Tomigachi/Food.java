package Tomigachi;
public class Food {
    public static void main() {
        System.out.println("found1");
        int delay = 1000;
        int period = 1000;
        int max = 2;
        int min = 1;
        boolean tracker = false;
        System.out.println("found2");
        Trackers foodTimer = new Trackers(delay, period, max, min);
        while(true){
            foodTimer.timeInitialization();
            tracker = foodTimer.returnValue();
            System.out.println(tracker);
            if(tracker == true){
                System.out.println("found3");
            }
        }

    }
}
