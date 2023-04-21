package Application.AppTier.Resource;

import Application.AppTier.Model.KhachHang;

public class KhachHangResource {
    private int maKH;
    private String ho;
    private String ten;
    private String gioiTinh;
    private int tongChiTieu;

    public KhachHangResource(int maKH, String ho, String ten, String gioiTinh, int tongChiTieu) {
        this.maKH = maKH;
        this.ho = ho;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.tongChiTieu = tongChiTieu;
    }

    public KhachHangResource(KhachHang kh) {
        this.maKH = kh.getMaKH();
        this.ho = kh.getHo();
        this.ten = kh.getTen();
        this.gioiTinh = kh.getGioiTinh();
        this.tongChiTieu = kh.getTongChiTieu();
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
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

    public int getTongChiTieu() {
        return tongChiTieu;
    }

    public void setTongChiTieu(int tongChiTieu) {
        this.tongChiTieu = tongChiTieu;
    }

}
