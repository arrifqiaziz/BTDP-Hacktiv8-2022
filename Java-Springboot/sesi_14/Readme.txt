Sesi 14 - Servlet | Indoduction Spring Boot

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

dependency
Spring Boot DevTools
Spring Data JPA
MySQL Driver
Spring WEB
menambahkan dependency
<dependency>
		    <groupId>com.zaxxer</groupId>
		    <artifactId>HikariCP</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
			<exclusions>
				<exclusion>
				 	<groupId>org.junit.vintage</groupId>
				 	<artifactId>junit-vintage-engine</artifactId>
				 </exclusion>
			</exclusions>
		</dependency>

menambahkan di application.properties
#MySQL Connection
spring.datasource.url=jdbc:mysql://localhost:3306/h8_book?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=lupaLagi
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

#HikariCP
spring.datasource.hikari.connection-timeout=20000
spring.datasource.hikari.minimum-idle=5
spring.datasource.hikari.maximum-pool-size=12
spring.datasource.hikari.idle-timeout=300000
spring.datasource.hikari.max-lifetime=12000
spring.datasource.hikari.auto-commit=true
	
#JPA Properties
spring.jpa.database-platform=org.hibernate.dialect.MySQL5Dialect
spring.jpa.hibernate.ddl-auto=update

cek database, username dan password nya juga


##### Signature
Made with Heart, Hard Work, Smart Think and Whole Soul <3

Name  : Arrifqi Aziz Ardhiansyah\
Participant Code Java Springboot  : JVSB001ONL009\
Participant Code Katalon : KSAT006ONL009


[LinkedIn](https://www.linkedin.com/in/arrifqiaziz/) | [GitHub](https://github.com/arrifqiaziz)