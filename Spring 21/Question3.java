public class Question3 {
    public static void main(String[] args){
        Thread[] threads = new Thread[1000]; 
        IntWrapper intWrapper = new IntWrapper();
        for (int i = 0; i < threads.length; i++){
            threads[i] = new Thread(intWrapper);
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++){
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(intWrapper.sum);

    }
}

class IntWrapper implements Runnable{
    int sum;
    /*
     * you can write also int sum = 0 as both expressions result in the same result
     * because primitive data fields are initialized to 0
     */

    @Override
    public void run() {
        Increment();
    }

    private synchronized void Increment() {
        this.sum++;
    }
}
