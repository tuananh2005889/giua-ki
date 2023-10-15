package bai1;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        QLCB qlcanbo = new QLCB();
        Scanner scanner = new Scanner(System.in);

        int luaChon;
        do {
            System.out.println("----- Quản lý cán bộ -----");
            System.out.println("1. Thêm mới cán bộ");
            System.out.println("2. Tìm kiếm theo tên");
            System.out.println("3. Hiển thị danh sách cán bộ");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn: ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    scanner.nextLine(); // Đọc bỏ dòng new line sau khi đọc số nguyên
                    System.out.print("Nhập họ tên: ");
                    String hoTen = scanner.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int tuoi = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập giới tính: ");
                    String gioiTinh = scanner.nextLine();
                    System.out.print("Nhập địa chỉ: ");
                    String diaChi = scanner.nextLine();
                    System.out.print("Loại cán bộ (1-Công nhân, 2-Kỹ sư, 3-Nhân viên): ");
                    int loaiCanBo = scanner.nextInt();

                    switch (loaiCanBo) {
                        case 1:
                            System.out.print("Nhập bậc: ");
                            int bac = scanner.nextInt();
                            qlcanbo.themCanBo(new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac));
                            break;
                        case 2:
                            scanner.nextLine(); // Đọc bỏ dòng new line sau khi đọc số nguyên
                            System.out.print("Nhập ngành đào tạo: ");
                            String nganhDaoTao = scanner.nextLine();
                            qlcanbo.themCanBo(new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao));
                            break;
                        case 3:
                            scanner.nextLine(); // Đọc bỏ dòng new line sau khi đọc số nguyên
                            System.out.print("Nhập công việc: ");
                            String congViec = scanner.nextLine();
                            qlcanbo.themCanBo(new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec));
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ.");
                            break;
                    }
                    break;
                case 2:
                    scanner.nextLine(); // Đọc bỏ dòng new line sau khi đọc số nguyên
                    System.out.print("Nhập tên cần tìm kiếm: ");
                    String tenCanTim = scanner.nextLine();
                    qlcanbo.timKiemTheoTen(tenCanTim);
                    break;
                case 3:
                    qlcanbo.hienThiDanhSachCanBo();
                    break;
                case 4:
                    qlcanbo.thoatKhoiChuongTrinh();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        } while (luaChon != 4);
    }
}