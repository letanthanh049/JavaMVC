package Application.AppTier.Controller;

import MyCustom.MyDialog;
import Application.CodeTier.BL.PhieuNhapService;
import Application.AppTier.Model.PhieuNhap;
import Application.AppTier.Resource.PhieuNhapResource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class PhieuNhapController {

    private PhieuNhapService phieuNhapDA = new PhieuNhapService();
    private ArrayList<PhieuNhap> listPhieuNhap = null;
    private ArrayList<PhieuNhapResource> listPhieuNhapView = new ArrayList();

    public PhieuNhapController() {
        docDanhSach();
    }

    public void docDanhSach() {
        this.listPhieuNhap = phieuNhapDA.getListPhieuNhap();
        this.listPhieuNhapView.clear();
        for (PhieuNhap pn : listPhieuNhap) 
            this.listPhieuNhapView.add(new PhieuNhapResource(pn));
    }

    public ArrayList<PhieuNhapResource> getListPhieuNhap() {
        if (listPhieuNhapView == null) {
            docDanhSach();
        }
        return listPhieuNhapView;
    }

    public boolean themPhieuNhap(String nhaCungCap, String nhanVien, int tongTien) {
        String[] NCC = nhaCungCap.split(" - ");
        String[] NV = nhanVien.split(" - ");

        int maNCC = Integer.parseInt(NCC[0]);
        int maNV = Integer.parseInt(NV[0]);

        PhieuNhap pn = new PhieuNhap();
        pn.setMaNCC(maNCC);
        pn.setMaNV(maNV);
        pn.setTongTien(tongTien);

        return phieuNhapDA.themPhieuNhap(pn);
    }

    public int getLastID() {
        return phieuNhapDA.getLastID();
    }

    public PhieuNhapResource timPhieuNhap(String maPN) {
        int ma = Integer.parseInt(maPN);
        for (PhieuNhapResource pn : listPhieuNhapView) {
            if (pn.getMaPN() == ma) {
                return pn;
            }
        }
        return null;
    }

    public ArrayList<PhieuNhapResource> getListPhieuNhapTheoGia(String giaThap, String giaCao) {
        try {
            int min = Integer.parseInt(giaThap);
            int max = Integer.parseInt(giaCao);
            if (max < min) {
                new MyDialog("Hãy nhập khoảng giá phù hợp!", MyDialog.ERROR_DIALOG);
                return null;
            }
            ArrayList<PhieuNhapResource> result = new ArrayList<>();
            for (PhieuNhapResource pn : listPhieuNhapView) {
                if (pn.getTongTien() <= max && pn.getTongTien() >= min) {
                    result.add(pn);
                }
            }
            return result;
        } catch (Exception e) {
            new MyDialog("Hãy nhập số nguyên cho khoảng giá!", MyDialog.ERROR_DIALOG);
        }
        return null;
    }

    public ArrayList<PhieuNhapResource> getListPhieuNhapTheoNgay(String tuNgay, String denNgay) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
            
            Date min = sdf.parse(tuNgay);
            Date max = sdf.parse(denNgay);
            if (max.before(min)) {
                new MyDialog("Hãy nhập khoảng ngày phù hợp!", MyDialog.ERROR_DIALOG);
                return null;
            }
            ArrayList<PhieuNhapResource> result = new ArrayList<>();
            for (PhieuNhapResource pn : listPhieuNhapView) {
                if (pn.getNgayLap().after(min) && pn.getNgayLap().before(max)) {
                    result.add(pn);
                }
            }
            return result;
        } catch (Exception e) {
            new MyDialog("Hãy nhập ngày hợp lệ (dd/MM/yyy)!", MyDialog.ERROR_DIALOG);
        }
        return null;
    }

}
