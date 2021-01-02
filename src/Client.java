public class Client {
    public static void main(String[] args) {
        //Nhận order của khách hàng.
        //Tạo ra một bánh mì theo order của khách hàng.
        BanhMi banhMiThitNguoi = new BanhMiThitNguoi();

        //Thêm tương ớt cho khách hàng.
        banhMiThitNguoi = new ThemTuongOt(banhMiThitNguoi);

        //Thêm thịt nguội cho khách hàng.
        banhMiThitNguoi = new ThemThitNguoi(banhMiThitNguoi);

        //Tính tiền cho khách hàng.
        System.out.println("Tong tien cua quy khach: " + banhMiThitNguoi.tinhTien());
    }
}
