package bai3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap vao noi dung cua van ban");
        String noidung=sc.nextLine();
        VanBan vb=new VanBan(noidung);
        System.out.println("so tu cua chuoi la: ");
        vb.demsoluongchu();
        System.out.println(" chuan hoa xau khong co ky tu trang o giau xau");
        vb.chuanhoaxau();
        System.out.println("chuan hoa van ban thanh chu viet hoa");
        vb.hoaToUpperCase();
        System.out.println("chuan hoa van ban thanh chu viet thong");
        vb.thuongtoLowerCase();
        System.out.println("viet hoa toan bo chu cai dau tien cua moi tu trong van ban");
        vb.chuDauTienHoa();
    }
}
