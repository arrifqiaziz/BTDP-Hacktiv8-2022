import java.util.LinkedList;

public class LinkedListLatihan {
    public static void main(String[] args) {
        // membuat Instance/Objek dari LinkedList
        LinkedList<String> buah = new LinkedList<>();

        // menambahkan data pada objek buah
        buah.add("Jeruk");
        buah.add("Jambu");
        buah.add("Apel");
        buah.add("Melon");
        buah.add("Semangka");
        buah.add("Nanas");
        buah.add("Sirsak");

        // mencetak teks
        System.out.println("Nama Buah : " + buah);

        // menghitung jumlah buah/ukuran objek linkedlist
        System.out.println("Jumlah buah : " + buah.size());

        // Menambahkan Element pada Objek LinkedList
        buah.addFirst("Paling Atas");
        buah.addLast("Paling Bawah");

        buah.set(2, "Diubah");
        buah.set(5, "Diubah");

        // menampilkan data
        System.out.println("Nama Buah : " + buah);

        // Mengambil elemen pada LinkedList
        //mengambil data pada urutan teratas
        System.out.println("Data Teratas : " + buah.getFirst());

        //mengambil data pada urutan terbawah
        System.out.println("Data Terbawah : " + buah.getLast());

        //mengambil data pada index 1
        System.out.println("Data pada index 1 : " +buah.get(1));

        //mengambil data pada index 3
        System.out.println("Data pada index 1 : " +buah.get(3));

        //menghapus element pada linkedlist
        buah.removeFirst(); // menghapus data teratas
        buah.removeLast();  // menghapus data terbawah
        buah.remove(1);  // menghapus data pada index 1

        //mencetak data
        System.out.println(buah);

        //cek apakah data kosong atau terisi
        if(buah.isEmpty()){
            System.out.println("Data Kosong");
        } else {
            System.out.println("Data Terisi");
        }

        //cek apakah ada data "jeruk" pada linkedlist
        if(buah.contains("Jeruk")){
            System.out.println("Buah ditemukan");
        } else {
            System.out.println("Buah tidak ditemukan");
        }
    }
}