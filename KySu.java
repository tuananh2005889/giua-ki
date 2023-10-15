package bai1;

public class KySu extends CanBo {
	private String NganhDaoTao;
   
 public KySu(String Name, int Tuoi, String GioiTinh, String DiaChi, String nganhDaoTao) {
	super(Name, Tuoi, GioiTinh, DiaChi);
	this.NganhDaoTao = nganhDaoTao;
}
 @Override
 public void hienThiThongTin() {
     System.out.println("Họ tên: " + Name);
     System.out.println("Tuổi: " + Tuoi);
     System.out.println("Giới tính: " + GioiTinh);
     System.out.println("Địa chỉ: " + DiaChi);
     System.out.println("Ngành đào tạo: " + NganhDaoTao);
}
}
