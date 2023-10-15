package bai1;

public class CongNhan extends CanBo {
	private int Bac;
  
  public CongNhan(String Name, int Tuoi, String GioiTinh, String DiaChi, int Bac) {
	  super(Name, Tuoi, GioiTinh, DiaChi);
	  this.Bac = Bac;
  }


  @Override
  public void hienThiThongTin() {
      System.out.println("Họ tên: " + Name);
      System.out.println("Tuổi: " + Tuoi);
      System.out.println("Giới tính: " + GioiTinh);
      System.out.println("Địa chỉ: " + DiaChi);
      System.out.println("Bậc: " + Bac);
}
}
