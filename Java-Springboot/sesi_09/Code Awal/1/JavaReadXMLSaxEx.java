package Test;
import java.util.List;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class JavaReadXMLSaxEx {
    public static void main(String[] args) {
        MyRunner runner = new MyRunner();
        List<User> lines = runner.parseUsers();

        lines.forEach(System.out::println);
    }
}
