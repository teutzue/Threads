
package exercice1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CosticaTeodor
 */
public class MyThread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("The number is: " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    

}
