public class relationalPenugasan {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int c = 2;
        int d = 1;
        int e = 1;

        if (a==2){          //jika a==2 maka..
            a = 10;         // a menjadi 10
            b += 1;         // b ditambah 1
            c -= 1;         // c dikurang 1
            d /= 2;         // d dibagi 2
            e %= 1;         // dapat hasil bagi antara e dan 1
        }

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
    }
}
