package bai1;
import java.util.Scanner;


public abstract class CanBo {
	  protected String Name;
	  protected int Tuoi;
	  protected String GioiTinh;
 	  protected String DiaChi;
	public CanBo(String name, int tuoi, String gioiTinh, String diaChi) {
		super();
		Name = name;
		Tuoi = tuoi;
		GioiTinh = gioiTinh;
		DiaChi = diaChi;
	}
	 public abstract void hienThiThongTin();
	  
}
