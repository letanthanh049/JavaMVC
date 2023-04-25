package Application.AppTier.Controller;

import Application.CodeTier.BL.NhaCungCapService;
import Application.AppTier.Model.NhaCungCap;
import Application.AppTier.Resource.NhaCungCapResource;
import MyCustom.MyDialog;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class NhaCungCapController {

    private NhaCungCapService nccService = new NhaCungCapService();
    private ArrayList<NhaCungCap> listNhaCungCap = null;
    private ArrayList<NhaCungCapResource> listNhaCungCapView = new ArrayList();

    public NhaCungCapController() {
        docDanhSach();
    }

    public void docDanhSach() {
        this.listNhaCungCap = nccService.getListNhaCungCap();
        this.listNhaCungCapView.clear();
        for (NhaCungCap ncc : listNhaCungCap) 
            this.listNhaCungCapView.add(new NhaCungCapResource(ncc));
    }

    public ArrayList<NhaCungCapResource> getListNhaCungCap() {
        if (this.listNhaCungCapView == null) {
            docDanhSach();
        }
        return this.listNhaCungCapView;
    }

    public boolean themNhaCungCap(String tenNCC, String diaChi, String dienThoai) {
        if (tenNCC.trim().equals("")) {
            new MyDialog("Hãy nhập tên Nhà cung cấp này!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (diaChi.trim().equals("")) {
            new MyDialog("Hãy nhập địa chỉ!", MyDialog.ERROR_DIALOG);
            return false;
        }
        Pattern pattern = Pattern.compile("^\\d{10}$");
        if (!pattern.matcher(dienThoai).matches()) {
            new MyDialog("Hãy nhập số điện thoại hợp lệ!", MyDialog.ERROR_DIALOG);
            return false;
        }

        NhaCungCap ncc = new NhaCungCap();
        long currentSystemTime = System.currentTimeMillis();
        Timestamp currentTime = new Timestamp(0);
        currentTime.setTime(currentSystemTime);
        ncc.setTenNCC(tenNCC);
        ncc.setDiaChi(diaChi);
        ncc.setDienThoai(dienThoai);
        ncc.setCreatedAt(currentTime);
        ncc.setUpdatedAt(currentTime);
        boolean flag = nccService.addNCC(ncc);
        if (flag) {
            new MyDialog("Thêm mới thành công!", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Thêm mới thất bại!", MyDialog.ERROR_DIALOG);
        }
        return flag;
    }

    public boolean suaNhaCungCap(String maNCC, String tenNCC, String diaChi, String dienThoai) {
        if (tenNCC.trim().equals("")) {
            new MyDialog("Hãy nhập tên Nhà cung cấp này!", MyDialog.ERROR_DIALOG);
            return false;
        }
        if (diaChi.trim().equals("")) {
            new MyDialog("Hãy nhập địa chỉ!", MyDialog.ERROR_DIALOG);
            return false;
        }
        Pattern pattern = Pattern.compile("^\\d{10}$");
        if (!pattern.matcher(dienThoai).matches()) {
            new MyDialog("Hãy nhập số điện thoại hợp lệ!", MyDialog.ERROR_DIALOG);
            return false;
        }

        int ma = Integer.parseInt(maNCC);
        long currentSystemTime = System.currentTimeMillis();
        Timestamp currentTime = new Timestamp(0);
        currentTime.setTime(currentSystemTime);

        NhaCungCap ncc = new NhaCungCap();
        ncc.setMaNCC(ma);
        ncc.setTenNCC(tenNCC);
        ncc.setDiaChi(diaChi);
        ncc.setDienThoai(dienThoai);
        ncc.setUpdatedAt(currentTime);
        
        boolean flag = nccService.updateNCC(ncc);

        if (flag) {
            new MyDialog("Sửa thành công!", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Sửa thất bại!", MyDialog.ERROR_DIALOG);
        }
        return flag;
    }

}
