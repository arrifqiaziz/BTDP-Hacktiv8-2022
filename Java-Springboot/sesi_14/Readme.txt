Sesi 14

Servlet & Springboot

MVC
Model - View - Controller

 Model :mempresentasikan data dan logika bisnis, biasanya berhubungan dengan basis data.
 View: menampilkan data atau mengatur tampilan ke pengguna
 Controller: menghubungkan antara view dengan mode

Aplikasi Model 2 umumnya memiliki :
  - Servlet Controller yang menyediakan akses tunggal terhadap keseluruhan aplikasi. Controller ini bertanggung jawab menyediakan manajemen terpusat terhadap alur aplikasi dan juga service lain
seperti penanganan security dan user management.
  - Controller servlet umumnya menggunakan konfigurasi XML untuk menentukan alur aplikasi dan
pemrosesan perintah. Hal itu juga membuat helper components terasosiasikan dengan user action dan
dibuat/dipanggil untuk menangani actions yang terjadi, memanggil komponen Model sebagaimana
diperlukan. Hal ini berfungsi untuk memisahkan antara controller servlet dari model.

