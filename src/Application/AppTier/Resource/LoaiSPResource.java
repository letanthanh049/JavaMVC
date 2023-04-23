package Application.AppTier.Resource;

import Application.AppTier.Model.LoaiSP;

public class LoaiSPResource {

    private int maLoai;
    private String tenLoai;

    public LoaiSPResource() {
    }

    public LoaiSPResource(int maLoai, String tenLoai) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
    }
    
     public LoaiSPResource(LoaiSP lsp) {
        this.maLoai = lsp.getMaLoai();
        this.tenLoai = lsp.getTenLoai();
    }

    public int getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

}
