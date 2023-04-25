package Application.CodeTier.BL;

import Application.AppTier.Model.SanPham;
import Application.CodeTier.DAL.SanPhamDA;

import java.util.ArrayList;

public class SanPhamService {

    private SanPhamDA spDA = new SanPhamDA();
    
    public ArrayList<SanPham> getListSanPham() {
        ArrayList<SanPham> dssp = spDA.getListSanPham();
        return dssp;
    }

    public SanPham getSanPham(int ma) {
        return null;
    }

    public ArrayList<SanPham> getSanPhamTheoLoai(int maLoai) {
        return spDA.getSanPhamTheoLoai(maLoai);
    }

    public String getAnh(int ma) {
        return spDA.getAnh(ma);
    }

    public void capNhatSoLuongSP(int ma, int soLuongMat) {
        spDA.capNhatSoLuongSP(ma, soLuongMat);
    }

    public boolean themSanPham(SanPham sp) {
        return spDA.themSanPham(sp);
    }

    public boolean nhapSanPhamTuExcel(SanPham sp) {
        return spDA.nhapSanPhamTuExcel(sp);
    }

    public boolean xoaSanPham(int maSP) {
        return spDA.xoaSanPham(maSP);
    }

    public boolean suaSanPham(SanPham sp) {
        return spDA.suaSanPham(sp);
    }
    
    public boolean xoaToanBoSanPham() {
        return spDA.xoaToanBoSanPham();
    }
}
