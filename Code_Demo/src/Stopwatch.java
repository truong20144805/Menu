import java.util.Calendar;

public class Stopwatch {
    private long starTime;
    private  long endTime;


    public void star(){
        this.starTime = System.currentTimeMillis();
    }
    public  void  end(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        long elapsed;
        elapsed = (this.endTime -this.starTime);
        return elapsed;
    }

    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        
    }
}

