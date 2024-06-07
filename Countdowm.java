import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Countdowm {
    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            int counter =10;
            public void run(){
                if (counter>0){
                    System.out.println(counter+"secounds");
                    counter--;
                }
                else{
                    System.out.println("HAPPY NEW YEAR!!");
                    timer.cancel();
                }
            }
            
        };
        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR,2025);
        date.set(Calendar.MONTH,Calendar.DECEMBER);
        date.set(Calendar.DAY_OF_MONTH,31);
        date.set(Calendar.HOUR_OF_DAY,23);
        date.set(Calendar.MINUTE,59);
        date.set(Calendar.SECOND,50);
        date.set(Calendar.MILLISECOND,0);

        timer.scheduleAtFixedRate(task, date.getTime(), 1000);
    }
    
}
