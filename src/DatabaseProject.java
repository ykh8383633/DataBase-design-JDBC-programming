import GUI.MainGui;
import repository.DataBaseConnection;

public class DatabaseProject {
    static DataBaseConnection dbc;
    static MainGui mainGui;
    public static void main(String []args) throws ClassNotFoundException {
        dbc = new DataBaseConnection();
        mainGui = new MainGui();

    }
}
