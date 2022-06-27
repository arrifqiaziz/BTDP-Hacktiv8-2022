JPA (Java Persistece API)
- @Entity -> merepresentasikan sebuah tabel
- @Id -> ID / Primary key
- @GeneratedValue -> mekanisme pemberian nilai
- @Column(nullable = false) -> menandakan sebuah kolom, dan tidak boleh diisi dengan null value


-------------------------------------------------


Application.properties

#Database
spring.datasource.url
- alamat database

spring.datasource.username
- database username

spring.datasource.password
- database password

spring.datasource.driver-class-name
- nama database driver


#HikariCP
spring.datasource.hikari.connection-timeout
- adalah nilai maksimum dalam hitungan mili detik yang dibutuhkan client 
  menunggu untuk sebuah connection dari connection pool.

spring.datasource.hikari.minimum-idle
- jumlah koneksi idle

spring.datasource.hikari.maximum-pool-size
- jumlah maksimum dari ukuran connection pool

spring.datasource.hikari.idle-timeout
- jumlah maksimum dalam hitungan mili detik yang mengijinkan koneksi 
  berada dalam status idle dalam connection pool 

spring.datasource.hikari.max-lifetime
-  adalah maksimum waktu hidup (life time) dalam hitungan mili detik dari 
   sebuah koneksi dalam connection pool setelah keluar. 

spring.datasource.hikari.auto-commit=true
- auto commit
	


#JPA Properties
spring.jpa.database-platform
- dialek yang digunakan jpa

spring.jpa.hibernate.ddl-auto=update
- property ini bertugas untuk membuatkan table-tabel didatabase 
  tergantung dari value nya. Disini kita menggunakan value update 
  yang artinya Spring Data JPA akan secara otomatis membuatkan 
  table Book di database.

JPARepository
- JPARepository menyediakan fungsi untuk 
  create, retrieve, update, delete, findAll dan lain-lain sehingga kita 
  tidak perlu lagi untuk membuat fungsi-fungsi CRUD dari awal.
- penggunaan didalam repository
- ex: public interface BookRepository extends JPARepository<Book, Long>



----------------------ONE TO MANY----------------------


BookCategory.java
@OneToMany(
	mappedBy = "bookCategory",
	cascade = CascadeType.ALL 
)
private List<Book> books;


Book.java
@ManyToOne
@JoinColumn
private BookCategory bookCategory;



---------------------MANY TO MANY----------------------


@ManyToMany(
	fetch = FetchType.LAZY,
	cascade = CascadeType.MERGE
)
@JoinTable(
	name = "students_courses",
	joinColumns = {
		@JoinColumn(name = "student_id", referencedColumnName = "id", nullable=false, updatable=false)
	},
	inverseJoinColumns = {
		@JoinColumn(name = "course_id", referencedColumnName = "id", nullable=false, updatable=false)
	}
)
private Set<Course> courses = new HashSet<>();


@ManyToMany(
	mappedBy = "courses",
	fetch = FetchType.LAZY
)
private Set<Student> students = new HashSet<>();



-----------------------------------------------
@Autowired
- dependency injection
- injek dependensi ke bean

FetchType.LAZY 
- konfigurasi yang tidak secara otomatis memuat data yang 
  berada pada relasi nya sehingga untuk memuat harus menggunakan 
  getter method. 

CascadeType.PERSIST 
- operasi save() dari Spring Data JPA cascade ke entitas yang berelasi.

@JoinTable 
- anotasi yang akan membuat sebuah table baru dengan nama students_courses sesuai pada gambar ERD diatas. 

@JoinColumn 
- menghubungkan antara foreign_key dengan table referensi nya.
 