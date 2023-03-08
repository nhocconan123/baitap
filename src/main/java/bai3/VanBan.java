package bai3;

public class VanBan {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';
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

    public void demsoluongchu()
    {
        System.out.println(countWords(noidung));
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

    public static int countWords(String input) {
        if (input == null) {
            return -1;
        }
        int count = 0;
        int size = input.length();
        boolean notCounted = true;
        for (int i = 0; i < size; i++) {
            if (input.charAt(i) != SPACE && input.charAt(i) != TAB
                    && input.charAt(i) != BREAK_LINE) {
                if(notCounted) {
                    count++;
                    notCounted = false;
                }
            } else {
                notCounted = true;
            }
        }
        return count;
    }
}
