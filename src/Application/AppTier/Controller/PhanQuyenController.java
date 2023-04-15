package Application.AppTier.Controller;

import Application.CodeTier.DAL.PhanQuyenDA;
import Application.AppTier.Model.PhanQuyen;
import MyCustom.MyDialog;

import java.util.ArrayList;

public class PhanQuyenController {

    public static PhanQuyen quyenTK = null;
    private PhanQuyenDA phanQuyenDA = new PhanQuyenDA();
    private ArrayList<PhanQuyen> listPhanQuyen = null;

    public void docDanhSachQuyen() {
        this.listPhanQuyen = phanQuyenDA.getListQuyen();
    }

    public void kiemTraQuyen(String quyen) {
        quyenTK = phanQuyenDA.getQuyen(quyen);
    }

    public ArrayList<PhanQuyen> getListQuyen() {
        if (listPhanQuyen == null)
            docDanhSachQuyen();
        return this.listPhanQuyen;
    }

    public boolean suaQuyen(String tenQuyen, int nhapHang, int sanPham, int nhanVien, int khachHang, int thongKe) {
        PhanQuyen phanQuyen = new PhanQuyen(tenQuyen, nhapHang, sanPham, nhanVien, khachHang, thongKe);
        boolean flag = phanQuyenDA.suaQuyen(phanQuyen);
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

        if (kiemTonTaiTraQuyen(tenQuyen)) {
            new MyDialog("Thêm thất bại! Quyền đã tồn tại", MyDialog.ERROR_DIALOG);
            return false;
        }

        PhanQuyen phanQuyen = new PhanQuyen(tenQuyen, 0, 0, 0, 0, 0);
        boolean flag = phanQuyenDA.themQuyen(phanQuyen);
        if (flag) {
            new MyDialog("Thêm thành công! Hãy hiệu chỉnh quyền", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Thêm thất bại! Quyền đã tồn tại", MyDialog.ERROR_DIALOG);
        }
        return flag;
    }

    private boolean kiemTonTaiTraQuyen(String tenQuyen) {
        docDanhSachQuyen();
        for (PhanQuyen q : listPhanQuyen) {
            if (q.getQuyen().equalsIgnoreCase(tenQuyen))
                return true;
        }
        return false;
    }

    public boolean xoaQuyen(String tenQuyen) {
        boolean flag = phanQuyenDA.xoaQuyen(tenQuyen);
        if (flag) {
            new MyDialog("Xoá thành công!", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Xoá thất bại!", MyDialog.ERROR_DIALOG);
        }
        return flag;
    }
}
