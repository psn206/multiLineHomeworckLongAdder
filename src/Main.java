import java.util.concurrent.atomic.LongAdder;

public class Main {

    public static void main(String[] args) {
        LongAdder revenue = new LongAdder();
        Thread shop1 = new Thread(null, new Shop(revenue), "Первый магазин ");
        Thread shop2 = new Thread(null, new Shop(revenue), "Второй магазин ");
        Thread shop3 = new Thread(null, new Shop(revenue), "Третий магазин ");
        shop1.start();
        shop2.start();
        shop3.start();
        try {
            shop1.join();
            shop2.join();
            shop3.join();
            System.out.println( "Общая прибыль " +  revenue.sum() + " тыс.руб" );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
