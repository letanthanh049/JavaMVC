package Application.AppTier.Resource;

import Application.AppTier.Model.TaiKhoan;

public class TaiKhoanResource {

    private int maNhanVien;
    private String tenDangNhap;
    private String matKhau;
    private String quyen;

    public TaiKhoanResource() {
    }

    public TaiKhoanResource(int maNhanVien, String tenDangNhap, String matKhau, String quyen) {
        this.maNhanVien = maNhanVien;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.quyen = quyen;
    }
    
    public TaiKhoanResource(TaiKhoan tk) {
        this.maNhanVien = tk.getMaNhanVien();
        this.tenDangNhap = tk.getTenDangNhap();
        this.matKhau = tk.getMatKhau();
        this.quyen = tk.getQuyen();
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getQuyen() {
        return quyen;
    }

    public void setQuyen(String quyen) {
        this.quyen = quyen;
    }

}
