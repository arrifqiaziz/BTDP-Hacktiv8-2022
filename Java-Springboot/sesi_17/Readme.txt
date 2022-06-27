Sesi 17 - RestAPI

https://codeshare.io/bfispring_sesi17
cek codeshare

Latihan 1
Spring Version 2.7.0
Java 17
dependency -> Spring Boot DevTools, Spring Web, Spring Data JPA, MySQL Driver

BelajarApiController > buat class
@RestController
@RequestMapping(value = "/belajar-api/v1")
public class BelajarApiController {
	
	@GetMapping(value = "/get")
	public String belajarApi() {
		return "Mari Belajar API Java Spring Boot";
	}
}


Springboot - Restful Web Services/REST Template 

API adalah singkatan dari Application Programming Interface. API sendiri merupakan interface yang dapat menghubungkan satu aplikasi dengan aplikasi lainnya.

REST API
REST merupakan singkatan dari Representational State Transfer. Secara singkat REST adalah cara kita untuk menggunakan resource (fungsi/method) yang ada di sebuah server dengan mengakses url yang telah disediakan.

Cara mengaksesnya tentu dengan menggunakan HTTP (Hyper Text Transfer Protocol) dengan method (http
verb) yang umum digunakan yaitu:
● GET, untuk membaca resource (data).
● POST, untuk membuat resource baru (data baru).
● DELETE, tentu untuk menghapus resource (data).
● PUT, untuk merubah resource (data).

##### Signature
Made with Heart, Hard Work, Smart Think and Whole Soul <3

Name  : Arrifqi Aziz Ardhiansyah\
Participant Code Java Springboot  : JVSB001ONL009\
Participant Code Katalon : KSAT006ONL009


[LinkedIn](https://www.linkedin.com/in/arrifqiaziz/) | [GitHub](https://github.com/arrifqiaziz)


