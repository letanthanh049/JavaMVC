package Application.AppTier.Model;

import java.sql.Timestamp;

public class PhanQuyen {

    private String quyen;
    private int nhapHang;
    private int qlSanPham;
    private int qlNhanVien;
    private int qlKhachHang;
    private int thongKe;
    private Timestamp createAt;
    private Timestamp updateAt;

    public PhanQuyen() {
    }

    public PhanQuyen(String quyen, int nhapHang, int qlSanPham, int qlNhanVien, int qlKhachHang, int thongKe) {
        this.quyen = quyen;
        this.nhapHang = nhapHang;
        this.qlSanPham = qlSanPham;
        this.qlNhanVien = qlNhanVien;
        this.qlKhachHang = qlKhachHang;
        this.thongKe = thongKe;
    }

    public String getQuyen() {
        return quyen;
    }

    public void setQuyen(String quyen) {
        this.quyen = quyen;
    }

    public int getNhapHang() {
        return nhapHang;
    }

    public void setNhapHang(int nhapHang) {
        this.nhapHang = nhapHang;
    }

    public int getQlSanPham() {
        return qlSanPham;
    }

    public void setQlSanPham(int qlSanPham) {
        this.qlSanPham = qlSanPham;
    }

    public int getQlNhanVien() {
        return qlNhanVien;
    }

    public void setQlNhanVien(int qlNhanVien) {
        this.qlNhanVien = qlNhanVien;
    }

    public int getQlKhachHang() {
        return qlKhachHang;
    }

    public void setQlKhachHang(int qlKhachHang) {
        this.qlKhachHang = qlKhachHang;
    }

    public int getThongKe() {
        return thongKe;
    }

    public void setThongKe(int thongKe) {
        this.thongKe = thongKe;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }

}
