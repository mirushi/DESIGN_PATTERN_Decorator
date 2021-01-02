import java.util.List;

public abstract class BanhMi {
    protected String tenBanhMi;
    protected Double giaBanhMi;
    public void makeBanhMi () {
        //Hàm này sẽ tạo ra bánh mì cho khách hàng.
        //... Code tạo bánh mì cho khách hàng ...//
    }
    //Hàm tính tiền bánh mì.
    public Double tinhTien() {
        return giaBanhMi;
    }
}
