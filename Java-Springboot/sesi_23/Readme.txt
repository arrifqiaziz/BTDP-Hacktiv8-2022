Sesi 23 - Final Project

Requirement
1. Signup
2. Login (JWT)
3. List all avaible stop
4. Search trip between any two stop
5. Filter Search with date option
6. Book a ticket trip schedule

Jumlah Tabel	: 8
Database Schema


tb_role
id
role
> 1, admin | 2, user

tb_user
id			long
email			varchar
password		
firstName		varchar
lastName		varchar
mobileNumber	varchar

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(	name = "user_roles", 
	joinColumns =   @JoinColumn(name = "user_id"),
	inverseJoinColumns = @JoinColumn(name = "role_id"))

private Set<Role> roles = new HashSet<>();
roles			> fk from _id.role



tb_agency
id			
code		
name
details

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "owner_user_id")
owner			> fk from _id.user

	@OneToMany(mapped.by = "agency", CascadeType.ALL)
private Set<Bus> bus = new HashSet<>();



tb_bus
id
code
capacity
make
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "agency_id")
agency


tb_trip
id
fare
journeyTime

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "source_stop_id")
sourceStop

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "dest_stop_id")
destStop

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "bus_id")
bus

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "agency_id")
agency


tb_trip_schedule
id
tripDate
avaibleSeats

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "trip_id")
tripDetail

	@OneToMany(mapped.by = "trip_schedule", CascadeType.ALL)
ticketSold



tb_ticket
id
seatNumber
cancellable
journeyDate

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
passanger

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "trip_schedule_id")
tripSchedule




##### Signature
Made with Heart, Hard Work, Smart Think and Whole Soul <3

Name  : Arrifqi Aziz Ardhiansyah\
Participant Code Java Springboot  : JVSB001ONL009\
Participant Code Katalon : KSAT006ONL009


[LinkedIn](https://www.linkedin.com/in/arrifqiaziz/) | [GitHub](https://github.com/arrifqiaziz)