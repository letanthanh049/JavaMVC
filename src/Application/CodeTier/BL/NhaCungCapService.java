package Application.CodeTier.BL;

import Application.AppTier.Model.NhaCungCap;
import Application.CodeTier.DAL.NhaCungCapDA;

import java.util.ArrayList;

public class NhaCungCapService {

    private NhaCungCapDA nccDA = new NhaCungCapDA();
    
    public ArrayList<NhaCungCap> getListNhaCungCap() {
        ArrayList<NhaCungCap> dsncc = nccDA.getListNhaCungCap();
        return dsncc;
    }

    public NhaCungCap getNhaCungCap(int maNCC) {
        return nccDA.getNhaCungCap(maNCC);
    }

    public boolean addNCC(NhaCungCap ncc) {
        return nccDA.addNCC(ncc);
    }

    public boolean updateNCC(NhaCungCap ncc) {
        return nccDA.updateNCC(ncc);
    }

    public boolean deleteNCC(int maNCC) {
        return nccDA.deleteNCC(maNCC);
    }
}
