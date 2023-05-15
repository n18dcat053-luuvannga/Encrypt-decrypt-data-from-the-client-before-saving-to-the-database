/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_canhan;
import java.sql.*;
/**
 *
 * @author Admin
 */
public class DBAccess {
    private Connection con;
    private Statement stmt;

    public DBAccess() {
        try {
            SQLServer_Connection myCon = new SQLServer_Connection();
            con = myCon.getConnection();
            stmt = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int Update(String str) {
        try {
            int i = stmt.executeUpdate(str);
            return i;
        } catch (Exception e) {
            return -1;
        }
    }

    public ResultSet Query(String str) {
        try {
            ResultSet rs = stmt.executeQuery(str);
            return rs;
        } catch (Exception e) {
            return null;
        }
    }
}
