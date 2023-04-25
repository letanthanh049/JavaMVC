package Application.AppTier.Controller;

import Application.CodeTier.BL.HoaDonService;
import Application.AppTier.Model.HoaDon;
import Application.AppTier.Resource.HoaDonResource;
import MyCustom.MyDialog;
import java.sql.Timestamp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class HoaDonController {

    private ArrayList<HoaDonResource> listHoaDonView= new ArrayList();
    private ArrayList<HoaDon> listHoaDon;
    private HoaDonService hdService = new HoaDonService();

    public ArrayList<HoaDonResource> getListHoaDon() {
        listHoaDon = hdService.getListHoaDon();
        this.listHoaDonView.clear();
        for (HoaDon hd : listHoaDon) 
            this.listHoaDonView.add(new HoaDonResource(hd));
        return listHoaDonView;
    }

    public void luuHoaDon(int maKH, String nhanVien, int tongTien, String ghiChu) {
        long currentSystemTime = System.currentTimeMillis();
        Timestamp currentTime = new Timestamp(0);
        currentTime.setTime(currentSystemTime);
        
        HoaDon hd = new HoaDon();
        String[] arrNV = nhanVien.split(" - ");
        int maNV = Integer.parseInt(arrNV[0]);
        
        hd.setMaNV(maNV);
        hd.setMaKH(maKH);
        hd.setGhiChu(ghiChu);
        hd.setTongTien(tongTien);
        hd.setCreatedAt(currentTime);
        hd.setUpdatedAt(currentTime);

        hdService.addHoaDon(hd);
    }

    public int getMaHoaDonMoiNhat() {
        return hdService.getMaHoaDonMoiNhat();
    }

    public HoaDonResource getHoaDon(String maHD) {
        int ma = Integer.parseInt(maHD);
        for (HoaDonResource hd : listHoaDonView) {
            if (hd.getMaHD() == ma)
                return hd;
        }
        return null;
    }

    public ArrayList<HoaDonResource> getListHoaDonTheoGia(String min, String max) {
        try {
            int minPrice = Integer.parseInt(min);
            int maxPrice = Integer.parseInt(max);
            ArrayList<HoaDonResource> dshd = new ArrayList<>();
            for (HoaDonResource hd : listHoaDonView) {
                if (hd.getTongTien() > minPrice && hd.getTongTien() < maxPrice)
                    dshd.add(hd);
            }
            return dshd;
        } catch (Exception e) {
            new MyDialog("Hãy nhập khoảng giá hợp lệ", MyDialog.ERROR_DIALOG);
        }
        return null;
    }

    public ArrayList<HoaDonResource> getListHoaDonTheoNgay(String min, String max) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date minDate = sdf.parse(min);
            Date maxDate = sdf.parse(max);

            java.sql.Date dateMin = new java.sql.Date(minDate.getTime());
            java.sql.Date dateMax = new java.sql.Date(maxDate.getTime());

            ArrayList<HoaDonResource> dshd = new ArrayList();
            listHoaDon = hdService.getListHoaDon(dateMin, dateMax);
            for (HoaDon hd : listHoaDon) 
            dshd.add(new HoaDonResource(hd));
            return dshd;
        } catch (Exception e) {
            new MyDialog("Hãy nhập khoảng ngày hợp lệ!", MyDialog.ERROR_DIALOG);
        }
        return null;
    }
}
