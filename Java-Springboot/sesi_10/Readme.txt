Sesi 10
DATABASE

Database -> Basis Data
Komponen utama penyusun suatu app yang terdiri dari sekumpulan data atau informasi yang tersimpan secara sistematis

Relational Database
Pada relational database, data disimpan dalam sebuah skema yang ditampilkan seperti tabel (terdiri dari baris dan kolom).
Setiap data pada relational database diidentifikasi menggunakan key atau primary key.
Untuk memanipulasi data pada relational database digunakan sebuah bahasa yang disebut dengan Structured Query
Language (SQL), oleh karena itu Relational Database juga disebut dengan SQL database.
Contoh Relational Database:
● MySQL
● MariaDB
● PostgreSQL
● SQL Server
● Oracle

Non-relational Database
Non-relational database merupakan alternatif untuk relational database yang sering digunakan untuk
menyimpan data dengan struktur yang tidak beraturan.
Non-relational database juga biasa disebut dengan NoSQL database.
Ada beberapa tipe non-relational database:
● Document Stores, data disimpan dalam bentuk JSON document. Contoh: MongoDB, Couchbase
● Key-value Stores, data disimpan dalam bentuk pasangan key-value. Contoh: Redis, Amazon DynamoDB
● Wide Column Stores, data disimpan dalam sebuah record yang bisa memiliki ribuan bahkan jutaan kolom.
Contoh: Cassandra
● Graph Database, data disimpan dalam bentuk data struktur Graph. Contoh: Neo4j


*Catatan Kelas*
1. create database h8_siakad / db_siakad / bfi_siakad
2. create tabel tb_mahasiswa / mahasiswa
3. create field (sesuaikan strtuktur tabel)
	> tabel mahasiswa
		id > pk (primary key), type data int  (11)/bigint (21), auto increment (yang di db inisialisasi primary key nya ID)
		nim (nomor induk mahasiswa) type data string (255) / 50 / 100 (Unik) 
		email (Unik)
		nama mahasiswa type data String (100)
		jenis kelamin > string/varchar 50 / 2 > value data (P,L) > Perempuan/Laki-Laki (tidak dikecualikan)
					enum (P,L) / Perempuan/Laki-Laki > jika diisi "yang lainnya" > ini idak bisa (sudah di kecualikan)
					int (2) > 0,1 > coment 0=laki-laki, 1=perempuan
4. insert record / insert data mahasiswa


yang ini auto
insert into tb_mahasiswa(nim, email, nama_mahasiswa, jenkel) values("123","arif@gmail.com","Arif","Laki-Laki");

yang ini di definisikan berdasarkan last id . contoh 5 yang terakhir > (di dalam record/data)
insert into tb_mahasiswa(id, nim, email, nama_mahasiswa, jenkel) values(6, "123","arif@gmail.com","Arif","Laki-Laki");

/lebih simpel
insert into tb_mahasiswa values("123","arif@gmail.com","Arif","Laki-Laki");

