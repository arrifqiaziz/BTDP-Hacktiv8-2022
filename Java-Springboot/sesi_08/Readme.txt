Multithreading - Synchronized Java

Multithreading adalah Konsep untuk dapat menjalankan task atau tugas lebih dari satu secara paralel, 
sehingga dengan konsep ini task yang banyak akan cepat selesai karena tidak saling tunggu 
untuk menyelesaikan task. Untuk menciptakan Thread di Java dapat dilakukan dengan dua cara, 
yaitu mengimplement interface Runnable dan meng-extends class Thread.


**Konfigurasi Maven**

*CREATE PROJECT*
Membuat project dengan cara buka terminal di direktori yang diinginkan
lalu ketik
mvn archetype:generate -DgroupId=com.learning.thread -DartifactId=DemoThread -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

archetype	: 
groupId	: 
artifactId	: nama project
interactiveMode	: 

klik kanan di Maven kiri bawah
Clean
Compile
Install
Test

*CONFIG POM.XML*
Menginstall plugin maven
Copas kode berikut ke pom.xml

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

tambahkan import juint test
import org.junit.Test;

Klik kanan di project
build path
configure build path
library
classpath
add liblary
junit
junit 4


Export VSC ke Eclipse
mvn eclipse:eclipse

di eclipse
File
Import
General
Existing Projects into Workspace
pilih direktory tadi



Jika POM Error
Install New Software (di Eclipse)
https://download.eclipse.org/tm4e/snapshots/


