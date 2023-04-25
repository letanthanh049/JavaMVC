package Application.AppTier.Controller;

import Application.CodeTier.BL.ThongKeService;
import Application.AppTier.Model.ThongKe;

public class ThongKeController {

    public ThongKeService thongKeService = new ThongKeService();

    public ThongKe thongKe(int nam) {
        return thongKeService.getThongKe(nam);
    }

    public double getDoanhThuThang(int thang, int nam) {
        return thongKeService.getDoanhThuThang(thang, nam);
    }
}
