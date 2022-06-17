public class Nilai {
    int num1;
    int num2;

    Nilai(){
        this(0,0);
    }

    Nilai(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void cetakNilai(String str) {
        System.out.println(str + num1 + ", " + num2);
    }

    Nilai center(Nilai other) {
        return new Nilai((num1 + other.num1) / 2, (num2 + other.num2));
    }

    public static void main(String[] args) {
        Nilai n = new Nilai(10, 10);
        n.cetakNilai("Cetak Nilai ");
        n.center(new Nilai(7,5)).cetakNilai("Nilai ");
    }
}
