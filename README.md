# Job_Finding_Platform
#overview
     The Job Finding Portal is a web-based application designed to connect job seekers with employers. It enables users to create accounts, upload resumes, search for jobs, and apply online. Companies can post job listings, manage applications, and shortlist candidates. The project follows a microservices architecture and is developed using Spring Boot with Maven in Eclipse.

#key technologies used

  * Backend Framework: Spring Boot
  * Build Tool: Maven
  * IDE: Eclipse
  * Microservices: API Gateway, Eureka Server, Config Server, Job Service
  * Security: Spring Security + JWT
  * Database: MySQL
  * JPA: Hibernate (Spring Data JPA)
  * REST Communication: Feign Clients / REST APIs
  * Mailing: Spring Boot Starter Mail
  * Service Registry: Netflix Eureka
  * API Gateway: Spring Cloud Gateway
  * Configuration: Spring Cloud Config Server
  * Packaging: JAR (Maven)

#Microservices in the Project

  *Eureka Server
      Registers all services and enables communication between them.

  *Config Server
      Provides centralized configuration for all services.

  *API Gateway
      Acts as a single entry point for all client requests (routing/security).

  *Job Service
      Handles job postings, applications, and candidate profiles.

  Uses Spring Security + JWT for user login & signup.


  #Why Eclipse?

     *Simple project import from Maven
     *Built-in support for Spring Boot
     *Easy to run and debug services
     *Plugin support for version control and build management
