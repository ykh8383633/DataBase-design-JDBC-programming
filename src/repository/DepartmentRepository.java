package repository;

import entity.Department;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DepartmentRepository {
    private ResultSet rs = null;
    private Statement st = null; // 그냥 가져오는거
    private PreparedStatement ps = null; // ?넣어서 집어넣는거

    public List<Department> findByDeptNo(int deptNo, Connection connection) throws SQLException {
        List<Department> returnArr = new ArrayList<>();

        String query  = "SELECT * FROM DEPARTMENT WHERE DEPTNO = ?";
        ps = connection.prepareStatement(query);
        ps.setInt(1, deptNo);
        rs = ps.executeQuery();

        while(rs.next()){
            returnArr.add(new Department(rs.getInt(1), rs.getString(2), rs.getInt(3)));
        }

        closeRepository();
        return returnArr;
    }

    private void closeRepository(){
        try {
            if (rs != null)
                rs.close();
            if (st != null)
                st.close();
            if (ps != null)
                ps.close();
        } catch (Exception e) {
            System.out.println(e + "=> dbClose fail");
        }
    }
}
