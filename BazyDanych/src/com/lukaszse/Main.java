package com.lukaszse;

import java.sql.*;

public class Main {

    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:D:\\02_PROGRAMOWANIE\\JAVA\\BazyDanych\\" + DB_NAME;

    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLLUMN_NAME = "name";
    public static final String COLLUMN_PHONE = "phone";
    public static final String COLLUMN_EMAIL = "email";

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(CONNECTION_STRING);
             Statement statement = conn.createStatement()) {

            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);

            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                                " (" +  COLLUMN_NAME + " text, " +
                                        COLLUMN_PHONE + " integer, " +
                                        COLLUMN_EMAIL + " text)");

            statement.execute("INSERT INTO " + TABLE_CONTACTS + " VALUES ('tim', 234422, 'tim@tim.com')");
            statement.execute("INSERT INTO " + TABLE_CONTACTS + " VALUES ('john', 23492324, 'johnny@tim.com')");
            statement.execute("INSERT INTO " + TABLE_CONTACTS + " VALUES ('bill', 11224, 'billy@tim.com')");
            statement.execute("INSERT INTO " + TABLE_CONTACTS + " VALUES ('garry', 2342424324, 'garry@tim.com')");

            insertContact(statement, "lucas", 609573141, "llseremak@gmail.com");

            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " + COLLUMN_PHONE + "=999" + " WHERE " + COLLUMN_NAME + "='bill'" );
            statement.execute("DELETE FROM " + TABLE_CONTACTS + " WHERE " + COLLUMN_NAME + "='garry'" );


//            statement.execute("SELECT * FROM contacts");
//            ResultSet result = statement.getResultSet();

            ResultSet result = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS);

            while (result.next()){
                System.out.println(result.getString(COLLUMN_NAME) + " | " +
                                    result.getString(COLLUMN_PHONE) + " | " +
                                    result.getString(COLLUMN_EMAIL) + " | ");
            }


        } catch (SQLException e){
            System.out.println("Something went wrong" + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS + " VALUES ('" + name + "', " + phone + ", '" + email + "')");
    }
}
