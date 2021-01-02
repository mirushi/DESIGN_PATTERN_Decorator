public class ThemThitNguoi extends Topping {
    public ThemThitNguoi(BanhMi banhMi) {
        super(banhMi);
        this.giaTopping = 10000d;
    }

    @Override
    public void makeBanhMi() {
        super.makeBanhMi();
        //Thêm thịt nguội vào bánh mì.
        // ... Code thêm thịt nguội vào bánh mì ... //
    }
}
