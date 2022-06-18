Multithreading - Synchronized Java

Multithreading adalah Konsep untuk dapat menjalankan task atau tugas lebih dari satu secara paralel, 
	sehingga dengan konsep ini task yang banyak akan cepat selesai karena tidak saling tunggu 
	untuk menyelesaikan task. Untuk menciptakan Thread di Java dapat dilakukan dengan dua cara, 
	yaitu mengimplement interface Runnable dan meng-extends class Thread.

Contoh penggunaan method synchronized misalkan ketika mengakses resource secara bersama-sama, hal
	ini akan sangat berbahaya ketika thread tidak bisa dikontrol. Misalkan ada tugas untuk menulis ke sebuah
	file yang sama, proses ini thread harus dipastikan selesai terlebih dahulu kemudian bisa dilanjutkan thread
	yang lain untuk menulis juga.


**Konfigurasi Maven**

*CREATE PROJECT*
Membuat project dengan cara buka terminal di direktori yang diinginkan
lalu ketik
mvn archetype:generate -DgroupId=com.learning.thread -DartifactId=BelajarThread -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

artifactId	-> nama project

*Syntax*
  mvn clean
  mvn compile
  mvn install
  mvn test

*CONFIG POM.XML*
  Menginstall plugin maven
  Copas kode berikut ke pom.xml

	--taruh di paling bawah--

    <properties>
      <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
      <maven.compiler.source>1.8</maven.compiler.source>
      <maven.compiler.target>1.8</maven.compiler.target>
    </properties>

    <build>
      <plugins>
        <plugin>
          <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-jar-plugin</artifactId>
            <version>2.3.2</version>
            <configuration>
              <archive>
                <manifest>
                  <mainClass>com.learning.thread.App</mainClass>
                 </manifest>
              </archive>
            </configuration>
          </plugin>
      </plugins>
    </build>

	--taruh di dependencies--
    <dependency>
      <groupId>org.hamcrest</groupId>
      <artifactId>hamcrest-core</artifactId>
      <version>1.3</version>
      <scope>test</scope>
    </dependency>


Tambahkan import juint test di file test
	import org.junit.Test;

Export VSC ke Eclipse
mvn eclipse:eclipse

File -> Import -> General -> Existing Projects into Workspace -> pilih direktory project

Menambahkan junit manual:

Klik kanan di project -> build path -> configure build path
pilih tab library -> classpath
di bagian kanan -> add liblary -> junit -> junit 4

Jika POM Error
Install New Software (di Eclipse)
https://download.eclipse.org/tm4e/snapshots/


