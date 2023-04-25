package Application.AppTier.Controller;

import Application.CodeTier.BL.CTHoaDonService;
import Application.AppTier.Model.CTHoaDon;
import Application.AppTier.Resource.CTHoaDonResource;
import java.sql.Timestamp;

import java.util.ArrayList;

public class CTHoaDonController {

    private ArrayList<CTHoaDon> listCTHoaDon;
    private ArrayList<CTHoaDonResource> listCTHoaDonView=new ArrayList();
    private CTHoaDonService ctHDService = new CTHoaDonService();
    private HoaDonController hdBUS = new HoaDonController();

    public CTHoaDonController() {
        docListCTHoaDon();
    }

    public void docListCTHoaDon() {
        this.listCTHoaDon = ctHDService.getListCTHoaDon();
        this.listCTHoaDonView.clear();
        for (CTHoaDon cthd : listCTHoaDon) 
            this.listCTHoaDonView.add(new CTHoaDonResource(cthd));
    }

    public ArrayList<CTHoaDonResource> getListCTHoaDon() {
        if (this.listCTHoaDonView == null)
            docListCTHoaDon();
        return listCTHoaDonView;
    }

    public ArrayList<CTHoaDonResource> getListCTHoaDonTheoMaHD(String maHD) {
        int ma = Integer.parseInt(maHD);
        ArrayList<CTHoaDonResource> dsct = new ArrayList<>();

        for (CTHoaDonResource cthd : listCTHoaDonView) {
            if (cthd.getMaHD() == ma)
                dsct.add(cthd);
        }

        return dsct;
    }

    public void addCTHoaDon(String maSP, String soLuong, String donGia, String thanhTien) {
        int ma = hdBUS.getMaHoaDonMoiNhat();

        donGia = donGia.replace(",","");
        thanhTien = thanhTien.replace(",", "");

        CTHoaDon cthd = new CTHoaDon();
        long currentSystemTime = System.currentTimeMillis();
        Timestamp currentTime = new Timestamp(0);
        currentTime.setTime(currentSystemTime);

        cthd.setMaHD(ma);
        cthd.setMaSP(Integer.parseInt(maSP));
        cthd.setDonGia(Integer.parseInt(donGia));
        cthd.setSoLuong(Integer.parseInt(soLuong));
        cthd.setThanhTien(Integer.parseInt(thanhTien));
        cthd.setCreatedAt(currentTime);
        cthd.setUpdatedAt(currentTime);

        ctHDService.addCTHoaDon(cthd);
    }
}
