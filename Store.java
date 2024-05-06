public class Store {
    private int amount=5;
    
public synchronized void get()
{
    while (amount<=0) {
        try
        {
            wait();
        } catch(InterruptedException e)
        {
            throw new RuntimeException(e);
        }}
        amount-=1;
        printStatus();
        notify();
}

public synchronized void put()
{
    while (amount>=10) {
        try
        {
            wait();
        } catch(InterruptedException e)
        {
            throw new RuntimeException(e);
        }}
        amount+=1;
        printStatus();
        notify();
}

private void printStatus()
{
    System.out.println("Число товаров на складе: "+amount);
}}