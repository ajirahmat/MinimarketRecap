package DataBase;

import Form.MenuForm;
import connection.Koneksi;
import net.proteanit.sql.DbUtils;
import java.security.MessageDigest;
import model.RukoModel;
import model.UserModel;
import java.sql.*;

public class DataBase extends Koneksi {

    public ResultSet rs = null;
    public PreparedStatement ps = null;
    public Statement stm = null;

    public ResultSet GetData(String sql) {
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }

    public ResultSet GetData() {
        try {
            ps = connection.prepareStatement("SELECT * FROM `Barang`");
            rs = ps.executeQuery("SELECT * FROM `Barang`");
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }

    public PreparedStatement InsertData(UserModel user) {
        try {
            String sql = "INSERT INTO `User` (`NIP`, `Nama`, `Status`, `Password`) "
                    + "VALUES ('" + user.getNIP() + "','" + user.getNama()
                    + "','" + user.getStatus() + "','" + user.getPassword() + "')";
            ps = connection.prepareStatement(sql);
            ps.execute();
        } catch (Exception e) {
            System.out.println(e);
        }
        return ps;
    }

    public PreparedStatement InsertData(RukoModel ruko) {

        try {
            java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
            String sql = "INSERT INTO `Barang` (`KodeBarang`, `NamaBarang`, `Harga`, `Stok`, `Keterangan`) "
                    + "VALUES ('" + ruko.getKodebarang() + "', '" + ruko.getNamabarang() + "', '" + ruko.getHarga() + "', "
                    + "'" + ruko.getJumlahstock() + "', '" + ruko.getKeterangan() + "')";
            ps = connection.prepareStatement(sql);
            ps.execute();
        } catch (Exception e) {
            System.out.println(e);
        }
        return ps;
    }

    public ResultSet Login(String NIP, String Password) {
        String sql = "SELECT * FROM `User` WHERE NIP='" + NIP + "'and PASSWORD='" + Password + "'";
        try {

            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }

    public ResultSet Profil() {
        MenuForm adm = new MenuForm();
        String query = "SELECT * FROM `user` WHERE NIP='" + adm.lNIP + "'";
        try {
            PreparedStatement PS = connection.prepareStatement(query);
            ResultSet rs = PS.executeQuery();
            rs.next();
        } catch (Exception e) {
        }
        return rs;
    }

    public ResultSet CekData(String ruko) {
        String sql = "SELECT * FROM `Barang` WHERE `KodeBarang`= '" +ruko+"'";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }

    public ResultSet CekData(int NIP) {
        String sql = "SELECT * FROM `User` WHERE NIP='" + NIP + "'";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }

    public PreparedStatement DeleteData(UserModel user) {
        try {
            String ql = "DELETE FROM `User` WHERE `NIP` ='" + user.getNIP() + "'";
            ps = connection.prepareStatement(ql);
            ps.execute();
        } catch (Exception e) {
            System.out.println(e);
        }
        return ps;
    }

    public PreparedStatement DeleteData(RukoModel ruko) {
        try {
            String sql = "DELETE FROM `Barang` WHERE `KodeBarang` ='"+ruko.getKodebarang()+"'";
            ps = connection.prepareStatement(sql);
            ps.execute();
        } catch (Exception e) {
            System.out.println(e);
        }
        return ps;
    }

    public PreparedStatement UpdateData(RukoModel ruko) {
        try {
            String sql = "UPDATE `Barang` SET `NamaBarang`='" + ruko.getNamabarang() + "'"
                    + ",`Harga`='" + ruko.getHarga() + "',`Stok`='" + ruko.getJumlahstock() + 
                    "',`Keterangan`='" + ruko.getKeterangan() + "' WHERE `KodeBarang`='" + ruko.getKodebarang() + "'";
            ps = connection.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return ps;

    }
}
