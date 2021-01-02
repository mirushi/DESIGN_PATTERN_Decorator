public class ThemTuongOt extends Topping {

    public ThemTuongOt(BanhMi banhMi) {
        super(banhMi);
        this.giaTopping = 1000d;
    }

    @Override
    public void makeBanhMi() {
        super.makeBanhMi();
        //Thêm tươnng ớt vào bánh mì.
        // ... Code thêm tương ớt vào bánh mì ... //
    }
}
