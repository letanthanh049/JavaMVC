package Application.AppTier.Controller;

import Application.AppTier.Model.PhanQuyen;
import Application.AppTier.Resource.PhanQuyenResource;
import Application.CodeTier.BL.PhanQuyenService;
import MyCustom.MyDialog;
import java.sql.Timestamp;

import java.util.ArrayList;

public class PhanQuyenController {

    public static PhanQuyen quyenTK = null;
    private ArrayList<PhanQuyen> listPhanQuyen = null;
    private ArrayList<PhanQuyenResource> listPhanQuyenView = new ArrayList<>();
    private PhanQuyenService pqService = new PhanQuyenService();

    public void docDanhSachQuyen() {
        this.listPhanQuyen = pqService.getListQuyen();
        this.listPhanQuyenView.clear();
        for (PhanQuyen pq : listPhanQuyen) 
            this.listPhanQuyenView.add(new PhanQuyenResource(pq));
    }

    public void kiemTraQuyen(String quyen) {
        quyenTK = pqService.getQuyen(quyen);
    }

    public ArrayList<PhanQuyenResource> getListQuyen() {
        if (listPhanQuyenView == null)
            docDanhSachQuyen();
        return this.listPhanQuyenView;
    }

    public boolean suaQuyen(String tenQuyen, int nhapHang, int sanPham, int nhanVien, int khachHang, int thongKe) {
        long currentSystemTime = System.currentTimeMillis();
        Timestamp currentTime = new Timestamp(0);
        currentTime.setTime(currentSystemTime);
        PhanQuyen phanQuyen = new PhanQuyen(tenQuyen, nhapHang, sanPham, nhanVien, khachHang, thongKe, currentTime, currentTime);
        boolean flag = pqService.suaQuyen(phanQuyen);
        if (flag) {
            new MyDialog("Sửa thành công!", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Sửa thất bại!", MyDialog.ERROR_DIALOG);
        }
        return flag;
    }

    public boolean themQuyen(String tenQuyen) {
        if (tenQuyen == null || tenQuyen.trim().equals("")) {
            return false;
        }

        if (kiemTraTonTaiQuyen(tenQuyen)) {
            new MyDialog("Thêm thất bại! Quyền đã tồn tại", MyDialog.ERROR_DIALOG);
            return false;
        }

        long currentSystemTime = System.currentTimeMillis();
        Timestamp currentTime = new Timestamp(0);
        currentTime.setTime(currentSystemTime);
        PhanQuyen phanQuyen = new PhanQuyen(tenQuyen, 0, 0, 0, 0, 0, currentTime, currentTime);
        boolean flag = pqService.themQuyen(phanQuyen);
        if (flag) {
            new MyDialog("Thêm thành công! Hãy hiệu chỉnh quyền", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Thêm thất bại! Quyền đã tồn tại", MyDialog.ERROR_DIALOG);
        }
        return flag;
    }

    private boolean kiemTraTonTaiQuyen(String tenQuyen) {
        docDanhSachQuyen();
        for (PhanQuyenResource q : listPhanQuyenView) {
            if (q.getQuyen().equalsIgnoreCase(tenQuyen))
                return true;
        }
        return false;
    }

    public boolean xoaQuyen(String tenQuyen) {
        boolean flag = pqService.xoaQuyen(tenQuyen);
        if (flag) {
            new MyDialog("Xoá thành công!", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Xoá thất bại!", MyDialog.ERROR_DIALOG);
        }
        return flag;
    }
}
