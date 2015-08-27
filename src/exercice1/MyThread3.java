package exercice1;

import static java.lang.Thread.sleep;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CosticaTeodor
 */
public class MyThread3 extends Thread {

    public static final int TEN_SECONDS = 10000;
    public volatile boolean running = true;

    @Override
    public void run() {

        for (int i = 10; running; i++) {
            
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread3.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("The number is: " + i);
        }

    }
    
    public void stopThread(){
        running = false;
    }
}
