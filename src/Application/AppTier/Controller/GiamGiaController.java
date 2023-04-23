package Application.AppTier.Controller;

import Application.CodeTier.BL.GiamGiaService;
import Application.AppTier.Model.GiamGia;
import Application.AppTier.Resource.GiamGiaResource;
import MyCustom.MyDialog;

import java.util.ArrayList;
import java.util.Date;

public class GiamGiaController {

    private ArrayList<GiamGia> listGiamGia = null;
    private GiamGiaService giamGiaDA = new GiamGiaService();
    private ArrayList<GiamGiaResource> listGiamGiaView = new ArrayList();

    public GiamGiaController() {
        docDanhSach();
    }

    public void docDanhSach() {
        this.listGiamGia = giamGiaDA.getDanhSachMaGiam();
        this.listGiamGiaView.clear();
        for (GiamGia gg : listGiamGia) 
            this.listGiamGiaView.add(new GiamGiaResource(gg));
    }

    public ArrayList<GiamGiaResource> getDanhSachGiamGia() {
        if (this.listGiamGiaView == null)
            docDanhSach();
        return this.listGiamGiaView;
    }

    public boolean themMaGiam(String ten, String phanTram, String dieuKien, Date ngayBD, Date ngayKT) {
        ten = ten.trim();
        phanTram = phanTram.replace("%", "");
        dieuKien = dieuKien.replace(",", "");
        if (ten.equals("")) {
            new MyDialog("Hãy nhập tên chương trình khuyến mãi!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (ngayBD.compareTo(ngayKT) > 0 || ngayBD.compareTo(ngayKT) == 0) {
            new MyDialog("Ngày kết thúc không hợp lệ!", MyDialog.ERROR_DIALOG);
            return false;
        }
        boolean flag = false;
        try {
            int phanTramGiam = Integer.parseInt(phanTram);
            int dieuKienGiam = Integer.parseInt(dieuKien);

            GiamGia gg = new GiamGia();
            gg.setTenGiamGia(ten);
            gg.setPhanTramGiam(phanTramGiam);
            gg.setDieuKien(dieuKienGiam);
            gg.setNgayBD(ngayBD);
            gg.setNgayKT(ngayKT);

            flag = giamGiaDA.themMaGiam(gg);
        } catch (Exception e) {
            new MyDialog("Hãy nhập số nguyên hợp lệ!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (flag) {
            new MyDialog("Thêm mới thành công!", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Thêm mới thất bại!", MyDialog.ERROR_DIALOG);
        }
        return flag;
    }

    public boolean suaMaGiam(String ma, String ten, String phanTram, String dieuKien, Date ngayBD, Date ngayKT) {
        ten = ten.trim();
        phanTram = phanTram.replace("%", "");
        dieuKien = dieuKien.replace(",", "");
        if (ma.equals("")) {
            new MyDialog("Chưa chọn mã để sửa!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (ten.equals("")) {
            new MyDialog("Hãy nhập tên chương trình khuyến mãi!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (ngayBD.compareTo(ngayKT) > 0 || ngayBD.compareTo(ngayKT) == 0) {
            new MyDialog("Ngày kết thúc không hợp lệ!", MyDialog.ERROR_DIALOG);
            return false;
        }
        boolean flag = false;
        try {
            int maGiam = Integer.parseInt(ma);
            int phanTramGiam = Integer.parseInt(phanTram);
            int dieuKienGiam = Integer.parseInt(dieuKien);

            GiamGia gg = new GiamGia();
            gg.setMaGiam(maGiam);
            gg.setTenGiamGia(ten);
            gg.setPhanTramGiam(phanTramGiam);
            gg.setDieuKien(dieuKienGiam);
            gg.setNgayBD(ngayBD);
            gg.setNgayKT(ngayKT);

            flag = giamGiaDA.suaMaGiam(gg);
        } catch (Exception e) {
            new MyDialog("Hãy nhập số nguyên hợp lệ!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (flag) {
            new MyDialog("Sửa thành công!", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Sửa thất bại!", MyDialog.ERROR_DIALOG);
        }
        return flag;
    }
}
