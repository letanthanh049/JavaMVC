package Application.AppTier.Resource;

import Application.AppTier.Model.NhaCungCap;

public class NhaCungCapResource {
    private int maNCC;
    private String tenNCC;
    private String diaChi;
    private String dienThoai;

    public NhaCungCapResource() {
    }

    public NhaCungCapResource(int maNCC, String tenNCC, String diaChi, String dienThoai) {
        this.maNCC = maNCC;
        this.tenNCC = tenNCC;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
    }
    
    public NhaCungCapResource(NhaCungCap ncc) {
        this.maNCC = ncc.getMaNCC();
        this.tenNCC = ncc.getTenNCC();
        this.diaChi = ncc.getDiaChi();
        this.dienThoai = ncc.getDienThoai();
    }

    public int getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(int maNCC) {
        this.maNCC = maNCC;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

}
