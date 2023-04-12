package Application.CodeTier.BL;

import Application.AppTier.Model.GiamGia;
import Application.CodeTier.DAL.GiamGiaDA;
import java.util.ArrayList;

public class GiamGiaService {

    private GiamGiaDA ggDA = new GiamGiaDA();

    public ArrayList<GiamGia> getDanhSachMaGiam() {
        ArrayList<GiamGia> dsgg = ggDA.getDanhSachMaGiam();
        return dsgg;
    }

    public boolean themMaGiam(GiamGia gg) {
        return ggDA.themMaGiam(gg);
    }

    public boolean suaMaGiam(GiamGia gg) {
        return ggDA.suaMaGiam(gg);
    }
}
