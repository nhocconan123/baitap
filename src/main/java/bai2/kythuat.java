package bai2;

public class kythuat extends  NhanVien{
    private String chuyenNghanh;

    public kythuat(String maNhanVien, String hoTen) {
        super(maNhanVien, hoTen);
    }


    public kythuat(String maNhanVien, String hoTen, String namSinh, String diaChi, String chuyenNghanh) {
        super(maNhanVien, hoTen, namSinh, diaChi);
        this.chuyenNghanh = chuyenNghanh;
    }
    public kythuat(String maNhanVien, String hoTen, String chuyenNghanh) {
        super(maNhanVien, hoTen);
        this.chuyenNghanh = chuyenNghanh;
    }

    @Override
    public String moTaCongViec() {
        return "code";
    }

    @Override
    public String toString() {
        return "kythuat{" +super.toString()+
                "chuyenNghanh='" + chuyenNghanh + '\'' +
                '}';
    }
}
