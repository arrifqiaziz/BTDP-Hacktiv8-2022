# belajar_springboot_hactive8

## USER MANUAL

### Instalasi Java di Windows
1. download JDK versi 17
    https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html

2. set environment variable\
    2.1 copy path instalasi java bin\
        contoh -> C:\Program Files\Java\jdk1.8.0_333\bin\
    2.2 Edit the system environment variable\
    2.3 click "Environment Variable"\
    2.4 pada bagian "System variables" click Path\
    2.5 click "new" dan masukan path yang sudah di copy di bagian 2.1

3. cek instalasi java\
    buka terminal dan ketik perintah dibawah
    ```
    $ java
    $ java -version
    ```

4. compile file java\
    buka terminal dan masuk ke folder yang ada file dengan ekstensi .java\
    kompilasi file menggunakan keyword "javac" + nama_file.java
    ```
    $ cd C:\Users\095047\Desktop\belajar_springboot_hactive8\sesi_01
    $ javac nama_file.java
    ```
    ekstensi file yang sudah di compile -> .class\
    jika berhasil maka akan muncul file dengan nama "nama_file.class"

5. execute program Java\
    pastikan file sudah di compile dahulu (No.4). jika sudah, buka terminal dan ketik perintah\ "java nama_file_yang_sudah_dicompile":
    ```
    $ java nama_file
    ```
    jika berhasil maka akan muncul file dengan nama "nama_file.class"