Sesi 9 - Parsing XML Data SAX and DOM

*XML*
  - eXtensible Markup Language digunakan untuk menyimpan dan mengantarkan data
  - XML parsing adalah parsing yang dirancang untuk membaca XML dan menciptakan cara bagi program untuk menggunakan XML

Teknik Parsing Data di Java : 
1. SAX (Simple Api XML) -> menggunakan library yang ada di java SAXPerse
2. DOM (Document Object Model)

*DOM*
  - DOM dikenal dengan Document Object Model, yang merupakan bagian dari Java API untuk XML Processing
  - DOM Parser pada Java melintasi file XML dan membuat objek DOM yang sesuai
  - Lalu Objek DOM ini dihubungkan kedalam struktur tree sehingga Parser membaca seluruh struktur XML ke dalam memori

Step pembuatan DOM
  - Kita butuh import package DOM Parser pada aplikasi java kita.
  - Buat DocumentBuilder
  - Buat Dokumen Objek dari File XML
  - Validasi Struktur Dokumen
  - Extract Root Element
  - Examines Attribute
  - Examine Sub-Elements
  - Baca XML dengan DOM Parser

pembuatan nya sama seperti sesi sebelumnya

bikin
DemoSAX - com.learning.sax
DemoDOM - com.learning.dom
DemoChallange - com.learning.challange
folder Alexa


<build>
    <plugins>
        <plugin>
            <groupId>org.codehaus.mojo</groupId>
            <artifactId>exec-maven-plugin</artifactId>
            <version>1.6.0</version>
            <configuration>
                <mainClass>com.learning.sax.JavaReadXmlSaxEx</mainClass>
            </configuration>
        </plugin>
    </plugins>
  </build>

mvn exec:java -Dexec.mainClass="com.learning.sax.JavaReadXMLSaxEx"

mvn exec:java -Dexec.mainClass="com.learning.sax.ParseKnownXMLStructure"

mvn exec:java -Dexec.mainClass="com.ParsingXmlSax.module.Mail"

mvn exec:java -q




##### Signature
Made with Heart, Hard Work, Smart Think and Whole Soul <3

Name  : Arrifqi Aziz Ardhiansyah\
Participant Code Java Springboot  : JVSB001ONL009\
Participant Code Katalon : KSAT006ONL009


[LinkedIn](https://www.linkedin.com/in/arrifqiaziz/) | [GitHub](https://github.com/arrifqiaziz)