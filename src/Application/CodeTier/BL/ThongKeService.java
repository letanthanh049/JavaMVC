package Application.CodeTier.BL;

import Application.AppTier.Controller.SanPhamController;
import Application.AppTier.Model.SanPham;
import Application.AppTier.Model.ThongKe;
import Application.CodeTier.DAL.ThongKeDA;

import java.util.ArrayList;

public class ThongKeService {
    
    private ThongKeDA thkDA = new ThongKeDA(); 
    
    public ThongKe getThongKe(int nam) {
        ThongKe thongKe = thkDA.getThongKe(nam);
        return thongKe;
    }

    private ArrayList<SanPham> getTopBanChay() {
        ArrayList<SanPham> dssp = null;
        return null;
    }

    private int getTongSoLuongSP() {
        return 0;
    }

    private String[] getDateString(int nam, int quy) {
        return null;
    }

    private int getTongThuQuy(int nam, int quy) {
        return 0;
    }

    private int getSoLuongNhanVien() {
        return 0;
    }

    private int getSoLuongKhachHang() {
        return 0;
    }

    public double getDoanhThuThang(int thang, int nam) {
        return thkDA.getDoanhThuThang(thang, nam);
    }

    public double abc(int thang, int nam) {
        return thkDA.abc(thang, nam);
    }
}
