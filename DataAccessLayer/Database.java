package DataAccessLayer;

import java.sql.*;
public class Database {
    String connectionUrl =
    "jdbc:sqlserver://yourserver.database.windows.net:1433;"
            + "database=AdventureWorks;"
            + "user=yourusername@yourserver;"
            + "password=yourpassword;"
            + "encrypt=true;"
            + "trustServerCertificate=false;"
            + "loginTimeout=30;";

}
