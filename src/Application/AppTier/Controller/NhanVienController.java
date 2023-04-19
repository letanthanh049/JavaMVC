package Application.AppTier.Controller;

import Application.AppTier.Model.NhanVien;
import Application.AppTier.Resource.NhanVienResource;
import Application.CodeTier.BL.NhanVienService;
import MyCustom.MyDialog;

import java.sql.Timestamp;
import java.util.ArrayList;

public class NhanVienController {

    private ArrayList<NhanVien> listNhanVien = new ArrayList();
    private ArrayList<NhanVienResource> listNhanVienView = new ArrayList();
    private NhanVienService nvService = new NhanVienService();

    public NhanVienController() {
        docDanhSach();
    }

    public void docDanhSach() {
        this.listNhanVien = nvService.getDanhSachNhanVien();
        this.listNhanVienView.clear();
        for (NhanVien nv : listNhanVien) 
            this.listNhanVienView.add(new NhanVienResource(nv));
    }

    public ArrayList<NhanVienResource> getDanhSachNhanVien() {
        if (this.listNhanVienView == null)
            docDanhSach();
        return this.listNhanVienView;
    }

    public boolean themNhanVien(String ho, String ten, String gioiTinh, String chucVu) {
        ho = ho.trim();
        ten = ten.trim();
        chucVu = chucVu.trim();
        if (ten.equals("")) {
            new MyDialog("Tên không được để trống!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (chucVu.equals("")) {
            new MyDialog("Chức vụ không được để trống!", MyDialog.ERROR_DIALOG);
            return false;
        }
        NhanVien nv = new NhanVien();
        long currentSystemTime = System.currentTimeMillis();
        Timestamp currentTime = new Timestamp(0);
        currentTime.setTime(currentSystemTime);
        nv.setHo(ho);
        nv.setTen(ten);
        nv.setGioiTinh(gioiTinh);
        nv.setChucVu(chucVu);
        nv.setCreatedAt(currentTime);
        nv.setUpdatedAt(currentTime);
        boolean flag = nvService.themNhanVien(nv);
        if (!flag) {
            new MyDialog("Thêm thất bại!", MyDialog.ERROR_DIALOG);
        } else {
            new MyDialog("Thêm thành công!", MyDialog.SUCCESS_DIALOG);
        }
        return flag;
    }

    public boolean updateNhanVien(String ma, String ho, String ten, String gioiTinh, String chucVu) {
        int maNV = Integer.parseInt(ma);
        ho = ho.trim();
        ten = ten.trim();
        chucVu = chucVu.trim();
        if (ten.equals("")) {
            new MyDialog("Tên không được để trống!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (chucVu.equals("")) {
            new MyDialog("Chức vụ không được để trống!", MyDialog.ERROR_DIALOG);
            return false;
        }
        NhanVien nv = new NhanVien();
        long currentSystemTime = System.currentTimeMillis();
        Timestamp currentTime = new Timestamp(0);
        currentTime.setTime(currentSystemTime);
        nv.setMaNV(maNV);
        nv.setHo(ho);
        nv.setTen(ten);
        nv.setGioiTinh(gioiTinh);
        nv.setChucVu(chucVu);
        nv.setUpdatedAt(currentTime);
        boolean flag = nvService.updateNhanVien(nv);
        if (!flag) {
            new MyDialog("Cập nhập thất bại!", MyDialog.ERROR_DIALOG);
        } else {
            new MyDialog("Cập nhập thành công!", MyDialog.SUCCESS_DIALOG);
        }
        return flag;
    }

    public ArrayList<NhanVienResource> timNhanVien(String tuKhoa) {
        tuKhoa = tuKhoa.toLowerCase();
        ArrayList<NhanVienResource> dsnv = new ArrayList<>();
        for (NhanVienResource nv : listNhanVienView) {
            if (nv.getHo().toLowerCase().contains(tuKhoa) || nv.getTen().toLowerCase().contains(tuKhoa) ||
                    nv.getGioiTinh().toLowerCase().contains(tuKhoa) || nv.getChucVu().toLowerCase().contains(tuKhoa)) {
                dsnv.add(nv);
            }
        }
        return dsnv;
    }

    public boolean xoaNhanVien(String ma) {
        try {
            int maNV = Integer.parseInt(ma);
            MyDialog dlg = new MyDialog("Bạn có chắc muốn xoá nhân viên này?", MyDialog.WARNING_DIALOG);
            boolean flag = false;
            if (dlg.getAction() == MyDialog.OK_OPTION) {
                flag = nvService.deleteNhanVien(maNV);
                if (flag) {
                    new MyDialog("Xoá thành công!", MyDialog.SUCCESS_DIALOG);
                } else {
                    new MyDialog("Xoá thất bại!", MyDialog.ERROR_DIALOG);
                }
            }
            return flag;
        } catch (Exception e) {
            new MyDialog("Chưa chọn nhân viên!", MyDialog.ERROR_DIALOG);
        }
        return false;
    }

    public boolean nhapExcel(String ho, String ten, String gioiTinh, String chucVu) {
        NhanVien nv = new NhanVien();
        nv.setHo(ho);
        nv.setTen(ten);
        nv.setGioiTinh(gioiTinh);
        nv.setChucVu(chucVu);
        boolean flag = nvService.nhapExcel(nv);
        return flag;
    }
}
