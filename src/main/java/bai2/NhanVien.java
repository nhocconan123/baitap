package bai2;

public abstract class NhanVien {
    private String MaNhanVien;
    private String hoTen;
    private String namSinh;
    private String diaChi;

    public NhanVien(String maNhanVien, String hoTen) {
        MaNhanVien = maNhanVien;
        this.hoTen = hoTen;
    }

    public NhanVien(String maNhanVien, String hoTen, String namSinh, String diaChi) {
        MaNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "MaNhanVien='" + MaNhanVien + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", namSinh='" + namSinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
    public  abstract String moTaCongViec();
}
