# spring data jpa
Spring data jpa came into picture to simplify the db layer and
reducing the bolier plate code 


#Datasource properties
spring.datasource.url=jdbc:oracle:thin:@localhost:1521/orcl
spring.datasource.username=c##scott
spring.datasource.password=tiger
spring.datasource.driver-class-name=oracle.jdbc.driver.OracleDriver

#below property is used to generate the schema in db, suppose if the table is not avilable it will create the table also
spring.jpa.hibernate.ddl-auto=update

