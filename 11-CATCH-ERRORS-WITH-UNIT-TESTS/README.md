# Perform Unit Tests With JUnit and Mockito

## JUnit 
JUnit is an open-source Java framework for unit testing. By incorporating JUnit into their workflow, Java programmers can write small, targeted tests that ensure each piece of code functions as intended, ultimately leading to more robust and stable applications.


**Disclaimer**
This code snippet below showcases a unit test class designed to evaluate the functionality of the _DatabaseConnectionManagementSystem_ class. Let's delve into the code and explore its components.

**Essential Imports:**

The initial lines import necessary libraries and classes for the testing process:
```java
import org.example.DatabaseConnectionManagementSystem;
import org.example.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class DatabaseConnectionManagementSystemTest {

    @BeforeAll
    static void setupConnection() {
        DatabaseConnectionManagementSystem.startConnection();
    }

    @BeforeEach
    void insertTestData(){
        DatabaseConnectionManagementSystem.insertUserData(new Pessoa("John", LocalDateTime.of(2000,1,1,13,0,53)));
    }

    @AfterEach
    void removeTestData(){
        DatabaseConnectionManagementSystem.removeUserData(new Pessoa("John", LocalDateTime.of(2000,1,1,13,0,53)));
    }

    @Test
    void validateReturnData(){
        Assertions.assertTrue(true);
    }

    @Test
    void validateNullData(){
        Assertions.assertNull(null);
    }

    @AfterAll
    static void endConnection(){
        DatabaseConnectionManagementSystem.endConnection();
    }
}
```
