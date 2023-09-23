
public class IncrementingThread extends Thread{
    private Counter counter;

    public void run(){
        System.out.println("Current thread: " + Thread.currentThread().getName());
        counter.increment();
        counter.getCount();
    }

    public IncrementingThread(Counter counter){
        this.counter = counter;
    }

    public static void main(String[] args){
        Counter c = new Counter();
        IncrementingThread t1 = new IncrementingThread(c);
        IncrementingThread t2 = new IncrementingThread(c);
        t1.start();
        t2.start();

    }
}



class Counter {

    private int count = 0;
    public void increment(){
        count+=100;
    }

    public void getCount(){
        System.out.println("count: " + count);
    }

}
