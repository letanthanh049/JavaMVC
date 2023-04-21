package Application.CodeTier.BL;

import Application.AppTier.Model.CTHoaDon;
import Application.CodeTier.DAL.CTHoaDonDA;
import java.util.ArrayList;


public class CTHoaDonService {

    private CTHoaDonDA cthoadonDA = new CTHoaDonDA();
    
    public ArrayList<CTHoaDon> getListCTHoaDon() {
        ArrayList<CTHoaDon> dscthd = cthoadonDA.getListCTHoaDon();
        return dscthd;
    }

    public ArrayList<CTHoaDon> getListCTHoaDonTheoMaHD(int maHD) {
        ArrayList<CTHoaDon> dscthd = cthoadonDA.getListCTHoaDonTheoMaHD(maHD);
        return dscthd;
    }

    public ArrayList<CTHoaDon> getListCTHoaDonTheoMaSP(int maSP) {
        ArrayList<CTHoaDon> dscthd = cthoadonDA.getListCTHoaDonTheoMaSP(maSP);
        return dscthd;
    }

    public boolean addCTHoaDon(CTHoaDon cthd) {
        return cthoadonDA.addCTHoaDon(cthd);
    }

    public boolean deleteCTHoaDon(int maHD, int maSP) {
        return cthoadonDA.deleteCTHoaDon(maHD, maSP);
    }

    public boolean deleteCTHoaDon(int maHD) {
        return cthoadonDA.deleteCTHoaDon(maHD);
    }

    public boolean updateCTHoaDon(int maHD, int maSP, CTHoaDon cthd) {
        return cthoadonDA.updateCTHoaDon(maHD, maSP, cthd);
    }
}
