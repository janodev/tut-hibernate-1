
This is a simple hibernate project featuring CRUD on one entity.

com.test.hibernate.user.User .................. Persistent entity. Just a bean with javax.persistence annotations.
com.test.hibernate.user.UserManager ........... CRUD methods.
com.test.hibernate.user.UserManagerTest ....... Testing for CRUD methods.
com.test.hibernate.user.util.HibernateUtil .... Initializes a static session factory.

hibernate.cfg.h2.xml      Hibernate configuration with H2.
hibernate.cfg.hsqldb.xml  Hibernate configuration with HSQLDB.
hibernate.cfg.xml         Hibernate configuration.
log4j.xml                 Log4j configuration.
log4j2.xml                Log4j2 configuration.


MAVEN GOALS

mvn test
mvn package
mvn dependency:sources
mvn dependency:resolve -Dclassifier=javadoc
mvn javadoc:javadoc
mvn eclipse:eclipse
mvn idea:idea

mvn site fails due to Maven errors.