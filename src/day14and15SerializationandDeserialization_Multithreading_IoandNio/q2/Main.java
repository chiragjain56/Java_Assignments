package day14and15SerializationandDeserialization_Multithreading_IoandNio.q2;

public class Main {
    public static void main(String[] args) {
        CommonClass c = new CommonClass();
        Thread newThread = new Thread(()->{
            c.setBalance(10000);
        });
        Thread with = new Thread(()->{
            c.withdrawMoney(500);
        });
        newThread.start();
        with.start();

    }
}
