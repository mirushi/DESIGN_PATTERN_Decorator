public abstract class Topping extends BanhMi {
    protected BanhMi banhMi;
    protected Double giaTopping;

    //Tạo ra một Topping mới dựa trên bánh mì sẵn có.
    public Topping (BanhMi banhMi) {
        this.banhMi = banhMi;
    }

    //Gọi đến hàm makeBanhMi của Component.
    @Override
    public void makeBanhMi() {
        banhMi.makeBanhMi();
    }

    @Override
    public Double tinhTien() {
        return banhMi.tinhTien() + giaTopping;
    }
}
