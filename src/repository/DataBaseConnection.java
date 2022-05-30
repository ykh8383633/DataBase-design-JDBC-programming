package repository;

import entity.Department;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DataBaseConnection {
    DepartmentRepository departmentRepository = new DepartmentRepository();


    public DataBaseConnection() throws ClassNotFoundException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        String connectionUrl =
                "jdbc:sqlserver://127.0.0.1:1433;"
                        + "database=COMPANY;"
                        + "user=KIM;"
                        + "password=1234;"
                        + "encrypt=true;trustServerCertificate=true";

        try {
            Connection connection = DriverManager.getConnection(connectionUrl);
            List<Department> departments = departmentRepository.findByDeptNo(1, connection);
            for(Department dept : departments){
                System.out.println(dept.toString());
            }
            connection.close();
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
