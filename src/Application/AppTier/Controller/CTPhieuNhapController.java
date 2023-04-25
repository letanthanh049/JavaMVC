package Application.AppTier.Controller;

import Application.AppTier.Model.CTPhieuNhap;
import Application.AppTier.Resource.CTPhieuNhapResource;
import Application.CodeTier.BL.CTPhieuNhapService;
import java.sql.Timestamp;
import java.util.ArrayList;

public class CTPhieuNhapController {

    private ArrayList<CTPhieuNhap> listCTPhieuNhap = null;
    private CTPhieuNhapService ctPhieuNhapService = new CTPhieuNhapService();
    private ArrayList<CTPhieuNhapResource> listCTPhieuNhapView = new ArrayList();

    public CTPhieuNhapController() {
        docDanhSach();
    }

    public void docDanhSach() {
        this.listCTPhieuNhap = ctPhieuNhapService.getListCTPhieuNhap();
        this.listCTPhieuNhapView.clear();
        for (CTPhieuNhap ctpn : listCTPhieuNhap) 
            this.listCTPhieuNhapView.add(new CTPhieuNhapResource(ctpn));
    }

    public ArrayList<CTPhieuNhapResource> getListPhieuNhap() {
//        if (listCTPhieuNhapView == null) {
            docDanhSach();
//        }
        return listCTPhieuNhapView;
    }
    
    public ArrayList<CTPhieuNhapResource> getListPhieuNhap(String maPN) {
        ArrayList<CTPhieuNhapResource> dsct = new ArrayList<>();
        int ma = Integer.parseInt(maPN);
        
        for(CTPhieuNhapResource ctpn : listCTPhieuNhapView) {
            if(ctpn.getMaPN() == ma) {
                dsct.add(ctpn);
            }
        }
        
        return dsct;
    }

    public boolean luuCTPhieuNhap(CTPhieuNhap ctpn) {
        long currentSystemTime = System.currentTimeMillis();
        Timestamp currentTime = new Timestamp(0);
        currentTime.setTime(currentSystemTime);
        ctpn.setCreatedAt(currentTime);
        ctpn.setUpdatedAt(currentTime);
        return ctPhieuNhapService.addCTPhieuNhap(ctpn);
    }
}