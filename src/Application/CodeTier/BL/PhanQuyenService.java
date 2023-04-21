package Application.CodeTier.BL;

import Application.AppTier.Model.PhanQuyen;
import Application.CodeTier.DAL.PhanQuyenDA;

import java.util.ArrayList;

public class PhanQuyenService {

    private PhanQuyenDA pqDA = new PhanQuyenDA();
    
    public ArrayList<PhanQuyen> getListQuyen() {
        ArrayList<PhanQuyen> dspq = pqDA.getListQuyen();
        return dspq;
    }

    public PhanQuyen getQuyen(String quyen) {
        return pqDA.getQuyen(quyen);
    }

    public boolean suaQuyen(PhanQuyen phanQuyen) {
        return pqDA.suaQuyen(phanQuyen);
    }

    public boolean themQuyen(PhanQuyen phanQuyen) {
        return pqDA.themQuyen(phanQuyen);
    }

    public boolean xoaQuyen(String phanQuyen) {
        return pqDA.xoaQuyen(phanQuyen);
    }
}
