package Restoran;

public class Makanan extends Restoran{
    public static void main(String[] args) {
        
        // Membuat instance/objek dari class restoran
        Restoran data = new Restoran();

        // Membuat data pada Variabel
        data.setMenu("Ayam Goreng");
        data.setHarga(17000);
        data.setSpesial(true);

        // Memanggil Method Get dari class restoran dan menampilkannya
        System.out.println("Menu makanan : " + data.getMenu());
        System.out.println("Harga makanan : " + data.getHarga());
        System.out.println("Menu spesial : " + data.getSpesial());
    }
}
