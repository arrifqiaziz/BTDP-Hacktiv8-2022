https://docs.google.com/presentation/d/1NbezAv0g-P9hvVCUl4W81RAvAbGzSmNnEaW6FYbaMFM/edit#slide=id.ge7b226dabd_0_386

OpenAPI 
- standar spesifikasi untuk membuat dokumentasi RESTful API.
- OpenAPI dibuat agar pengguna RESTful API tidak perlu mengakses kode aplikasi 
  dan membaca dokumen manual (misal dalam bentuk doc, pdf) 


-----------------------------------------------------------------

DEMO OPEN API -> https://editor.swagger.io/

OpenAPI Document
{
	"openapi": "3.0.3",
	"info": {},
	"servers": [],
	"paths": {}
}

1. info         : informasi metadata API, author, lisensi, dll

2. server       : url, deskripsi, dll

3. exteral docs

4. path         : api endpoint

5. operation    : dokumentasi operation pada rest api
  - bisa 1/lebih operation, karena dalam HTTP satu url bisa punya banyak method (GET, POST, PUT)
  - parameter
     - bisa memiliki lebih dari 1 parameter
     - bisa menambahkan parameter pada operation
     - query parameter, path variable, header, coookie, etc.

    5.1 atribut
        - schema
          - tipe data untuk parameter
          - menggunakan JSON schema untuk identifikasi struktur data
             - string, boolean, array, object, etc.
          - json schema validation
             - memberitahu validasi yang diperlukan ketika pengguna membaca OpenAPI kita
             - ex: nullable=false, maxLength=100
    5.2 rerquest body
        - schema, etc
    5.3 response body
	  - format response body
	  - 200, 300, 500
    5.4 tag
	  - grouping beberapa path menjadi grup
    5.5 component
	  - menyimpan object yang bisa digunakan ulang
        - Misal, saat nanti kita membuat spek untuk Request Body atau Response Body, 
          dibanding kita buat satu persatu, jika ada beberapa yang sama, 
          lebih baik kita buat dalam Component, sehingga bisa digunakan 
          di beberapa Endpoint API
    5.6 reference
	  - bisa membuat reference ke data component yang kita buat
	  - hal ini lebih baik daripada membaut komponen berkali-kali
    5.7 security
	  - mekanisme Security apa yang kita gunakan di RESTful API kita
 	  - oauth, openid, etc.

CODE GENERATOR
- generate docs berdasarkan bahasa pemrograman