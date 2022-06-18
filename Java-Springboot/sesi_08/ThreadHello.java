import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadHello {

    private final String name;

    public ThreadHello(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " : Hello");
        try {
            Thread.slepp(250);
        } catch (InterruptedException ex) {
            // TODO: handle exception
            Logger.getLogger(ThreadHello.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void testRun() {
        for (int i = 0; i < 5; i++) {
            ThreadHello instance = new ThreadHello(String.valueOf(i));
            Thread t = new Thread(instance);
            t.start();
            ;
        }
    }
}
