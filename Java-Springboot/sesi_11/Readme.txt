Sesi 11

NoSQL - Mongo DB

Pada SQL database seperti MySQL, sebuah database adalah gabungan dari satu atau banyak tabel.
Sedangkan pada MongoDB, sebuah database adalah gabungan dari satu atau banyak collection.

*Instalasi*
https://www.mongodb.com/try/download/community?tck=docs_server

*JSON vs BSON*
JSON adalah singkatan dari JavaScript Object Notation, JSON menjadi salah satu format data yang paling banyak
digunakan untuk transfer data antara browser dan server.
Pada dasarnya JSON hanya sebuah text yang memiliki format/syntax sebagai berikut:
	{
	"key" : "value"
	}
BSON adalah singkatan dari Binary JSON, BSON memiliki beberapa keunggulan dibandingkan dengan
JSON diantaranya tingkat parsing yang lebih cepat dan mendukung lebih banyak tipe data native seperti :
dates dan binary data.

*Syntax*
Buka terminal dan eksekusi perintah berikut:
	mongo
Membuat database
	use DATABASE_NAME
Untuk melihat database
	show dbs

Membuat Collection
	db.createCollection("NAME_COLLECTON")

Menambahkan data
	db.collection.insertOne()	->	untuk menambahkan document tunggal/single
	db.collection.insertMany()	->	untuk menambahkan banyak document

Read
	db.collection.find()

Update
	db.collection.updateOne(filter, update)	->	ubah satu document
	db.collection.updateMany(filter, update)	->	ubah banyak document sekaligus sesuai filter
	db.collection.replaceOne(filter, update)	->	ganti satu document dengan document yang baru

Delete
	db.collection.deleteOne(filter)	->	hapus satu document
	db.collection.deleteMany(filter)	->	hapus banyak document sekaligus sesuai filter



*RELASI*
One to One
One to Many
Many to Many

*LOOK UP*
Lookup adalah sebuah metode yang digunakan untuk menampilkan data seperti find tetapi di lookup ini kita
dapat menampilkan beberapa tabel untuk di tampilkan (lookup ini bisa berjalan kalau tabelnya sudah
berrelasi)
Contohnya :
	db.collection.aggregate({ $lookup : { from : collection2, localField : “_id”, foreignField : “_id”, as : “join” } })
Keterangan :
  Aggregate : untuk mengkelompokan data
  Lookup : untuk mengabungkan data
  From : diisi tabel ke 2 yang akan di tampilkan
  localField : diisi dengan nama data yang ada di tabel pertama (data ini harus data yang nanti sama dengan data yang ada di tabel ke 2)
  foreignField : sama dengan localField tetapi untuk foreignField diisi dengan nama data yang ada di tabel kedua
  as : as atau alias dapat diisi bebas karena disini jika nanti data kita mau di tampilkan kita cukup memanggil nama yang sudah di aliaskan saja.


Keterangan :
createCollection : untuk membuat tabel
validator : untuk membuat validasi pada json
$jsonSchema : untuk masuk ke dalam fungsi json
bsonType : tipe data
required : data apa saja yang pada saat di tambahkan datanya itu harus diisi
properties : peraturan – peraturan yang akan dibuat untuk validasi data tersebut
items : untuk data bertipe array


*QUERY*
use barang_nama-masing-masing

db.createCollection("barang",{
validator : {
$jsonSchema : {
|
}
}
}

$jsonSchema : {
bsonType : “object”,
Required : [“namabarang”, “hargabarang”, “jenisbarang”, “description”]
}

namaBarang : {
bsonType : “string”,
Description : “Nama Barang harus berupa karakter dan tidak boleh kosong!”
},
hargaBarang : {
bsonType : “number”,
Description : “Harga Barang harus berupa number dan tidak boleh kosong!”
},
jenisBarang : {
bsonType : “objectId”,
Description : “Jenis Barang harus berupa objectID dan tidak boleh kosong!”
},
description : {
bsonType : “array”,
Description : “Deskripsi harus berupa karakter dan tidak boleh kosong!”
},

description : {
bsonType : “array”,
Description : “Deskripsi harus berupa karakter dan tidak boleh kosong!”,
Items : {
Merk : {
bsonType : “string”,
description : “Ukuran harus berupa karakter dan tidak boleh kosong!”
}
ukuran : {
bsonType : “string”,
description : “Ukuran harus berupa karakter dan tidak boleh kosong!”
}
stok : {
bsonType :”number”,
description : “Stok harus berupa angka dan tidak boleh kosong!”
}
}
},

description : {
bsonType : “array”,
description : “Deskripsi harus berupa karakter dan tidak boleh kosong!”,
items : {
bsonType : “object”,
required : [“merk”,”ukuran”,”stok”],
Properties : [
Merk : {
bsonType : “string”,
description : “Ukuran harus berupa karakter dan tidak boleh kosong!”
},
)

Keterangan :
createCollection : untuk membuat tabel
validator : untuk membuat validasi pada json
$jsonSchema : untuk masuk ke dalam fungsi json
bsonType : tipe data
required : data apa saja yang pada saat di tambahkan datanya itu harus diisi
properties : peraturan – peraturan yang akan dibuat untuk validasi data tersebut
items : untuk data bertipe array
Terakhir coba di jalankan.