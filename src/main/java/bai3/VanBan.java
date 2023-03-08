package bai3;
import java.io.*;
import java.util.*;
public class VanBan {
    private String noidung;

    public VanBan() {
    }

    public VanBan(String noidung) {
        this.noidung = noidung;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public int demsoluongchu()
    {
        return noidung.length();
    }
    public void hoaToUpperCase()
    {
        System.out.println(noidung.toUpperCase());
    }
    public void thuongtoLowerCase()
    {
        System.out.println(noidung.toLowerCase());
    }
    public void chuDauTienHoa()
    {
        noidung=noidung.replaceAll("\\s+"," ");
        String[] arr = noidung.split(" ");
        String stringfromclient1 = "";
        for (String x : arr) {
            stringfromclient1 = stringfromclient1 + (x.substring(0, 1).toUpperCase() + x.substring(1));
            stringfromclient1 = stringfromclient1 + " ";
        }
        System.out.println(stringfromclient1);
    }
    public void chuanhoaxau()
    {
        noidung=noidung.replaceAll("\\s+"," ");
        System.out.println(noidung);
    }


}
