**

# Reactive programming with Spring WebFlux

In this chapter, I delved into the world of reactive programming and its pivotal role in resource optimization and scalability in today's interconnected systems. I explained how the Reactive Streams initiative, particularly Project Reactor, serves as a flexible foundation for achieving system-wide scalability.

I introduced the concepts of blocking and non-blocking communication, highlighting key engines like Tomcat and Netty. I also showcased how to leverage reactive database access with Spring WebFlux and Project Reactor, using Reactive Relational Database Connectivity (R2DBC) for SQL databases and seamless integration with NoSQL databases like MongoDB through Spring Data and Spring Boot.

Moreover, I explored frontend integration options for reactive types, including a limited migration path using Thymeleaf for applications still using generated view technologies.

To push the boundaries of interprocess communication, I demonstrated the power of RSocket, particularly with Spring Boot's RSocket support and autoconfiguration, unlocking performance, scalability, resilience, and enhanced developer productivity.

### *Note*
planefinder and aircraft-positions are two projects that already exists in my repositories but with synchronous apporach. They are in this repo again as a practice of refactoring a blocking system to a non-blocking one.

**