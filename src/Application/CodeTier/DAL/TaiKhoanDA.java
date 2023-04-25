package Application.CodeTier.DAL;

import Application.AppTier.Controller.DangNhapController;
import Application.AppTier.Model.TaiKhoan;
import Database.MyConnect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;

public class TaiKhoanDA {

    long currentSystemTime = System.currentTimeMillis();
    Timestamp currentTime = new Timestamp(0);
    
    public boolean themTaiKhoan(int maNV, String tenDangNhap, String quyen) {
        boolean result = false;
        currentTime.setTime(currentSystemTime);
        try {
            String sql = "INSERT INTO taikhoan(MaNV, TenDangNhap, MatKhau, Quyen, CreatedAt, UpdatedAt) "
                    + "VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, maNV);
            pre.setString(2, tenDangNhap);
            pre.setString(3, tenDangNhap);
            pre.setString(4, quyen);
            pre.setTimestamp(5, currentTime);
            pre.setTimestamp(6, currentTime);
            result = pre.executeUpdate() > 0;
        } catch (Exception e) {
            String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
            System.out.println("Error occurred in method: " + methodName);
            System.out.println(e);
            return false;
        }
        return result;
    }

    public boolean kiemTraTrungTenDangNhap(String tenDangNhap) {
        try {
            String sql = "SELECT * FROM TaiKhoan WHERE TenDangNhap = '" + tenDangNhap + "'";
            Statement st = MyConnect.conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public String getTenDangNhapTheoMa(int maNV) {
        try {
            String sql = "SELECT TenDangNhap FROM TaiKhoan WHERE MaNV=" + maNV;
            Statement st = MyConnect.conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception e) {
        }
        return "";
    }

    public boolean datLaiMatKhau(int maNV, String tenDangNhap) {
        currentTime.setTime(currentSystemTime);
        try {
            String sql = "UPDATE TaiKhoan SET MatKhau=?, UpdatedAt=? WHERE MaNV=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, tenDangNhap);
            pre.setTimestamp(2, currentTime);
            pre.setInt(3, maNV);
            return pre.executeUpdate() > 0;
        } catch (Exception e) {
        }
        return false;
    }

    public boolean datLaiQuyen(int maNV, String quyen) {
        currentTime.setTime(currentSystemTime);
        try {
            String sql = "UPDATE TaiKhoan SET Quyen=?, UpdatedAt=? WHERE MaNV=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, quyen);
            pre.setTimestamp(2, currentTime);
            pre.setInt(3, maNV);
            return pre.executeUpdate() > 0;
        } catch (Exception e) {
        }
        return false;
    }

    public String getQuyenTheoMa(int maNV) {
        try {
            String sql = "SELECT Quyen FROM TaiKhoan WHERE MaNV=" + maNV;
            Statement st = MyConnect.conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception e) {
        }
        return "";
    }

    public boolean khoaTaiKhoan(int maNV) {
        currentTime.setTime(currentSystemTime);
        try {
            String sql = "UPDATE TaiKhoan SET TrangThai=0, UpdatedAt=? WHERE MaNV=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setTimestamp(1, currentTime);
            pre.setInt(2, maNV);
            return pre.executeUpdate() > 0;
        } catch (Exception e) {
        }
        return false;
    }

    public boolean moKhoaTaiKhoan(int maNV) {
        currentTime.setTime(currentSystemTime);
        try {
            String sql = "UPDATE TaiKhoan SET TrangThai=1, UpdatedAt=? WHERE MaNV=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setTimestamp(1, currentTime);
            pre.setInt(2, maNV);
            return pre.executeUpdate() > 0;
        } catch (Exception e) {
        }
        return false;
    }

    public boolean doiMatKhau(String matKhauCu, String matKhauMoi) {
        currentTime.setTime(currentSystemTime);
        try {
            String sql = "UPDATE TaiKhoan SET MatKhau=?, UpdatedAt=? WHERE MaNV=? AND MatKhau=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, matKhauMoi);
            pre.setTimestamp(2, currentTime);
            pre.setInt(3, DangNhapController.taiKhoanLogin.getMaNhanVien());
            pre.setString(4, matKhauCu);
            return pre.executeUpdate() > 0;
        } catch (Exception e) {
        }
        return false;
    }

    public int getTrangThai(int ma) {
        try {
            String sql = "SELECT TrangThai FROM TaiKhoan WHERE MaNV=" + ma;
            Statement st = MyConnect.conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return -1;
    }
}
