import java.sql.*;


public class DBTest {


    public static void main(String[] args) {
        String DRIVER = "com.mysql.jdbc.Driver";
        String DB_LOGIN = "root";
        String DB_PASSWORD = "root";
        Connection con = null;

        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/noteBookDB", "root", "root");
            System.out.println("Yes");
            Statement st = con.createStatement();
            // Добавить запись
            Integer rs = st.executeUpdate("INSERT INTO `Nodes` (`NoteContent`) VALUES ('fourth')");
//
            // прочитать все колонки
            ResultSet set = st.executeQuery("SELECT * FROM Nodes");
            while (set.next()) {
                System.out.println(set.getString("noteContent"));

            }

        } catch (ClassNotFoundException e) {
            System.out.println(e);

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
}
