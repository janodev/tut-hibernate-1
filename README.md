### Simple CRUD with Hibernate 4

Files:
```
com.test.hibernate.user.User .................. Persistent entity. Just a bean with javax.persistence annotations.
com.test.hibernate.user.UserManager ........... CRUD methods.
com.test.hibernate.user.UserManagerTest ....... Testing for CRUD methods.
com.test.hibernate.user.util.HibernateUtil .... Initializes a static session factory.
```
Configuration:
```
hibernate.cfg.xml         Hibernate with H2
hibernate.cfg.h2.xml      Hibernate with H2 (provided as sample)
hibernate.cfg.hsqldb.xml  Hibernate with HSQLDB (provided as sample)
log4j.xml                 Log4j
log4j2.xml                Log4j2
```
**To build the project** and run the tests type `mvn package`.  
To switch the database rename any of the `Hibernate.cfg.xxx.xml` files to `Hibernate.cfg.xml`.   
Logging is bridged like this: jboss-logging → log4j12 → log4j2 (such is the baroque world of java logging).
