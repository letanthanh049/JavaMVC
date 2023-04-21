package Application.CodeTier.BL;

import Application.AppTier.Model.TaiKhoan;
import Application.CodeTier.DAL.DangNhapDA;

public class DangNhapService {

    private DangNhapDA dnDA = new DangNhapDA();
    
    public TaiKhoan dangNhap(TaiKhoan tk) {
        return dnDA.dangNhap(tk);
    }
}