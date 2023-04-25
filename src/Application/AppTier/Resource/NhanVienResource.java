package Application.AppTier.Resource;

import Application.AppTier.Model.NhanVien;

public class NhanVienResource {

    private int maNV;
    private String ho;
    private String ten;
    private String gioiTinh;
    private String chucVu;

    public NhanVienResource() {
    }

    public NhanVienResource(int maNV, String ho, String ten, String gioiTinh, String chucVu) {
        this.maNV = maNV;
        this.ho = ho;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.chucVu = chucVu;
    }

    public NhanVienResource(NhanVien nv) {
        this.maNV = nv.getMaNV();
        this.ho = nv.getHo();
        this.ten = nv.getTen();
        this.gioiTinh = nv.getGioiTinh();
        this.chucVu = nv.getChucVu();
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

}
