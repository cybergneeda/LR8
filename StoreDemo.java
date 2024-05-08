public class StoreDemo {
public static void main(String[] args) {
    System.out.print("\033[H\033[2J");
    Store store = new Store();
    int numberOfIterations = 20;

    Thread thread1 = new Thread(()->{
        for (int i = 0; i < numberOfIterations; i++) {
            store.put();
        }});

    Thread thread2 = new Thread(()->{
        for (int i = 0; i < numberOfIterations; i++) {      
            store.get();
    }});

    thread1.start();
    thread2.start();

    try{
        thread1.join();
        thread2.join();
    } catch(InterruptedException e)
    {
    throw new RuntimeException(e);
}}}