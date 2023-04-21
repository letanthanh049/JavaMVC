package Application.AppTier.Resource;

import Application.AppTier.Model.CTPhieuNhap;

public class CTPhieuNhapResource {
    private int maPN;
    private int maSP;
    private int soLuong;
    private int donGia;
    private int thanhTien;
    
    public CTPhieuNhapResource() {
    }

    public CTPhieuNhapResource(int maPN, int maSP, int soLuong, int donGia, int thanhTien) {
        this.maPN = maPN;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }
    
    public CTPhieuNhapResource(CTPhieuNhap ctpn) {
        this.maPN = ctpn.getMaPN();
        this.maSP = ctpn.getMaSP();
        this.soLuong = ctpn.getSoLuong();
        this.donGia = ctpn.getDonGia();
        this.thanhTien = ctpn.getThanhTien();
    }

    public int getMaPN() {
        return maPN;
    }

    public void setMaPN(int maPN) {
        this.maPN = maPN;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }

}