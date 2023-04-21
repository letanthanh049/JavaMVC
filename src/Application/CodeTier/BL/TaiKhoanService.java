package Application.CodeTier.BL;

import Application.CodeTier.DAL.TaiKhoanDA;

public class TaiKhoanService {

    private TaiKhoanDA tkDA = new TaiKhoanDA();
    
    public boolean themTaiKhoan(int maNV, String tenDangNhap, String quyen) {
        return tkDA.themTaiKhoan(maNV, tenDangNhap, quyen);
    }

    public boolean kiemTraTrungTenDangNhap(String tenDangNhap) {
        return tkDA.kiemTraTrungTenDangNhap(tenDangNhap);
    }

    public String getTenDangNhapTheoMa(int maNV) {
        return tkDA.getTenDangNhapTheoMa(maNV);
    }

    public boolean datLaiMatKhau(int maNV, String tenDangNhap) {
        return tkDA.datLaiMatKhau(maNV, tenDangNhap);
    }

    public boolean datLaiQuyen(int maNV, String quyen){
        return tkDA.datLaiQuyen(maNV, quyen);
    }

    public String getQuyenTheoMa(int maNV) {
        return tkDA.getQuyenTheoMa(maNV);
    }

    public boolean khoaTaiKhoan(int maNV) {
        return tkDA.khoaTaiKhoan(maNV);
    }

    public boolean moKhoaTaiKhoan(int maNV) {
        return tkDA.moKhoaTaiKhoan(maNV);
    }

    public boolean doiMatKhau(String matKhauCu, String matKhauMoi) {
        return tkDA.doiMatKhau(matKhauCu, matKhauMoi);
    }

    public int getTrangThai(int ma) {
        return tkDA.getTrangThai(ma);
    }
}
