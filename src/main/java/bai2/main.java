package bai2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        NhanVien kt1= new kythuat("sdv123","duong dinh huy","02/06/1998","thai nguyen","cnt");
        System.out.println(kt1);
        System.out.println(kt1.moTaCongViec());
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap ma nha vien");
        String maNhanVien=sc.nextLine();
        System.out.println("nhap ho ten");
        String hoTen=sc.nextLine();
        System.out.println("nhap vao ngay thang nam sinh");
        String namSinh= sc.nextLine();
        System.out.println("nhap vao dia chi");
        String diachi=sc.nextLine();
        System.out.println("nhap vao chuyen nganh");
        String chuyenNganh= sc.nextLine();

        NhanVien kt2= new kythuat(maNhanVien,hoTen,namSinh,diachi,chuyenNganh);
        System.out.println(kt2);
        System.out.println(kt2.moTaCongViec());
    }
}
