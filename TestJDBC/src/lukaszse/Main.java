package lukaszse;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\02_PROGRAMOWANIE\\JAVA\\TestJDBC\\testjava5.db");
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts (name TEXT, phone INTEGER, email TEXT)");

//            statement.execute("INSERT INTO contacts (name, phone, email) VALUES ('Jan', 43434, 'jan@o2.pl')");
//            statement.execute("INSERT INTO contacts (name, phone, email) VALUES ('Stefan', 33434, 'stefan@gmail.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email) VALUES ('Alicja', 997, 'alice@gmail.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email) VALUES ('Zygfryd', 112, 'zigi@gmail.com')");

//            statement.execute("SELECT * FROM contacts");
//            ResultSet results = statement.getResultSet();

//            ResultSet results = statement.executeQuery("SELECT * FROM contacts");

//            while(results.next()){
//                System.out.print(results.getString("name")+ ",\t");
//                System.out.print(results.getInt("phone")+ ",\t");
//                System.out.print(results.getString("email")+"\n");
//            }
//
//
//            statement.close();
//            conn.close();

        } catch (SQLException e){
            System.out.println("something went wrong: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
