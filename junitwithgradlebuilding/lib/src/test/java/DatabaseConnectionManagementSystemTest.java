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


