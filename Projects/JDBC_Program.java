package Projects;
import java.sql.*;
 public class JDBC_Program {
    public static void main(String[] args) throws SQLException {

        jdbc();
    }

    private static void jdbc() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/expencedb";
        Connection conn = DriverManager.getConnection(url,"root","");
        String expencetype  = "pizza";
        int expenceamount = 100;
        int IncomeAmount = 2000;
        //int rn = 12;
        //String pno = "1234567890";

        String sql = "INSERT INTO expencetb(expencetype , expenceamount, Incomeamount)" + "values('" +expencetype +"',"+ expenceamount+ IncomeAmount + ")";

        try{
            conn = DriverManager.getConnection(url,"root","");
            Statement st = conn.createStatement();
            int m = st.executeUpdate(sql);
            if(m == 1){
                System.out.println("Inserted Successfully:" + sql);
            } else {
                System.out.println("Insertion failed");

            }
        } catch (Exception ex){
            System.out.println(ex);
        }finally {
            conn.close();
        }
    }

}