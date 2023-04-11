package Application.CodeTier.BL;

import Application.AppTier.Model.NhanVien;
import Application.CodeTier.DAL.NhanVienDA; 
import java.util.ArrayList;

public class NhanVienService {
    
    private NhanVienDA nvDA = new NhanVienDA();
    
    public ArrayList<NhanVien> getDanhSachNhanVien() {
        return nvDA.getDanhSachNhanVien();
    }
    
    public NhanVien getNhanVien(int maNV){
        return nvDA.getNhanVien(maNV);
    }
    
    public boolean updateNhanVien(NhanVien nv){
        return nvDA.updateNhanVien(nv);
    }
    
    public boolean deleteNhanVien(int maNV){
        return nvDA.deleteNhanVien(maNV);
    }
    
    public boolean themNhanVien(NhanVien nv){
        return nvDA.themNhanVien(nv);
    }
    
    public boolean nhapExcel(NhanVien nv){
        return nvDA.nhapExcel(nv);
    }
}
