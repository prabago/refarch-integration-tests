# Hybrid Integration Tests
This project is part of the 'IBM Integration Reference Architecture' suite, available at [https://github.com/ibm-cloud-architecture/refarch-integration](https://github.com/ibm-cloud-architecture/refarch-integration)

This is a test project, mostly junit based to validate the different components of the hybrid architecture.

## Test organization
The DB2 server validation uses JPA entity manager to connect to the remote database server using the persistence.xml configuration in src/main/resources

The test cases are under src/test/java.

The code in src/main/java are defined Item JPA entity and persistence manager. For connection to the DAL web service a wsimport was executed to create proxy java classes under inventory/ws.

The DAL wb service tests are under src/text/java package ws.

## Execute tests
The project uses gradle so the following will execute all the tests
```
./gradlew build
```

## Code explanation
