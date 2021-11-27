package MultiThread;

public class ThreadClass {
    public static void main(String[] args) {

        A obj = new A();
        obj.print();

        for(int i = 0 ; i < 10; i++)
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

class A extends Thread{

    public void print()
    {
        for(int i = 0 ; i < 10; i++)
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