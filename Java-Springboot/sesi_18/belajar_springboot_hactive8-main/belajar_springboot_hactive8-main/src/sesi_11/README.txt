MongoDB -> BSON (binary json)
advantages -> parsing lbh cepat, mendukung tipe data native: dates, binary data

-----------------------------

use database_name -> membuat database
show dbs -> database list
show collections -> list of collections
db.createCollection("profile"); -> membuat collection

-----------------------------

db.collection.insertOne(); -> tambah 1 dokumen
db.profile.insertOne({ name : "t-rex", color: "red" });
- otomatis dibuat ID

-----------------------------

db.collection.insertMany(); -> tambah banyak dokumen
db.profile.insertMany(
	[
		{ name:"tricera" },
		{ name:"brachio" }
	]
)

-----------------------------

db.collection.find() -> menampilkan semua data
db.profile.find()  

-----------------------------

db.collection.find({condition}); -> mencari data dengan filter
db.profile.find({ name: "t-rex" });

-----------------------------

// I think you are using Mongoose and updateOne() 
// is not available there. You cannot use all native mongodb functions 
// with all drivers.

db.collection.updateOne(filter, update)
db.profile.upadateOne({ color: "red" },{ $set: { name : "allo" } })

alternative >> db.profile.update({ color: "red" },{ $set: { name : "allo" } })

-----------------------------

db.profile.insertMany(
	[
		{ name:"tricera" },
		{ name:"brachio" }
	]
)

----------------------------

db.collection.updateMany(filter, update) -> update multiple
db.profile.updateMany({name: "t-rex"}, {$set:{color: "blue"}})

// upsert combination of insert and delete
db.profile.updateMany({name: "t-rex"}, {$set:{color: "blue"}}, {upsert: true})

-----------------------------

db.collection.replaceOne(filter, update)

-----------------------------

db.collection.deleteOne(filter)
db.profile.deleteOne({ name : "brachio" });

// jika banyak dokumen dengan nama yang sama,
// maka salah satu dokumen akan didelete secara random/urut
db.profile.deleteOne({ name : "t-rex" });

-----------------------------


db.collection.deleteMany(filter)


--------------ONE TO ONE-----------------


db.pasien.deleteMany({ name : "Foxy" })
db.penyakit.deleteMany({ penyakit : "flu" })

db.penyakit.insertOne({ _id: "sakit_0001", penyakit: "flu" });

// penyakit: "flu" -> (nama koleksi, reference value)


db.pasien.insertOne({ name : "Foxy", umur: 20, penyakit: "flu" });
var penyakit_flu = db.pasien.findOne().penyakit
db.penyakit.findOne({ penyakit : penyakit_id })

db.pasien.insertOne({ name : "Foxy", umur: 20, penyakit: "sakit_0001" });
var penyakit_id = db.pasien.findOne().penyakit
db.penyakit.findOne({ penyakit : penyakit_id })


-----------------ONE TO MANY-------------------


use transaksi_chandra
db.createCollection("pelanggan");
db.createCollection("transaksi"); 

// 1 pelanggan mempunyai banyak transaksi
db.pelanggan.insertOne({ _id : "PL0001", nama_pelanggan: "chandra" });

db.transaksi.insertMany(
	[
		{ _id : "TR0001", 
		  tanggal_transaksi : new Date(),  
          	  total_harga : 100000,
		  id_pelanggan : "PL0001"  
		},
		{ _id : "TR0002", 
		  tanggal_transaksi : new Date(),  
          	  total_harga : 199999,
		  id_pelanggan : "PL0001"  
		},
		{ _id : "TR0003", 
		  tanggal_transaksi : new Date(),  
          	  total_harga : 200000,
		  id_pelanggan : "PL0001"  
		}
	]
)

db.transaksi.find().pretty()
db.transaksi.findOne({ total_harga : 199999 })



-----------------MANY TO MANY-------------------



db.createCollection("detailtransaksi");
db.detailtransaksi.insertMany(
	[
		{no_trans : "TR0001", barang : "Gelas", jumlah : 3},
		{no_trans : "TR0001", barang : "Piring", jumlah : 6},
		{no_trans : "TR0001", barang : "Sendok", jumlah : 9}
	]
)

db.transaksi.aggregate({ $lookup : 
	{ 
		from : "detail_transaksi", 
		localField : "_id", 
		foreignField : "_id", 
		as : "detail" 
	} 
}) 


db.transaksi.aggregate([
	{ $lookup : 
		{ from : "detail_transaksi", 
		  localField : "_id", 
              foreignField : "no_trans", 
		  as : "detail"
		} 
	}, 
	{ $lookup : 
		{ from : "pelanggan", 
		  localField : "id_pelanggan", 
		  foreignField : "_id", 
		  as : "customer" 
		} 
	} 
])



---------------------VALIDASI--------------------


validasi -> pengecekan data yang dimasukkan

use barang_chandra
db.createCollection("barang", {
	validator : {
		$jsonSchema : {
			bsonType : "object",
			required : ["namabarang", "hargabarang", "jenisbarang", "description"],
			properties : {
				namaBarang : {
					bsonType : "string",
					description : "Nama Barang harus berupa karakter dan tidak boleh kosong!"
				},
				hargaBarang : {
					bsonType : "number", 
					description : "Harga Barang harus berupa number dan tidak boleh kosong!"
				},
				jenisBarang : {
					bsonType : "objectId", 
					description : "Jenis Barang harus berupa objectID dan tidak boleh kosong!"
				},
				description : {
					bsonType : "array",
					description : "Deskripsi harus berupa karakter dan tidak boleh kosong!",
					items : {
						bsonType : "object",
						required : ["merk", "ukuran", "stok"],
						properties: {
							merk : { bsonType : "string", 
					   	         	   description : "Ukuran harus berupa karakter dan tidak boleh kosong!"
							}, 
							ukuran : { bsonType : "string",
					                       description : "Ukuran harus berupa karakter dan tidak boleh kosong!"
							},
				            	stok : { bsonType : "number", 
				                           description : "Stok harus berupa angka dan tidak boleh kosong!"
				            	}
						}
			            }
	                   }
			}
		}
	}
})
