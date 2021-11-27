package Class_Prectice;

public class ThreadMony extends Thread{


    public void run() {

        System.out.println("Fame On track ");

    }

    public void hello() {

        System.out.println("Fame On track  2 ");

    }


    public static void main(String[] args) {
         ThreadMony  t1 = new ThreadMony();
        t1.start();

    }
}
