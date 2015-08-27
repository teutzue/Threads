/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice1;

/**
 *
 * @author CosticaTeodor
 */
public class Exercice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        Thread t1 = new Thread(new MyThread1());
        t1.start();
        Thread thread = new Thread(new MyThread2());
        thread.start();
        MyThread3 t3 = new MyThread3();
        t3.start();
        
        Thread.sleep(10000);
        t3.stopThread();
        t1.join();
        thread.join();
        t3.join();
        
        
    }
    
}
