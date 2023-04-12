package Application.AppTier.Controller;

import Application.CodeTier.BL.ThongKeService;
import Application.AppTier.Model.ThongKe;

import java.util.ArrayList;

/**
 * @author User
 */
public class ThongKeController {

    public ThongKeService thongKeDA = new ThongKeService();
    private ArrayList<Double> doanhThuThang;

    public ThongKe thongKe(int nam) {
        return thongKeDA.getThongKe(nam);
    }

    public double getDoanhThuThang(int thang, int nam) {
        return thongKeDA.getDoanhThuThang(thang, nam);
    }
}
