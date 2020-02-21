package tonhi.com.test;

import tonhi.com.model.NhanVien;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien(1, "Obama");
		NhanVien nv2 = new NhanVien(2, "Putin");
		nv1=nv2;
		nv2.setTen("Kim Jong Un");
		System.out.println("Tên nhân viên 1= "+nv1.getTen());
		nv1.setTen("Tố Nhi");
		System.out.println("Tên nhân viên 2= "+nv2.getTen());
		NhanVien nv3 =new NhanVien(3, "Tèo");
		NhanVien nv4 = new NhanVien(4, "Tí");
		nv3=nv4.copy();
		System.out.println("Tên nhân viên 3="+nv3.getTen());
		nv4.setTen("Lan");
		System.out.println("Tên nhân viên 3="+nv3.getTen());
		nv3.setTen("Hương");
		System.out.println("Tên nhân viên 4="+nv4.getTen());
	}

}
