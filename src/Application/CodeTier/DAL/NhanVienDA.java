package Application.CodeTier.DAL;

import Application.AppTier.Model.NhanVien;
import Database.MyConnect;
import MyCustom.MyDialog;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class NhanVienDA {

    public ArrayList<NhanVien> getDanhSachNhanVien() {
        try {
            String sql = "SELECT * FROM nhanvien";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            ArrayList<NhanVien> dssv = new ArrayList<>();
            while (rs.next()) {
                NhanVien nv = new NhanVien();

                nv.setMaNV(rs.getInt(1));
                nv.setHo(rs.getString(2));
                nv.setTen(rs.getString(3));
                nv.setGioiTinh(rs.getString(4));
                nv.setChucVu(rs.getString(5));
                nv.setCreatedAt(rs.getTimestamp(6));
                nv.setUpdatedAt(rs.getTimestamp(7));

                dssv.add(nv);
            }
            return dssv;
        } catch (SQLException e) {
            String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
            System.out.println("Error occurred in method: " + methodName);
            System.out.println(e);
        }

        return null;
    }

    public NhanVien getNhanVien(int maNV) {
        NhanVien nv = null;
        try {
            String sql = "SELECT * FROM nhanvien WHERE MaNV=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(0, maNV);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                nv = new NhanVien();
                nv.setMaNV(rs.getInt(1));
                nv.setHo(rs.getString(2));
                nv.setTen(rs.getString(3));
                nv.setGioiTinh(rs.getString(4));
                nv.setChucVu(rs.getString(5));
                nv.setCreatedAt(rs.getTimestamp(6));
                nv.setUpdatedAt(rs.getTimestamp(7));
            }
        } catch (SQLException e) {
            String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
            System.out.println("Error occurred in method: " + methodName);
            System.out.println(e);
            return null;
        }

        return nv;
    }

    public boolean updateNhanVien(NhanVien nv) {
        boolean result = false;
        try {
            String sql = "UPDATE nhanvien SET Ho=?, Ten=?, GioiTinh=?, ChucVu=?, UpdatedAt=? WHERE MaNV=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, nv.getHo());
            pre.setString(2, nv.getTen());
            pre.setString(3, nv.getGioiTinh());
            pre.setString(4, nv.getChucVu());
            pre.setTimestamp(5, nv.getUpdatedAt());
            pre.setInt(6, nv.getMaNV());
            result = pre.executeUpdate() > 0;
        } catch (SQLException ex) {
            String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
            System.out.println("Error occurred in method: " + methodName);
            System.out.println(ex);
            return false;
        }
        return result;
    }

    public boolean deleteNhanVien(int maNV) {
        boolean result = false;
        try {
            String sql = "DELETE FROM nhanvien WHERE MaNV=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, maNV);
            result = pre.executeUpdate() > 0;
        } catch (SQLException ex) {
            String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
            System.out.println("Error occurred in method: " + methodName);
            System.out.println(ex);
            return false;
        }
        return result;
    }

    public boolean themNhanVien(NhanVien nv) {
        boolean result = false;
        try {
            String sql = "INSERT INTO NhanVien(Ho, Ten, GioiTinh, ChucVu, CreatedAt, UpdatedAt) " +
                            "VALUES(?, ?, ?, ?, ?, ?)";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, nv.getHo());
            pre.setString(2, nv.getTen());
            pre.setString(3, nv.getGioiTinh());
            pre.setString(4, nv.getChucVu());
            pre.setTimestamp(5, nv.getCreatedAt());
            pre.setTimestamp(6, nv.getUpdatedAt());
            result = pre.executeUpdate() > 0;
        } catch (SQLException ex) {
            String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
            System.out.println("Error occurred in method: " + methodName);
            System.out.println(ex);
            return false;
        }
        return result;
    }

    public boolean nhapExcel(NhanVien nv) {
        try {
            String sql = "DELETE * FROM nhanvien; " +
                    "INSERT INTO NhanVien(Ho, Ten, GioiTinh, ChucVu) " +
                    "VALUES(?, ?, ?, ?)";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, nv.getHo());
            pre.setString(2, nv.getTen());
            pre.setString(3, nv.getGioiTinh());
            pre.setString(4, nv.getChucVu());
            return true;
        } catch (SQLException ex) {
            String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
            System.out.println("Error occurred in method: " + methodName);
            System.out.println(ex);
        }
        return false;
    }
}
