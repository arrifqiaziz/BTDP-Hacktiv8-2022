Sesi 04
Data Driven Test (DDT)

Buat project baru DDT Login CURA
https://katalon-demo-cura.herokuapp.com/

Buat file .xls (Excel)	-> sebagai data test source
username	password
John Doe	ThisIsNotAPassword
Maria		Satiwa
Kipli		Komarudin

Buat Test Case
Login DDT
 - open browser
 - buka form login
 - isi username
 - isi password
 - klik login
 - verify_login
 - close browser
field username dan password, value nya jadikan variable

Buat Data File
DDT Login
add file .xls
akan generate kolom dan isi nya
kolom username dan password

Buat Test Suite
DDT Test Suite
tambahkan test case Login DDT
sebelah kanan, select data binding option
masukan Test Data Login DDT
msukan Variable binding dibawah nya, set username dan password sesuai dgn di .xls

di bagian atas ada Exceution Information
retry failed immadietly ganti jadi 1 (agar ketika gagal tidak mengulang test, sehingga lebih cepat)

Running


##### Signature
Made with Heart, Hard Work, Smart Think and Whole Soul <3

Name  : Arrifqi Aziz Ardhiansyah\
Participant Code Java Springboot  : JVSB001ONL009\
Participant Code Katalon : KSAT006ONL009


[LinkedIn](https://www.linkedin.com/in/arrifqiaziz/) | [GitHub](https://github.com/arrifqiaziz)