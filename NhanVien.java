package bai1;

public class NhanVien extends CanBo {
	private String CongViec;
 
public NhanVien(String Name, int Tuoi, String GioiTinh, String DiaChi, String congViec) {
	super(Name, Tuoi, GioiTinh, DiaChi);
	this.CongViec = congViec;
}
@Override
public void hienThiThongTin() {
    System.out.println("Họ tên: " + Name);
    System.out.println("Tuổi: " + Tuoi);
    System.out.println("Giới tính: " + GioiTinh);
    System.out.println("Địa chỉ: " + DiaChi);
    System.out.println("cong viec: " + CongViec);
}

}
