package Application.CodeTier.BL;

import Application.AppTier.Model.HoaDon;
import Application.CodeTier.DAL.HoaDonDA;

import java.sql.*;
import java.util.ArrayList;

public class HoaDonService {
    
    private HoaDonDA hdDA = new HoaDonDA();
    
    public ArrayList<HoaDon> getListHoaDon() {
        ArrayList<HoaDon> dshd = hdDA.getListHoaDon();
        return dshd;
    }

    public boolean addHoaDon(HoaDon hd) {
        return hdDA.addHoaDon(hd);
    }

    public int getMaHoaDonMoiNhat() {
        return hdDA.getMaHoaDonMoiNhat();
    }

    public ArrayList<HoaDon> getListHoaDon(Date dateMin, Date dateMax) {
        ArrayList<HoaDon> dshd = hdDA.getListHoaDon(dateMin, dateMax);
        return dshd;
    }
}
