# Catch Errors With Unit Tests

## JUnit 
JUnit is an open-source Java framework for unit testing. By incorporating JUnit into their workflow, Java programmers can write small, targeted tests that ensure each piece of code functions as intended, ultimately leading to more robust and stable applications.


**Disclaimer:**

This code snippet below showcases a unit test class designed to evaluate the functionality of the _DatabaseConnectionManagementSystem_ class. Let's delve into the code and explore its components.

**Essential Imports:**

The initial lines import the necessary libraries and classes for the testing process:

```java
import org.example.DatabaseConnectionManagementSystem;
import org.example.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

```

The next line defines a public test class named DatabaseConnectionManagementSystemTest, which serves as a container for the unit tests assessing the database connection management system.

```java
public class DatabaseConnectionManagementSystemTest {

```

**Test Method Annotations**
JUnit annotations streamline the testing process. Here's a breakdown of the annotations used in this code:

- @BeforeAll: It signals a method to run just once before all test cases within a test class are executed.

```java
    @BeforeAll
    static void setupConnection() {
        DatabaseConnectionManagementSystem.startConnection();
    }

```

- @BeforeEach: It tells the testing framework to run a specific method before each test case in a class.

```java
    @BeforeEach
    void insertTestData(){
        DatabaseConnectionManagementSystem.insertUserData(new Pessoa("John", LocalDateTime.of(2000,1,1,13,0,53)));
    }
```
- @AfterEach: This annotation tells the framework to run a specific method after each test case execution.

```java
    @AfterEach
    void removeTestData(){
        DatabaseConnectionManagementSystem.removeUserData(new Pessoa("John", LocalDateTime.of(2000,1,1,13,0,53)));
    }
```

- @Test: annotation in JUnit marks a method as a test case to be executed during the testing process.

```java
    @Test
    void validateReturnData(){
        Assertions.assertTrue(true);
    }

    @Test
    void validateNullData(){
        Assertions.assertNull(null);
    }
```

- @AfterAll: It signifies a method to be executed after all test cases within a test class have finished running.

```java
    @AfterAll
    static void endConnection(){
        DatabaseConnectionManagementSystem.endConnection();
    }
}
```

**Summarizing:**
This test class establishes a database connection before any tests are run. It then inserts sample data (a person named John) before each test and removes it afterward. Finally, it closes the connection after all tests are complete. The current test cases themselves require further development to interact with the database functionalities, but the overall structure for unit testing is in place.

## Mockito

Mockito is an open-source framework in Java that lets you create mock objects for unit testing, making your tests more isolated and easier to maintain.

