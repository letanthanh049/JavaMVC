package Application.AppTier.Controller;

import Application.AppTier.Model.CTPhieuNhap;
import Application.CodeTier.BL.CTPhieuNhapService;
import java.util.ArrayList;

public class CTPhieuNhapController {

    private ArrayList<CTPhieuNhap> listPhieuNhap = null;
    private CTPhieuNhapService ctPhieuNhapDA = new CTPhieuNhapService();

    public CTPhieuNhapController() {
        docDanhSach();
    }

    public void docDanhSach() {
        this.listPhieuNhap = ctPhieuNhapDA.getListCTPhieuNhap();
    }

    public ArrayList<CTPhieuNhap> getListPhieuNhap() {
        if (listPhieuNhap == null) {
            docDanhSach();
        }
        return listPhieuNhap;
    }
    
    public ArrayList<CTPhieuNhap> getListPhieuNhap(String maPN) {
        ArrayList<CTPhieuNhap> dsct = new ArrayList<>();
        int ma = Integer.parseInt(maPN);
        
        for(CTPhieuNhap ct: listPhieuNhap) {
            if(ct.getMaPN() == ma) {
                dsct.add(ct);
            }
        }
        
        return dsct;
    }

    public boolean luuCTPhieuNhap(CTPhieuNhap ctpn) {
        return ctPhieuNhapDA.addCTPhieuNhap(ctpn);
    }
}
