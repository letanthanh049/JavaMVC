package Application.AppTier.Controller;

import Application.AppTier.Model.CTPhieuNhap;
import Application.AppTier.Resource.CTPhieuNhapResource;
import Application.CodeTier.BL.CTPhieuNhapService;
import java.util.ArrayList;

public class CTPhieuNhapController {

    private ArrayList<CTPhieuNhap> listPhieuNhap = null;
    private CTPhieuNhapService ctPhieuNhapDA = new CTPhieuNhapService();
    private ArrayList<CTPhieuNhapResource> CTlistPhieuNhapView = new ArrayList();

    public CTPhieuNhapController() {
        docDanhSach();
    }

    public void docDanhSach() {
        this.listPhieuNhap = ctPhieuNhapDA.getListCTPhieuNhap();
        this.CTlistPhieuNhapView.clear();
        for (CTPhieuNhap ctpn : listPhieuNhap) 
            this.CTlistPhieuNhapView.add(new CTPhieuNhapResource(ctpn));
    }

    public ArrayList<CTPhieuNhapResource> getListPhieuNhap() {
        if (CTlistPhieuNhapView == null) {
            docDanhSach();
        }
        return CTlistPhieuNhapView;
    }
    
    public ArrayList<CTPhieuNhapResource> getListPhieuNhap(String maPN) {
        ArrayList<CTPhieuNhapResource> dsct = new ArrayList<>();
        int ma = Integer.parseInt(maPN);
        
        for(CTPhieuNhapResource ctpn : CTlistPhieuNhapView) {
            if(ctpn.getMaPN() == ma) {
                dsct.add(ctpn);
            }
        }
        
        return dsct;
    }

    public boolean luuCTPhieuNhap(CTPhieuNhap ctpn) {
        return ctPhieuNhapDA.addCTPhieuNhap(ctpn);
    }
}
