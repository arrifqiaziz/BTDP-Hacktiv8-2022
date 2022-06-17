Array
Array adalah sebuah variabel yang bisa menyimpan banyak data dalam 1 variabel dan menggunakan indeks
untuk mengakses data.
Deklarasi array	-> int[] contoh;
			   contoh = new int[4];
			   String[][] makanan; (array multidimensi)


Struktur Data Binary Tree

    * Terdapat aturan bahwa setiap child node sebelah kiri selalu lebih kecil nilainya dari pada root node
    * Dengan bahasa sederhana, yang kiri akan lebih kecil dan yang kanan akan lebih besar


Contoh data diinputkan bilangan : 7 1 0 3 2 9 10 8 6 4
Root 7
             7
         1       9
      0    3    8 10
         2  5
           4 6

Penulusuran Data (Transversal) pada BST
    * PreOrder  -> Dimulai dari root, lalu ke ke node kiri terlebih dahulu, baru di print
        hasil output : 7, 1, 0, 3, 2, 5, 4, 6, 9, 8, 10
    * InOrder   -> Dimulai dari simpul paling kiri berakhir di simpul paling kanan
        hasil output : 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    * PostOrder -> Dimulai dari simpul paling kiri, berakhir di root
        hasil output : 0, 2, 4, 6, 5, 3, 1, 8, 10, 9, 7
    

    5 3 9 2 4 7 11

            5
        3       9
      2   4   7   11
