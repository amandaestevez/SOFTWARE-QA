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

**- @BeforeAll:** It signals a method to run just once before all test cases within a test class are executed.

```java
    @BeforeAll
    static void setupConnection() {
        DatabaseConnectionManagementSystem.startConnection();
    }

```

**- @BeforeEach:** It tells the testing framework to run a specific method before each test case in a class.

```java
    @BeforeEach
    void insertTestData(){
        DatabaseConnectionManagementSystem.insertUserData(new Pessoa("John", LocalDateTime.of(2000,1,1,13,0,53)));
    }
```
**- @AfterEach:** This annotation tells the framework to run a specific method after each test case execution.

```java
    @AfterEach
    void removeTestData(){
        DatabaseConnectionManagementSystem.removeUserData(new Pessoa("John", LocalDateTime.of(2000,1,1,13,0,53)));
    }
```

**- @Test:** annotation in JUnit marks a method as a test case to be executed during the testing process.

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

**- @AfterAll:** It signifies a method to be executed after all test cases within a test class have finished running.

```java
    @AfterAll
    static void endConnection(){
        DatabaseConnectionManagementSystem.endConnection();
    }
}
```

If the test ran correctly, you should see something like this in your debug console:
![image](https://github.com/amandaestevez/SOFTWARE-QA/assets/123298275/26aa2420-9a76-4a9f-b1cc-f99fabea6bdc)

**Summarizing:**
This test class establishes a database connection before any tests are run. It then inserts sample data (a person named John) before each test and removes it afterward. Finally, it closes the connection after all tests are complete. The current test cases themselves require further development to interact with the database functionalities, but the overall structure for unit testing is in place.

## Mockito

Mockito is an open-source framework in Java that lets you create mock objects for unit testing, making your tests more isolated and easier to maintain.

**Disclaimer:**

This code snippet below showcases a unit test class designed to evaluate the functionality of the _ServicoEnvioEmail_ class. This test verifies if the service sets the email format correctly before sending it. Let's delve into the code and explore its components.

**Essential Imports:**

The initial lines import the necessary classes from `email.system.simulation` (containing the email sending logic) and testing libraries from JUnit and Mockito.

```java
package email.system.testing;

import email.system.simulation.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
```

The code resides in the `email.system.testing` package.


**- @ExtendWith:** This annotation tells `JUnit` to use the `Mockito` library for creating mock objects during the test.

```java
@ExtendWith(MockitoExtension.class)
public class ServicoEnvioEmailTeste {
```

**- @Mock:** This annotation creates a mock object of the `PlataformaDeEnvio` class. Mocks simulate real objects but allow controlled behavior for testing purposes.

```java
  @Mock
  private PlataformaDeEnvio plataforma;
```

**- @InjectMocks:** This injects the mock `plataforma` object (created with `@Mock`) into the `servico` field. Now `servico`  can interact with the mock platform.

```java
  @InjectMocks
  private ServicoEnvioEmail servico;
```

**- @Captor:** This captures an argument passed to a method during a test. Here, it captures the `Email` object passed to the `enviaEmail` method

```java
  @Captor
  private ArgumentCaptor<Email> emailCaptor;
```

**- @Test:** This annotation marks the following method (`validaSeEmailEstaComDadosCorretos`) as a test case to be executed by JUnit.

Inside the test method:
- Email address, message, and expected format variables are set up.
- The test calls `servico.enviaEmail` to simulate sending an email.
- `Mockito.verify(plataforma).enviaEmail(emailCaptor.capture());:` This line uses Mockito to verify if the enviaEmail method was called on the mock plataforma with the email captured by `emailCaptor`.
- `Assertions.assertEquals(Formato.HTML, emailCapturado.getFormato());:` This asserts (checks) if the captured email object (`emailCapturado`) has its format set to `Formato.HTML`. This verifies the service sets the format correctly.

```java
  @Test
  void validaSeEmailEstaComDadosCorretos() {

    String email = "random@test.com";
    String mensagem = "Hey there!";

    // Simulates sending the email
    servico.enviaEmail(email, mensagem, true);

    // Mockito verifies interaction with the mock
    Mockito.verify(plataforma).enviaEmail(emailCaptor.capture());

    // Asserts the email format
    Email emailCapturado = emailCaptor.getValue();
    Assertions.assertEquals(Formato.HTML, emailCapturado.getFormato());
  }
```

If the test ran correctly, you should see something like this:
  <img width="958" alt="test with mockito" src="https://github.com/amandaestevez/SOFTWARE-QA/assets/123298275/4a88b069-d750-4dba-bc52-38664924e8d3">

**Summarizing:** By leveraging Mockito, this unit test isolates the email-sending service, verifying the email formatting behavior before transmission. This ensures the service adheres to email format specifications, contributing to the overall robustness of the codebase.

## Conclusion

Unit testing serves as a cornerstone for building reliable software. By systematically dissecting code into smaller, testable units, developers can identify and squash bugs early in the development process. 
