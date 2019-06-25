package examples;

class SomeThread extends Thread {
    
    public void run() {
        for(int i = 0; i < 10; i++ )
            System.out.println("Number - " + i);
    }
}

public class Examples {

    public static void main(String[] args) {
        SomeThread test = new SomeThread();
        test.start();
        //test.run();
        
        SomeThread test1 = new SomeThread();
        test1.start();
        //test1.run();
        
        Thread t1 = new Thread(new Runnable () {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++ )
                    System.out.println("Number - " + i);
            }
            
        });
        
        t1.start();
    }
    
}