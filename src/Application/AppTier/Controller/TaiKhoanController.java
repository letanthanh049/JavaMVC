package Application.AppTier.Controller;

import Application.CodeTier.DAL.TaiKhoanDA;
import Application.AppTier.Model.TaiKhoan;
import MyCustom.MyDialog;

public class TaiKhoanController {

    private TaiKhoanDA taiKhoanDA = new TaiKhoanDA();

    public String getTenDangNhapTheoMa(String ma) {
        int maNV = Integer.parseInt(ma);
        return taiKhoanDA.getTenDangNhapTheoMa(maNV);
    }

    public String getQuyenTheoMa(String ma) {
        int maNV = Integer.parseInt(ma);
        return taiKhoanDA.getQuyenTheoMa(maNV);
    }

    public void datLaiMatKhau(String ma, String tenDangNhap) {
        int maNV = Integer.parseInt(ma);
        boolean flag = taiKhoanDA.datLaiMatKhau(maNV, tenDangNhap);
        if (flag) {
            new MyDialog("Đặt lại thành công! Mật khẩu mới là: " + tenDangNhap, MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Đặt lại thất bại!", MyDialog.ERROR_DIALOG);
        }
    }

    public void datLaiQuyen(String ma, String quyen) {
        int maNV = Integer.parseInt(ma);
        boolean flag = taiKhoanDA.datLaiQuyen(maNV, quyen);
        if (flag) {
            new MyDialog("Đặt lại thành công!", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Đặt lại thất bại!", MyDialog.ERROR_DIALOG);
        }
    }

    public boolean kiemTraTrungTenDangNhap(String tenDangNhap) {
        return taiKhoanDA.kiemTraTrungTenDangNhap(tenDangNhap);
    }

    public boolean themTaiKhoan(String ma, String tenDangNhap, String quyen) {
        int maNV = Integer.parseInt(ma);
        if (tenDangNhap.trim().equals("")) {
            new MyDialog("Không được để trống Tên đăng nhập!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (kiemTraTrungTenDangNhap(tenDangNhap)) {
            MyDialog dlg = new MyDialog("Tên đăng nhập bị trùng! Có thể tài khoản bị khoá, thực hiện mở khoá?", MyDialog.WARNING_DIALOG);
            if (dlg.getAction() == MyDialog.OK_OPTION) {
                moKhoaTaiKhoan(ma);
                return true;
            }
            return false;
        }
        boolean flag = taiKhoanDA.themTaiKhoan(maNV, tenDangNhap, quyen);
        if (flag) {
            new MyDialog("Cấp tài khoản thành công! Mật khẩu là " + tenDangNhap, MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Cấp tài khoản thất bại! Tài khoản đã tồn tại", MyDialog.ERROR_DIALOG);
        }
        return flag;
    }

    public void khoaTaiKhoan(String ma) {
        int maNV = Integer.parseInt(ma);
        boolean flag = taiKhoanDA.khoaTaiKhoan(maNV);
        if (flag) {
            new MyDialog("Khoá tài khoản thành công!", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Khoá tài khoản thất bại!", MyDialog.ERROR_DIALOG);
        }
    }

    public void moKhoaTaiKhoan(String ma) {
        int maNV = Integer.parseInt(ma);
        boolean flag = taiKhoanDA.moKhoaTaiKhoan(maNV);
        if (flag) {
            new MyDialog("Mở khoá tài khoản thành công!", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Mở khoá tài khoản thất bại!", MyDialog.ERROR_DIALOG);
        }
    }

    public boolean doiMatKhau(String matKhauCu, String matKhauMoi, String nhapLaiMatKhau) {
        if(!matKhauMoi.equals(nhapLaiMatKhau)) {
            new MyDialog("Mật khẩu mới không khớp!", MyDialog.ERROR_DIALOG);
            return false;
        }
        boolean flag = taiKhoanDA.doiMatKhau(matKhauCu, matKhauMoi);
        if (flag) {
            new MyDialog("Đổi thành công!", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Mật khẩu cũ nhập sai!", MyDialog.ERROR_DIALOG);
        }
        return flag;
    }
    
    public int getTrangThai(String maNV) {
        int ma = Integer.parseInt(maNV);
        return taiKhoanDA.getTrangThai(ma);
    }

}
