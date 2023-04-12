package Application.CodeTier.BL;

import Application.AppTier.Model.PhieuNhap;
import Application.CodeTier.DAL.PhieuNhapDA;

import java.util.ArrayList;

public class PhieuNhapService {

    private PhieuNhapDA pnDA = new PhieuNhapDA();
    
    public ArrayList<PhieuNhap> getListPhieuNhap() {
        ArrayList<PhieuNhap> dspn = pnDA.getListPhieuNhap();
        return dspn;
    }

    public boolean themPhieuNhap(PhieuNhap pn) {
        return pnDA.themPhieuNhap(pn);
    }

    public PhieuNhap getPhieuNhap(int maPN) {
        return pnDA.getPhieuNhap(maPN);
    }

    public boolean deletePhieuNhap(int maPN) {
        return pnDA.deletePhieuNhap(maPN);
    }

    public boolean updatePhieuNhap(int maPN, PhieuNhap pn) {
        return pnDA.updatePhieuNhap(maPN, pn);
    }

    public int getLastID() {
        return pnDA.getLastID();
    }
}
