Model :mempresentasikan data dan logika bisnis, biasanya berhubungan dengan basis data.
View: menampilkan data atau mengatur tampilan ke pengguna
Controller: menghubungkan antara view dengan model


----------------------------------------------


Servlet
- penghubung client dan server
- servlet container berada di dalam web server

Servlet Controller 
- manajemen alur aplikasi
- konfigurasi -> .xml

Alur kerja servlet
- client -> http req -> servlet container -> server -> response (HTML)

siklus hidup servlet
1. inisialisasi
2. service() menunggu req, response
3. destroy() matikan servlet container


---------------------------------------


javaBean -> konstruktor tanpa argumen (default) (POJO)

---------------------------------------


Kelebihan JSP (Java Server Page)
1. Portable karena dibuat dengan teknologi java 
2. Manajemen memory 
3. Memiliki akses ke API Java yang lengkap seperti JDBC dan Java Mail 
4. Dapat menggunakan komponen yang portable dan reusable (JavaBean) 
5. Memiliki kinerja tinggi terhadap banyak request atau proses sekaligus dalam waktu  yang sama 
6. Mudah dalam deployment dan maintenance

Keuntungan memakai JSP
1.Memisahkan presentasi static dan isi yang dinamik 
2.Menekankan komponen reusable 
3.Memudahkan pembuatan aplikasi dengan tag 
4.Berbasis pemrograman bahasa java 
5.Bagian dari platform Java 6.Terintegrasi dalam J2EE


------------------------------------------


Spring boot
- Spring merupakan framework Java yang mempermudah para programmer dalam membuat sebuah aplikasi Java
  dengan menerapkan salah satunya adalah design-patern : dependency-injection.

- Group Id -> nama organisasi / projek group
- Artifact -> nama projek
- Dependencies -> module yang dibutuhkan

- Source packages -> lokasi code, pembuatan controller, service, repositor, dll disini
- Test packages -> unit test
- Other source -> file-file html, css, js, img
- application.properties -> konfigurasi aplikasi
- webapp/WEB-INF/ -> tempat file html
