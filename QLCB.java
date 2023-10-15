package bai1;
import java.util.ArrayList;
import java.util.List;

public class QLCB {
    private List<CanBo> danhSachCanBo;

    public QLCB() {
        danhSachCanBo = new ArrayList<>();
    }

    public void themCanBo(CanBo canBo) {
        danhSachCanBo.add(canBo);
    }

    public void timKiemTheoTen(String ten) {
        boolean timThay = false;
        for (CanBo canBo : danhSachCanBo) {
            if (canBo.Name.equalsIgnoreCase(ten)) {
                canBo.hienThiThongTin();
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Không tìm thấy cán bộ có tên " + ten);
        }
    }

    public void hienThiDanhSachCanBo() {
        if (danhSachCanBo.isEmpty()) {
            System.out.println("Danh sách cán bộ trống.");
        } else {
            for (CanBo canBo : danhSachCanBo) {
                canBo.hienThiThongTin();
                System.out.println("--------------");
            }
        }
    }
    public void thoatKhoiChuongTrinh() {
        System.exit(0);
    }
}
            		