import java.net.ServerSocket;

public class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private String ngaySinh;
    private String lop;
    private double GPA;


    public SinhVien(String maSinhVien, String hoTen, String ngaySinh, String lop, double GPA){
        this.maSinhVien=maSinhVien;
        this.hoTen=hoTen;
        this.ngaySinh=ngaySinh;
        this.lop = lop;
        this.GPA=GPA;
    }
    public void chuanHoa(){
        String [] arr = hoTen.split("\\s+");
        String res = "";
        for (String x : arr){
            res += Character.toUpperCase(x.charAt(0));
            for (int j = 1; j < x.length(); j++){
                res += Character.toLowerCase(x.charAt(j));
            }
            res += " ";
        }
        hoTen = res.trim();
    }

    public void chuanHoaNgaySinh(){
        StringBuilder sb = new StringBuilder(ngaySinh);
        if (sb.charAt(1) == '/')
            sb.insert(0, "0");
        if (sb.charAt(4) == '/')
            sb.insert(3,"0");
        ngaySinh = sb.toString();

    }
    public void inThongTin(){
        System.out.println(maSinhVien + " " + hoTen + " " + ngaySinh + " " + lop + " " + String.format("%.02f",GPA));
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", lop='" + lop + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}

