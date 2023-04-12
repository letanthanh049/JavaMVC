package Application.CodeTier.BL;

import Application.AppTier.Model.LoaiSP;
import Application.CodeTier.DAL.LoaiDA;

import java.util.ArrayList;

public class LoaiService {

    private LoaiDA lDA = new LoaiDA();
    
    public ArrayList<LoaiSP> getDanhSachLoai() {
        ArrayList<LoaiSP> dsl = lDA.getDanhSachLoai();
        return dsl;
    }

    public boolean themLoai(LoaiSP loai) {
        return lDA.themLoai(loai);
    }

    public boolean xoaLoai(int maLoai) {
        return lDA.xoaLoai(maLoai);
    }

    public boolean suaLoai(int maLoai, String ten) {
        return lDA.suaLoai(maLoai, ten);
    }

}
