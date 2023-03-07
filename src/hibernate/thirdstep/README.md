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