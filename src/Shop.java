import java.util.Random;
import java.util.concurrent.atomic.LongAdder;

public class Shop implements Runnable {
    private LongAdder revenue;
    final private int  PURCHASES  = 100;

    public Shop(LongAdder revenue) {
        this.revenue = revenue;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < PURCHASES; i++) {
            this.revenue.add(random.nextInt(10));
        }


    }
}


