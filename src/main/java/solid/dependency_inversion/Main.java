package solid.dependency_inversion;

interface DBConnection {
    public int connect();
}

class MySqlConnection implements DBConnection {

    @Override
    public int connect() {
        return 1;
    }
}

class PasswordReminder {
    // PasswordReminder - High-Level and MySqlConnection Low-Level
    // This code violates DIP, because PasswordReminder depends on MySqlConnection
    // If MySqlConnection will change then we need to change PasswordReminder + OCP (closed for modification)
    // We need Abstraction!
//    private int dbConnection;
//    public PasswordReminder(MySqlConnection dbConnection) {
//        this.dbConnection = dbConnection;
//    }

    private DBConnection dbConnection;

    public PasswordReminder(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }
}

public class Main {

}





