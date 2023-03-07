# This folder contains code related to CRUD operations


### Two main classes are being used while developing CRUD features

1. `SessionFactory (org.hibernate.SessionFactory)`
	- This reads the Hibernate configuration file (hibernate.cfg.xml)
	- This creates Session (org.hibernate.Session) objects
	- You only have to create them once in your application; they are long-lived objects

2. `Session (org.hibernate.Session)`
	- Wraps a JDBC connection
	- Its main purpose is to save/retrieve objects
	- They are short-lived objects
	- They are created using SessionFactory (org.hibernate.SessionFactory)
	
	
	
## 📌 Study the following classes in this order

1. `BasicsOfCreatingSessions` (Basics of SessionFactory and Session)
2. `CreateStudent` (Adding a student)
3. `PrimaryKeyDemo` (Adding multiple students)
4. `ReadStudent` (Retrieving a student)
5. `UpdateStudent`
6. `DeleteStudent`
