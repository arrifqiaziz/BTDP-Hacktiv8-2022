package sesi_01;

public class StatementAndExpressions {
	public static void main (String args[]) {
		System.out.println("Hello world");
		System.out.println("Hello Hacktiv8");

        var x = 3;
        var y = 8;
        var z = x + y;
        System.out.println(z);

        if (true) System.out.println("True");
        
        for (int i=0; i<10; i++) {
            System.out.println("Perulangan ke " + i);
        }
	}
}
