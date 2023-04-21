package Application.CodeTier.BL;

import Application.AppTier.Model.KhachHang;
import Application.CodeTier.DAL.KhachHangDA;

import java.util.ArrayList;

public class KhachHangService {

    private KhachHangDA khDA = new KhachHangDA();
    
    public ArrayList<KhachHang> getListKhachHang() {
        return khDA.getListKhachHang();
    }

    public KhachHang getKhachHang(int maKH) {
        return khDA.getKhachHang(maKH);
    }

    public boolean addKhachHang(KhachHang kh) {
        return khDA.addKhachHang(kh);
    }

    public boolean deleteKhachHang(int maKH) {
        return khDA.deleteKhachHang(maKH);
    }

    public boolean updateKhachHang(int maKH, KhachHang kh) {
        return khDA.updateKhachHang(maKH, kh);
    }

    public boolean updateTongChiTieu(int maKH, int tongChiTieu) {
        return khDA.updateTongChiTieu(maKH, tongChiTieu);
    }
}
