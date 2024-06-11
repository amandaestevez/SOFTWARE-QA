package org.example;

import java.util.logging.Logger;

public class DatabaseConnectionManagementSystem {

    private static final Logger LOGGER = Logger.getLogger(DatabaseConnectionManagementSystem.class.getName());

    public static void startConnection(){
        LOGGER.info("Connection started.");
    }

    public static void endConnection(){
        LOGGER.info("Connection ended.");
    }
    public static void insertUserData(Pessoa pessoa){
        LOGGER.info("Inserted user data.");
    }

    public static void removeUserData(Pessoa pessoa){
        LOGGER.info("Removed user data.");
    }
}
