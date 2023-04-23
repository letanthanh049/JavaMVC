package Application.AppTier.Controller;

import Application.CodeTier.BL.LoaiService;
import Application.AppTier.Model.LoaiSP;
import Application.AppTier.Resource.LoaiSPResource;
import MyCustom.MyDialog;
import java.util.ArrayList;

public class LoaiController {

    private LoaiService loaiDA = new LoaiService();
    private ArrayList<LoaiSP> listLoai = null;
    private ArrayList<LoaiSPResource> listLoaiView = new ArrayList();
    
    public LoaiController() {
        docDanhSachLoai();
    }

    public void docDanhSachLoai() {
        this.listLoai = loaiDA.getDanhSachLoai();
        this.listLoaiView.clear();
        for (LoaiSP lsp : listLoai) 
            this.listLoaiView.add(new LoaiSPResource(lsp));
    }

    public ArrayList<LoaiSPResource> getDanhSachLoai() {
            docDanhSachLoai();
        return this.listLoaiView;
    }

    public String getTenLoai(int ma) {
        for (LoaiSPResource loai : listLoaiView) {
            if (loai.getMaLoai() == ma) {
                return loai.getMaLoai() + " - " + loai.getTenLoai();
            }
        }
        return "";
    }

    public boolean themLoai(int maLoai, String tenLoai) {
        if (tenLoai.trim().equals("")) {
            new MyDialog("Không được để trống tên loại!", MyDialog.ERROR_DIALOG);
            return false;
        }
        maLoai += 1;
        LoaiSP loai = new LoaiSP(maLoai, tenLoai);
        if (loaiDA.themLoai(loai)) {
            new MyDialog("Thêm thành công!", MyDialog.SUCCESS_DIALOG);
            return true;
        } else {
            new MyDialog("Thêm thất bại!", MyDialog.ERROR_DIALOG);
            return false;
        }
    }

    public boolean xoaLoai(String ma) {
        if (ma.trim().equals("")) {
            new MyDialog("Chưa chọn loại để xoá!", MyDialog.SUCCESS_DIALOG);
            return false;
        }
        int maLoai = Integer.parseInt(ma);
        if (loaiDA.xoaLoai(maLoai)) {
            new MyDialog("Xoá thành công!", MyDialog.SUCCESS_DIALOG);
            return true;
        } else {
            new MyDialog("Xoá thất bại! Loại có sản phẩm con", MyDialog.ERROR_DIALOG);
            return false;
        }
    }

    public boolean suaLoai(String ma, String ten) {
        if (ten.trim().equals("")) {
            new MyDialog("Không được để trống tên loại!", MyDialog.ERROR_DIALOG);
            return false;
        }
        int maLoai = Integer.parseInt(ma);
        if (loaiDA.suaLoai(maLoai, ten)) {
            new MyDialog("Sửa thành công!", MyDialog.SUCCESS_DIALOG);
            return true;
        } else {
            new MyDialog("Sửa thất bại!", MyDialog.ERROR_DIALOG);
            return false;
        }
    }

}
