Sesi 20 - Secure Spring Boot - Basic Auth | Unit Testing

*Secure springboot*

spring-boot-starter-security

Spring Security Config
Spring Security Core
Spring Security Web

Basic Auth
Basic Auth Unit Test
Security Basic Auth

Cara membuat implements

pada bagian ProductService, harus public interface
karena di ProductService hanya menjadi interface/memanggil class impl 

buat folder impl
buat file ProductServiceImpl.java

taruh
@Service di atas deklarasi class, lalu tambahkan implements ProductService

public class UserServiceInit implements CommandLineRunner {
https://codeshare.io/bfispring_sesi20
ini basic auth
https://codeshare.io/bfispring_sesi20_junit
ini junit


*Unit Testing*
Unit Testing adalah salah satu level dari proses testing dalam software development.
Unit testing adalah pengujian dasar yang menguji setiap unit atau component baik itu dari segi functional
atau behavior. Sebagai programmer, sudah menjadi suatu kewajiban selain bisa memembuat program, juga
bisa membuat unit testing dari program yang telah di tulis.

Plugin dalam Unit Testing
- JUnit		-> framework java dalam unit testing
- Mockito		-> framework java untuk membuat mock object
- Zalando 		-> yaitu mapper yang berfungsi untuk mengubah file json menjadi object, nantinya akan digunakan untuk membuat unit testing dalam layer controller
- Plugin Apache Commons	-> digunakan untuk menghasilkan data palsu misalkan membuat nama, title,alamat menggunakan class RandomStringUtils (generate random data)


Contoh code testing
testing method FindAll()

	@Test		// 01
	public void testFindAll() {

		final List<Barang> datas = TestObjectFactory.createBarangList(10);	// 02
		Mockito.when(barangRepository.findAll()).thenReturn(datas);			// 03

		final List<Barang> actual = barangService.findAllBarang();			
		MatcherAssert.assertThat(actual.size(), Matchers.equalTo(datas.size()));	// 04
	}


// 01		-> anotasi dalam JUnit untuk melakukan test
// 02		-> membuat mock/data random sebanyak 10
// 03 	-> simulasi bahwa kita seakan-akan memangil data findAll
// 04 	-> pencocokan data yang diinisialisasi dalam object datas dengan object actual dengan menggunakan class MatcherAssert.assertThat(…) 


##### Signature
Made with Heart, Hard Work, Smart Think and Whole Soul <3

Name  : Arrifqi Aziz Ardhiansyah\
Participant Code Java Springboot  : JVSB001ONL009\
Participant Code Katalon : KSAT006ONL009


[LinkedIn](https://www.linkedin.com/in/arrifqiaziz/) | [GitHub](https://github.com/arrifqiaziz)


