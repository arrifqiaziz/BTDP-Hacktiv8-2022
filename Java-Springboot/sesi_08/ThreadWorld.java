public class ThreadWorld {

    @Override
    public void run() {
        System.out.println(getName() + " : World");
        try {
            Thread.slepp(250);
        } catch (Exception e) {
            //TODO: handle exception
            Logger.getLogger(ThreadHello.class.getName()).log(Level.SEVERE, null, ex);          
        }
    }
}
