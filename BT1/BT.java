public class SinhVien {
    // 1. Thuộc tính đối tượng (instance variables)
    private String maSv;
    private String hoTen;
    private int tuoi;

    // 2. Thuộc tính tĩnh (static variable)
    private static int soLuong = 0;

    // Constructor
    public SinhVien() {
        soLuong++; // Mỗi lần tạo sinh viên thì tăng số lượng
    }

    // 3. Phương thức
    // setThongTin
    public void setThongTin(String maSv, String hoTen, int tuoi) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    // hienThiThongTin
    public void hienThiThongTin() {
        System.out.println("Mã SV: " + maSv);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
    }

    // hienThiSoLuong (static)
    public static void hienThiSoLuong() {
        System.out.println("Tổng số sinh viên: " + soLuong);
    }

    // Main để test
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        sv1.setThongTin("SV001", "Nguyen Van A", 20);

        SinhVien sv2 = new SinhVien();
        sv2.setThongTin("SV002", "Tran Thi B", 21);

        sv1.hienThiThongTin();
        System.out.println("-------------------");
        sv2.hienThiThongTin();

        System.out.println("===================");
        SinhVien.hienThiSoLuong();
    }
}
