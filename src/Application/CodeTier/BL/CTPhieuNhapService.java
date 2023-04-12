package Application.CodeTier.BL;

import Application.AppTier.Model.CTPhieuNhap;
import Application.CodeTier.DAL.CTPhieuNhapDA;
import java.util.ArrayList;

public class CTPhieuNhapService {

    private CTPhieuNhapDA ctphieunhapDA = new CTPhieuNhapDA();
    
    public ArrayList<CTPhieuNhap> getListCTPhieuNhap() {
        ArrayList<CTPhieuNhap> dsctpn = ctphieunhapDA.getListCTPhieuNhap();
        return dsctpn;
    }

    public ArrayList<CTPhieuNhap> getListCTPhieuNhapTheoMaPN(int maPN) {
        ArrayList<CTPhieuNhap> dsctpn = ctphieunhapDA.getListCTPhieuNhapTheoMaPN(maPN);
        return dsctpn;
    }

    public ArrayList<CTPhieuNhap> getListCTPhieuNhapTheoMaSP(int maSP) {
        ArrayList<CTPhieuNhap> dsctpn = ctphieunhapDA.getListCTPhieuNhapTheoMaSP(maSP);
        return dsctpn;
    }

    public boolean addCTPhieuNhap(CTPhieuNhap ctpn) {
        return ctphieunhapDA.addCTPhieuNhap(ctpn);
    }

    public boolean deleteCTPhieuNhap(int maPN) {
        return ctphieunhapDA.deleteCTPhieuNhap(maPN);
    }

    public boolean deleteCTPhieuNhap(int maPN, int maSP) {
        return ctphieunhapDA.deleteCTPhieuNhap(maPN, maSP);
    }

    public boolean updateCTPhieuNhap(int maPN, CTPhieuNhap ctpn) {
        return ctphieunhapDA.updateCTPhieuNhap(maPN, ctpn);
    }
}
