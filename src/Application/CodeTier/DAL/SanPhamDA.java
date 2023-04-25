package Application.CodeTier.DAL;

import Application.AppTier.Model.SanPham;
import Database.MyConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

public class SanPhamDA {

    public ArrayList<SanPham> getListSanPham() {
        try {
            String sql = "SELECT * FROM sanpham";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            ArrayList<SanPham> dssp = new ArrayList<>();
            while (rs.next()) {
                SanPham sp = new SanPham();

                sp.setMaSP(rs.getInt(1));
                sp.setTenSP(rs.getString(2));
                sp.setMaLoai(rs.getInt(3));
                sp.setSoLuong(rs.getInt(4));
                sp.setDonViTinh(rs.getString(5));
                sp.setHinhAnh(rs.getString(6));
                sp.setDonGia(rs.getInt(7));
                sp.setCreatedAt(rs.getTimestamp(8));
                sp.setUpdatedAt(rs.getTimestamp(9));

                dssp.add(sp);
            }
            return dssp;
        } catch (SQLException e) {
        }

        return null;
    }

    public SanPham getSanPham(int ma) {
        try {
            String sql = "SELECT *FROM SanPham WHERE MaSP=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, ma);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                SanPham sp = new SanPham();

                sp.setMaSP(rs.getInt(1));
                sp.setTenSP(rs.getString(2));
                sp.setMaLoai(rs.getInt(3));
                sp.setSoLuong(rs.getInt(4));
                sp.setDonViTinh(rs.getString(5));
                sp.setHinhAnh(rs.getString(6));
                sp.setDonGia(rs.getInt(7));
                sp.setCreatedAt(rs.getTimestamp(8));
                sp.setUpdatedAt(rs.getTimestamp(9));

                return sp;
            }
        } catch (SQLException e) {
        }

        return null;
    }

    public ArrayList<SanPham> getSanPhamTheoLoai(int maLoai) {
        try {
            String sql = "SELECT * FROM sanpham WHERE MaLoai=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, maLoai);
            ResultSet rs = pre.executeQuery();
            ArrayList<SanPham> dssp = new ArrayList<>();
            while (rs.next()) {
                SanPham sp = new SanPham();

                sp.setMaSP(rs.getInt(1));
                sp.setTenSP(rs.getString(2));
                sp.setMaLoai(rs.getInt(3));
                sp.setSoLuong(rs.getInt(4));
                sp.setDonViTinh(rs.getString(5));
                sp.setHinhAnh(rs.getString(6));
                sp.setDonGia(rs.getInt(7));
                sp.setCreatedAt(rs.getTimestamp(8));
                sp.setUpdatedAt(rs.getTimestamp(9));

                dssp.add(sp);
            }
            return dssp;
        } catch (SQLException e) {
        }

        return null;
    }

    public String getAnh(int ma) {
        try {
            String sql = "SELECT HinhAnh FROM SanPham WHERE MaSP=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, ma);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                return rs.getString("HinhAnh");
            }
        } catch (SQLException e) {
        }
        return "";
    }

    public void capNhatSoLuongSP(int ma, int soLuongMat) {
        long currentSystemTime = System.currentTimeMillis();
        Timestamp currentTime = new Timestamp(0);
        currentTime.setTime(currentSystemTime);
        SanPham sp = getSanPham(ma);
        int soLuong = sp.getSoLuong();
        sp.setSoLuong(soLuong + soLuongMat);
        sp.setUpdatedAt(currentTime);
        try {
//            String sql = "UPDATE SanPham SET SoLuong=? WHERE MaSP=" + ma;
//            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
//            pre.setInt(1, sp.getSoLuong());
//            pre.executeUpdate();
            String sql = "UPDATE SanPham SET SoLuong = SoLuong + ?, UpdatedAt = ? WHERE MaSP = ?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, sp.getSoLuong());
            pre.setTimestamp(2, sp.getUpdatedAt());
            pre.setInt(3, ma);
            pre.executeUpdate();
        } catch (SQLException e) {
            String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
            System.out.println("Error occurred in method: " + methodName);
            System.out.println(e);
        }

    }

    public boolean themSanPham(SanPham sp) {
        try {
            String sql = "INSERT INTO SanPham(TenSP, MaLoai, SoLuong, DonViTinh, HinhAnh, DonGia, CreatedAt, UpdatedAt) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, sp.getTenSP());
            pre.setInt(2, sp.getMaLoai());
            pre.setInt(3, sp.getSoLuong());
            pre.setString(4, sp.getDonViTinh());
            pre.setString(5, sp.getHinhAnh());
            pre.setInt(6, sp.getDonGia());
            pre.setTimestamp(7, sp.getCreatedAt());
            pre.setTimestamp(8, sp.getUpdatedAt());

            pre.execute();
            return true;
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean nhapSanPhamTuExcel(SanPham sp) {
        try {
            String sql  = "INSERT INTO SanPham(TenSP, MaLoai, SoLuong, DonViTinh, HinhAnh, DonGia, CreatedAt, UpdatedAt) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, sp.getTenSP());
            pre.setInt(2, sp.getMaLoai());
            pre.setInt(3, sp.getSoLuong());
            pre.setString(4, sp.getDonViTinh());
            pre.setString(5, sp.getHinhAnh());
            pre.setInt(6, sp.getDonGia());
            pre.setTimestamp(7, sp.getCreatedAt());
            pre.setTimestamp(8, sp.getUpdatedAt());

            pre.execute();
            return true;
        } catch (SQLException e) {
            String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
            System.out.println("Error occurred in method: " + methodName);
            System.out.println("Error message: " + e.getMessage());
            System.out.println("SQL state: " + e.getSQLState());
            System.out.println("Error code: " + e.getErrorCode());
        }
        return false;
    }

    public boolean xoaSanPham(int maSP) {
        try {
            String sql = "DELETE FROM SanPham WHERE MaSP=" + maSP;
            Statement st = MyConnect.conn.createStatement();
            st.execute(sql);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean suaSanPham(SanPham sp) {
        try {
            String sql = "UPDATE SanPham SET "
                    + "TenSP=?, "
                    + "MaLoai=?, SoLuong=?, DonViTinh=?, HinhAnh=?, DonGia=?, UpdatedAt=? "
                    + "WHERE MaSP=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, sp.getTenSP());
            pre.setInt(2, sp.getMaLoai());
            pre.setInt(3, sp.getSoLuong());
            pre.setString(4, sp.getDonViTinh());
            pre.setString(5, sp.getHinhAnh());
            pre.setInt(6, sp.getDonGia());
            pre.setTimestamp(7, sp.getUpdatedAt());
            pre.setInt(8, sp.getMaSP());

            pre.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean xoaToanBoSanPham() {
        try {
            String sql1 = "DELETE FROM SanPham;";
            PreparedStatement pre1 = MyConnect.conn.prepareStatement(sql1);
            pre1.execute();
            String sql2 = "ALTER TABLE sanpham AUTO_INCREMENT = 1;";
            PreparedStatement pre2 = MyConnect.conn.prepareStatement(sql2);
            pre2.execute();
            return true;
        } catch (Exception e) {
            String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
            System.out.println("Error occurred in method: " + methodName);
            System.out.println("Error message: " + e.getMessage());
        }
        return false;
    }
}
