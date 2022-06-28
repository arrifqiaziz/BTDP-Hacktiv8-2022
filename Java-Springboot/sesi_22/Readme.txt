Sesi 22 - Code Coverage and Deployment | Jacoco and Sonarqube

- Codecoverage adalah sebuah tools yang mengukur efektivitas dari unit testing, dan untuk menunjukan seberapa lengkap code yang telah ditulis yang sesuai dengan process business yang telah dicover oleh unit test.
- Dengan coverage kita bisa mengetahui berapa persen kode yang telah di testing dan yang belum, dan untuk mendapatkan hasil yang PASS atau berhasil minimal semua code yang tercover minimal 90%.
- Jacoco dan SonarQube akan melakukan generate result dari codecoverage yang telah kita buat pada unit testing.


Kebutuhan APP: download JDK11, Snorcube
 Install JDK
 Extract Snorcube -> taruh di C-> buka cmd -> C:\Sonarqube\bin\windows-x86-64 -> StartSonar.bat

Tambahkan semua dependency dan plugin di project https://codeshare.io/bfispring_sesi22
mvn clean
mvn install
cek folder coverage-reports yang berisi jacoco-unit.exec. di IDE jika muncul maka sudah terintall

C:\Sonarqube\conf -> sonar properties
hilangkan tanda # pada -> sonar.web.context=
ganti port menjadi 9191

buka Sonar Dasboard di browser localhost:9000 atau 9191
login dg username dan password admin, ganti password jadi admin123

di dashboard
Administration -> Security -> Force user authentication -> Disable

administration > security > disable Force user authentication

masuk ke terminal -> ke direktory
mvn sonar:sonar


//C:\Sonarqube\conf 0> wrapper.conf -> copas path java 11

untuk menghindari error. dibuat variable
List dataProduct = productrepository.findall()
return dataproduct;
try { }catch(exception e){ }






##### Signature
Made with Heart, Hard Work, Smart Think and Whole Soul <3

Name  : Arrifqi Aziz Ardhiansyah\
Participant Code Java Springboot  : JVSB001ONL009\
Participant Code Katalon : KSAT006ONL009


[LinkedIn](https://www.linkedin.com/in/arrifqiaziz/) | [GitHub](https://github.com/arrifqiaziz)