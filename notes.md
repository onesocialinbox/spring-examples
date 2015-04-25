
1. New Maven Project

2. Add following dependencies to pom.xml

spring-core 4.1.6.RELEASE
spring-batch-core 3.0.3.RELEASE
spring-batch-infrastructure 3.0.3.RELEASE
spring-jdbc 4.1.6.RELEASE
h2 1.4.185
spring-context 4.1.6.RELEASE

3. Maven Update Project
4. Create following Spring bean configuration under src/main/resources

 - spring-batch-core.xml (beans 4.0.xsd and batch 3.0.xsd, p )
 - spring-batch-database.xml (beans 4.0.xsd and jdbc 4.1.xsd)
 - spring-batch-job.xml (beans 4.0.xsd and batch 3.0.xsd)
 
4.a) In spring-batch-database.xml add following bean definitions
 - dataSource (DriverManagerDataSource), transactionManager (DataSourceTransactionManager)
 - jdbc-initialize script with h2 drop and create sql.

4.b) In spring-batch-core.xml add following bean definitions
 - jobRepository (JobRepositoryFactoryBean), jobLauncer (SimpleJobLauncher), taskExecutor (SimpleAsyncTaskExecutor)

4.c) In spring-batch-job.xml add batch job details

5. Create a Application.java with main method for launching batch job. 