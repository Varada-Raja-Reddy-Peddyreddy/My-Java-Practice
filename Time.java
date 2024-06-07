import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
public class Time {
    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            public void run(){
                System.out.println("Task is complete :)");
            }
        };
        // timer.schedule(task, 30000);

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR,2024);
        date.set(Calendar.MONTH,Calendar.JUNE);
        date.set(Calendar.DAY_OF_MONTH,7);
        date.set(Calendar.HOUR_OF_DAY,16);
        date.set(Calendar.MINUTE,41);
        date.set(Calendar.SECOND,0);
        date.set(Calendar.MILLISECOND,0);

        timer.schedule(task, date.getTime());
    }
}
