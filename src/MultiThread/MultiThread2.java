package MultiThread;

public class MultiThread2 {
    public static void main(String[] args) {
        A2 t = new A2();
        t.start();

        for(int i = 0 ; i < 5; i++)
        {
            System.out.println(11);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
class A2 extends Thread{

    @Override
    public void run()
    {
        for(int i = 0 ; i < 5; i++)
        {
            System.out.println(1);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}