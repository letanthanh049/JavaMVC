package Application.AppTier.Model;

import java.sql.Timestamp;
import java.util.Date;

public class GiamGia {

    private int maGiam;
    private String tenGiamGia;
    private int phanTramGiam;
    private int dieuKien;
    private Date ngayBD;
    private Date ngayKT;
    private Timestamp createAt;
    private Timestamp updateAt;

    public GiamGia() {
    }

    public GiamGia(int maGiam, String tenGiamGia, int phanTramGiam, int dieuKien, Date ngayBD, Date ngayKT) {
        this.maGiam = maGiam;
        this.tenGiamGia = tenGiamGia;
        this.phanTramGiam = phanTramGiam;
        this.dieuKien = dieuKien;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
    }

    public int getMaGiam() {
        return maGiam;
    }

    public void setMaGiam(int maGiam) {
        this.maGiam = maGiam;
    }

    public String getTenGiamGia() {
        return tenGiamGia;
    }

    public void setTenGiamGia(String tenGiamGia) {
        this.tenGiamGia = tenGiamGia;
    }

    public int getPhanTramGiam() {
        return phanTramGiam;
    }

    public void setPhanTramGiam(int phanTramGiam) {
        this.phanTramGiam = phanTramGiam;
    }

    public int getDieuKien() {
        return dieuKien;
    }

    public void setDieuKien(int dieuKien) {
        this.dieuKien = dieuKien;
    }

    public Date getNgayBD() {
        return ngayBD;
    }

    public void setNgayBD(Date ngayBD) {
        this.ngayBD = ngayBD;
    }

    public Date getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(Date ngayKT) {
        this.ngayKT = ngayKT;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }
    
    
}
