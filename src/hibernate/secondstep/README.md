# This folder contains the basics of annotating using Hibernate (no CRUD here)

### Step-by-step process


- Add the Hibernate configuration file (`hibernate.cfg.xml`) in your `src` folder. This file is known as a DTD. Its standard is available in `https://hibernate.org/dtd/` <br><br>

- Annotate the Java classes using the `@Entity`, `@Table`, `@Id` and `@Column` annotations.<br>
    1. Map Java classes to DB tables using the `@Entity`, `@Table` annotations.<br>
    2. Map Java class fields to DB columns using the `@Id` and `@Column` annotations.
<br><br>
- Develop Java code to perform database operations. (this is explained in the `src/hibernate/thirdstep`)