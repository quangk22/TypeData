package basic.dev;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullName = "Trịnh Ngọc Quang", nameSchool = "Hueic", nameCar = "Toyota", cmnd = "123456789",
				diaChi = "TTT Huế", tenLop = "22CD", hang = "Toyota", mauSon = "Xanh ", maSinhvien = "22060202";
		int phoneNumber = 11111111;
		float dtb = 9f;
		double luong = 15000000, gia = 15250000;		

		// thông tin sinh viên
		System.out.println("Thông tin sin viên");
		System.out.println("Tên :" + fullName);
		System.out.println("Mã sinh viên :" + maSinhvien);
		System.out.println("Chứng minh nhân dân :" + cmnd);
		System.out.println("Tên trường : " + nameSchool);
		System.out.println("Điểm trung bình : " + dtb);
		System.out.println("---------------------------");

		// Thông tin công nhân
		System.out.println("Thông tin công nhân");
		System.out.println("tên" + fullName);
		System.out.println("Địa chỉ : " + diaChi);
		System.out.println("Số điện thoại : " + phoneNumber);
		System.out.println("Hệ lương : " + luong);

		System.out.println("---------------------------");
		// Thông tin một chiếc xe
		System.out.println("Thông tin một chiếc xe");
		System.out.println("Tên : " + nameCar);
		System.out.println("Hãng : " + hang);
		System.out.println("Giá : " + gia);
		System.out.println("Màu sơn : " + mauSon);

	}

}