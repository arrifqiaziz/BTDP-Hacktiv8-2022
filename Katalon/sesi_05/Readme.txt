Sesi 05 - Keyword Driven Automation and Custom Keywords

Keyword Driven Automation
Cara untuk mendeksripsikan test case menggunakan keyword

membuat keyword sendiri dengan menambahkan class yang akan digunakan
sebagai method yang dapat dipanggil di test case


Cara Connect MySQL ke Katalon
pastikan MySQL / XAMPP sudah running
copy mysql connector jar dari C > User > (user) > .m2 > repository > MySQL > pilih versi
paste ke Katalon Studio (buat folder baru MySQL Connector)

tambahkan Libraly MySQL di Katalon :
 - Project -> Settings
 - Liblary Management -> Add -> tambahkan mysql-connector-java-(versi) yang tadi di paste
 - apply and close

Set Default DB
 - Project -> Settings
 - Database -> ceklis Secure User and Password -> masukan user password dan Connection URL database
jdbc:mysql://localhost:3306/(nama database)
 - Test Connection (untuk tes db)
 - Apply and close

Buat Data File baru
 - pada File's Indormation diatas buat qury untuk memilih tabel mana yang akan di get
 - select * from user
 - Fecth Data
 - isi tabel akan di get ke katalon

Buat Test Suites baru
 - masukan test case
 - klik Show Data Binding 
 - masukan Data File yang tadi (Test MySQL) ke Test Data
 - pada Variable Binding masukan Test data dan klom yang diinginkan
 - run



forum QA
https://t.me/sqa_id


##### Signature
Made with Heart, Hard Work, Smart Think and Whole Soul <3

Name  : Arrifqi Aziz Ardhiansyah\
Participant Code Java Springboot  : JVSB001ONL009\
Participant Code Katalon : KSAT006ONL009


[LinkedIn](https://www.linkedin.com/in/arrifqiaziz/) | [GitHub](https://github.com/arrifqiaziz)