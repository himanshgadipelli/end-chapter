package com.impatient.four.one;

/**
 * Created by bobby on 1/29/2017.
 */
public class ConcurrentWorker extends Worker {
    public void work(){
        Thread t = new Thread(super::work);
        t.start();
    }
}
