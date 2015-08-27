
package exercice1;

/**
 *
 * @author CosticaTeodor
 */
public class MyThread1 implements Runnable {
    
    long sum = 0;
        
    @Override
    public void run(){
        for (int i = 0; i < 1000000000; i++) {
            sum+=i;
        }
        System.out.println("The sum is: " + sum);
    }
}
